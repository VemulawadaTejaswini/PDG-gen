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
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer[] a = new Integer[n];
		for(int i=0;i<n;++i) a[i] = sc.nextInt();
		Arrays.sort(a);
		long sum = 0;
		for(int i=0;i<n;++i){
			if(n-i > k)
			sum+=a[i];
		}
	
		 System.out.print(sum);
		
	}
}