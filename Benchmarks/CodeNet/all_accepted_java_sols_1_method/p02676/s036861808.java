
import java.util.*;
import java.io.*;
import java.math.*;


class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(br.readLine());
        String s=br.readLine();
        
        int l=s.length();
        
        if(l<=k)
        {
        	System.out.println(s);
        }
        else
        {
        	String s1=s.substring(0,k)+"...";
        	System.out.println(s1);
        }

    }
}