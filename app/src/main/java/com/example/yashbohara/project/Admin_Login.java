package com.example.yashbohara.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Admin_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin__login);
    }
   public void Login_Clicked(View view) {
    EditText e31=(EditText) findViewById(R.id.e31);
    EditText e32=(EditText) findViewById(R.id.e32);

        if (e31.getText().toString().equals("Admin"))
            {
                if (e32.getText().toString().equals("Password"))
                {
                    Intent intent = new Intent(this, Admin_Functions.class);
                    this.finish();
                    startActivity(intent);
                }
                else{
                        Toast.makeText(this,"Wrong Password",Toast.LENGTH_LONG).show();
                    }
            }
        else{
    Toast.makeText(this,"Wrong Id",Toast.LENGTH_LONG).show();
        }
    }
    public void UploadNotice_Clicked(View view)
    {
        
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}