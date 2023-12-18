import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
/* Name of the class has to be "Main" only if the class is public. */


/* Name of the class has to be "Main" only if the class is public. */
public class Main{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        String ss=s.next();
        if(t%2==1)
        System.out.println("No");
        else if(!ss.substring(0,t/2).equals(ss.substring(t/2,t)))
        System.out.println("No");
        else
        System.out.println("Yes");
      s.close();
        }
        }