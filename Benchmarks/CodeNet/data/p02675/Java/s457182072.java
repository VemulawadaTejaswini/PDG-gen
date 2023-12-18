
import java.util.*;
import java.io.*;
import java.math.*;


class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        
        int d=n%10;
        
        
        if(d==3)
        {
        	System.out.println("bon");
        }
        else if(d==0 || d==1 || d==6 || d==8)
        {
        	System.out.println("pon");
        }
        else 
        {
        	System.out.println("hon");
        }

    }
}