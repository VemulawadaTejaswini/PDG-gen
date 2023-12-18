import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    int d=sc.nextInt();
	    int lowmez=(int)Math.max(a,c);
      	int hig=(int) Math.min(b,d);
      
	  
	       
	        // your code goes here
		if(hig-lowmez>=0)
      System.out.println("Yes");
      else
	  System.out.println("No");
            
	    
	    
	}
}
