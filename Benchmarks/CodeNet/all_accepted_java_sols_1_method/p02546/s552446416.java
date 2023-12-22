/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
// import java.math.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter ot=new PrintWriter(System.out);
            // int t=Integer.parseInt(br.readLine().trim());
            // // int total=0;
            // while(t-->0)
            // {
                
            // }
            String s=br.readLine().trim();
            if(s.charAt(s.length()-1)!='s')
            s+="s";
            else
            s+="es";
            ot.println(s);
            ot.close();
            br.close();
            
        } catch(Exception e){
            System.err.println("ERROR");
            return;
        }
    }
}
    