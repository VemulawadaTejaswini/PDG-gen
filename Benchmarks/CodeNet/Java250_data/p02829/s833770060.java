import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int q=Math.max(a,b);
		int p=Math.min(a,b);
		if(p==1 && q==3)
		System.out.println("2");
		else if(p==2 && q==3)
		System.out.println("1");
	    else if(p==1 && q==2)
	    System.out.println("3");
	}}