import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int weight = sc.nextInt();
        int[] w = new int[n+1];
        int[] v = new int[n+1];
        int sum = 0;
        long INF = 1000000000000L;
        for(int i=1;i<w.length;i++)
        {
        	w[i] = sc.nextInt();
        	v[i] = sc.nextInt();
        	sum = sum + v[i];
        }

        long[][] dp = new long[n+1][sum+1];

        Arrays.fill(dp[0],INF);
        dp[0][0] = 0L;
        for(int i=1;i<dp.length;i++)
        {
        	Arrays.fill(dp[i],INF);
        	dp[i][0] = 0L;
        	for(int j=1;j<dp[i].length;j++)
        	{
        		
        		if(j-v[i]>=0)
        		{
        			dp[i][j] = Math.min(dp[i][j],dp[i-1][j-v[i]]+w[i]);
        		}
        		
        		dp[i][j] = Math.min(dp[i][j],dp[i-1][j]);
        	}
        }
        
        int ans  = 0;

        for(int i=dp[n].length-1;i>=0;i--)
        {
        	if(dp[n][i]<=weight)
        	{
        		ans = i;
        		break;
        	}	
        }

        System.out.println(ans);
       
 	}
}