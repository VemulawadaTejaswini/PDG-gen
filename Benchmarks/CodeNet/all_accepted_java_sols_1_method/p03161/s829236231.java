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
		int k = sc.nextInt();
	    int[] h = new int[n];
	    int[] dp = new int[n];
	   // int i =0;
	   // List<node> order = new ArrayList<node>();
		for(int i=0;i<n;i++)
		{
		    h[i] = sc.nextInt();
		    dp[i]= 2147483647;
		    if(i==0)
		        dp[i]=0;
		    else if(i==1)
		        dp[i] = dp[0]+Math.abs(h[i]-h[0]);
		    else
		        for(int j = 1;j<=k;j++)
		            dp[i] = Math.min(dp[i],i-j >=0?dp[i-j]+Math.abs(h[i]-h[i-j]):dp[i]);
		}
		System.out.print(dp[n-1]);
	}
}
