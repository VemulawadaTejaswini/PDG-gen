import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i=0; i<n;i++)
		{
		    p[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=1; i<n-1;i++)
		{
		    if(p[i-1]<p[i] && p[i]<p[i+1])
		        count++;
		    else if(p[i-1]>p[i] && p[i]>p[i+1])
		        count++;
		}
      	System.out.println(count);
	}
}