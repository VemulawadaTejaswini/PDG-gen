import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("\\s");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        String[] ss = br.readLine().split("\\s");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(ss[i]);
        }
        double[][] dp = new double[n+1][k+1];
        double mod = Math.pow(10,9)+7;
        for(int j = 0; j <= k; j++)
        {
            dp[1][j] = (arr[0]>=j)?1:0;
        }
        for(int i = 2; i <= n; i++)
        {
            for(int j = 0; j <= k; j++)
            {
                if(j == 0)
                    dp[i][j] = dp[i-1][j];
                else
                {
                    dp[i][j] = (dp[i-1][j] + dp[i][j-1])%mod;
                    if(j-arr[i-1] > 0)
                    {
                        dp[i][j] = (dp[i][j] - dp[i-1][j-arr[i-1]-1] + mod)%mod;
                    }
                }
            }
        }
        System.out.println((int)dp[n][k]);
    }
}