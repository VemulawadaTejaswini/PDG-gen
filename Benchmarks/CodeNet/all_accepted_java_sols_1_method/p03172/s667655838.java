import java.util.*;

public class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0 ; i< n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        long mod = 1000000007;
        long dp[][] = new long[n+1][k+1];
        for(int i = 0 ; i <= k ; i++)
        {
            dp[0][i] = 1;
        }
        
        for(int i = 1 ; i <= n ; i++)
        {
            for(int kk = 0 ; kk <= k ; kk++)
            {
                if(arr[i-1] >= kk)
                dp[i][kk] += dp[i-1][kk];
                
                else
                dp[i][kk] += dp[i-1][kk] - dp[i-1][kk-arr[i-1]-1];
                
                dp[i][kk] %= mod;
            }
            
            for(int kk = 1 ; kk <= k ; kk++)
            {
                dp[i][kk] += dp[i][kk-1];
                dp[i][kk] %= mod;
            }
        }
        if(k > 0)
        System.out.println((dp[n][k] - dp[n][k-1]+mod)%mod);
        
        else
        System.out.println(dp[n][k]);
    }
}