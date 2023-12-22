import java.util.*;
import java.io.*;
class Main
{
  public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 0; i <= n; i++)
        {
            for(int j = 0; j <= m; j++)
            {
                if(i == 0 || j == 0)
                {
                    dp[i][j] = 0;
                }
                else if(str1.charAt(i-1) == str2.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        //System.out.println(dp[n][m]);
        StringBuffer res = new StringBuffer();
        int p = n, q = m;
        while(p > 0 && q > 0)
        {
            if(str1.charAt(p-1) == str2.charAt(q-1))
            {
                res.append(str1.charAt(p-1));
                p--;
                q--;
            }
            else if(dp[p][q] == dp[p-1][q])
            {
                p--;
            }
            else
            {
                q--;
            }
        }
        System.out.println(res.reverse());
    }
}