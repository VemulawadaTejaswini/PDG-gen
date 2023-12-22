/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int res = 0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			res = res^arr[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print((res^arr[i])+" ");
		}
		sc.close();
	}
}
