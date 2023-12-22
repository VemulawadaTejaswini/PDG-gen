/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		int sum=0;
		for(int ele:a)sum+=ele;
		double min = ((double)sum)/(4*m);
		int sat = 0;
		for(double ele:a)if(ele>=min)sat++;
		String ans = ((sat>=m)?"Yes":"No");
		System.out.println(ans);
	}
}