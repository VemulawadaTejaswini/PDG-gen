import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
 { 
	
	public static void main (String[] args)
	 {
Scanner scan=new Scanner(System.in);

	    
	    int a=scan.nextInt();
	    int b=scan.nextInt();
	    int c=scan.nextInt();
	   int k=scan.nextInt();
	   int i=0;
	   int sum=0;
	   if(k>=a)
	  { sum+=a;
		  k=k-a;
	  }
	  else
	    {sum=k;
			k=0;
		}
		if(k>=b)
		k=k-b;
		else k=0;
		if(k>=c)
		sum=sum-c;
	    else sum=sum-k;
	   
	System.out.println(sum);
   
   }
	   
	 }

