/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int k=sc.nextInt();
	    int a[]=new int[n];
	    	    int b[]=new int[m];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	       }
	       for(int i=0;i<m;i++)
	    {
	        b[i]=sc.nextInt();
	       }
	       int z=0;
	       if(n>=m)
	       z=n;else z=m;
	       int x=0;int i=0,j=0;
	       while(k>0 && i<n && j<m)
	       {   
			   if(a[i]<b[j])
			   {
	           if(k-a[i]<0) break;
	           else {x++;k-=a[i];i++;continue;} 
			   }
			   if(a[i]>=b[j])
			   {
	           if(k-b[j]<0) break;
	           else {x++;k-=b[j];j++;} 
			   }   
		   }
		 
		 
		   if(i==n)
		   {while(k>0 && j<m)
			{
			if(k-b[j]<0) break;
			else {x++;k-=b[j];j++;} 
			}
		   }
		   else if(j==m)
		   {while(k>0 && i<n)
			{
			if(k-a[i]<0) break;
			else {x++;k-=a[i];i++;} 
			}
		   }
		   System.out.println(x);

	   }
}