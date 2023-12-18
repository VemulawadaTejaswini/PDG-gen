import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      String s[]=new String[n];
      int x[]=new int[4];
      for(int i=0;i<4;i++)
      {x[i]=0;}
      for(int i=0;i<n;i++)
      {s[i]=sc.nextLine();
      if(s[i]=="AC")
        ++x[0];
       if(s[i]=="WA")
        ++x[1];
       if(s[i]=="TLE")
        ++x[2];
       if(s[i]=="RE")
        ++x[3];
      }
      for(int i=0;i<4;i++)
      {
        if(i=0)
        System.out.println("AC x "+x[i]);
        if(i=1)
        System.out.println("WA x "+x[i]);
        if(i=2)
        System.out.println("TLE x "+x[i]);
        if(i=3)
        System.out.println("RE x "+x[i]);
      }
    }
}