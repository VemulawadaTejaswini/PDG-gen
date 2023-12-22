/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{ 
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(System.out);
    static StringTokenizer st;
    
    static String next()
        {
            while(st==null || !st.hasMoreElements()) 
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
   static int gcd(int a,int b)
     {
       if(b==0)
        return a;
       else
        return gcd(b,a%b);
     }
  public static void main (String[] args) throws java.lang.Exception
   {
	try{
	   
		  int k=Integer.parseInt(next());
		  String s=next();
		  String td="...";
		  int len=s.length();
		  if(k>=len)
		    System.out.println(s);
		 else
		   System.out.println(s.substring(0,k)+td);
		 
	   }     
	catch(Exception e)
		 {}
	}
}
