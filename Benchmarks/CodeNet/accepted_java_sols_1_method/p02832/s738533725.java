import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{

    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int count=0;
		boolean flag=false;
		int j=1;
		for(int i=0;i<n;i++)
		{if(a[i]==j)
		{j++;flag=true;}
		else
		count++;}
	if(flag)
		System.out.println(count);
		else
		{System.out.println("-1");}
	}}