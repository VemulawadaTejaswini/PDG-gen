/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int [] a=new int [n-1];
		for(int i=0;i<n-1;i++)
		{
		    a[i]=in.nextInt();
		}
		int ans=a[n-2];
		for(int i=n-2;i>0;i--)
		{
		    ans=ans+Math.min(a[i],a[i-1]);
		}
		ans=ans+a[0];
		System.out.println(ans);
	}
}
