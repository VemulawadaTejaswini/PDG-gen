/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
		String s[]=bu.readLine().split(" ");
		int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),i;
		double tot=0,a[]=new double[n];;
		s=bu.readLine().split(" ");
		for(i=0;i<n;i++)
		{a[i]=Double.parseDouble(s[i]);
		tot+=a[i];}
		tot/=4.0*m;
		int c=0;
		for(i=0;i<n;i++)
		if(a[i]>=tot) c++;
		if(c>=m) System.out.print("Yes");
		else System.out.print("No");
	}
}