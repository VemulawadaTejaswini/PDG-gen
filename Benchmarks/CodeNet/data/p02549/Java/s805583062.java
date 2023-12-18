/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static int totalWays(int n, int m)
	{
		// base case: invalid input
		if (n < 0) {
			return 0;
		}

		// base case: 1 way (with no steps)
		if (n == 0) {
			return 1;
		}

		int count = 0;
		for (int i = 1; i <= m; i++) {
			count += totalWays(n - i, m);
		}

		return count%998244353;
	}

	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    n--;
	    int m=sc.nextInt();
	    long sum=0;
	    for(int i=0;i<m;i++)
	    {
	        int a=sc.nextInt();
	        
	        int b=sc.nextInt();
	        sum+=totalWays(n,b);
	        sum-=totalWays(n,a-1);
	        sum%=998244353;
	        
	    }
	    //long sol=totalWays(sum);
	        System.out.println(sum);
	}
}
