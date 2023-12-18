import java.util.*;
// import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int[] a = new int[n];
	    int[] b = new int[n];
	    int[] c = new int[n];
	    int[][] dp = new int[n][3];
	    int last = 0;
	   // int i =0;
	   // List<node> order = new ArrayList<node>();
		for(int i=0;i<n;i++)
		{
		    a[i] = sc.nextInt();
		    b[i] = sc.nextInt();
		    c[i] = sc.nextInt();
		    if(i==0)
		        {dp[i][0] = a[i];
		        dp[i][1] = b[i];
		        dp[i][2] = c[i];}
		    else{
		        dp[i][0] = a[i]+Math.max(dp[i-1][1],dp[i-1][2]);
		        dp[i][1] = b[i]+Math.max(dp[i-1][0],dp[i-1][2]);
		        dp[i][2] = c[i]+Math.max(dp[i-1][1],dp[i-1][0]);
		        
		    }
		}
		System.out.print(Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]));
	}
}
