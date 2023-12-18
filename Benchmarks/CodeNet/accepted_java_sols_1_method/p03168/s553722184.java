import java.util.*;

public class Main  {

	

	static double[][] dp;
	static double[]arr;
	static int n;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	     n=sc.nextInt();
	    arr=new double[n];
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=sc.nextDouble();
	    	
	    }
	    dp=new double[n][n+1];
	    dp[0][0]=1-arr[0];
	    dp[0][1]=arr[0];
	    for(int i=1;i<n;i++)
	    {
	    	for(int j=0;j<=n;j++)
	    	{
	    		dp[i][j]=(1-arr[i])*dp[i-1][j];
	    		if(j>0)
	    		{
	    			dp[i][j]+=arr[i]*dp[i-1][j-1];
	    		}
	    		
	    	}
	    }
	    double ans=0;
	    for(int i=n/2+1;i<=n;i++)
	    {
	    	ans+=dp[n-1][i];
	    	
	    }
	    System.out.println(ans);
	}
	
	
	
}
