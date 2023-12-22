/**
 *
 * @author Daipayan Mukherjee
 * @Jadavpur University,Information Technology
 *
 */
import java.io.*;
import java.util.*;

public class Main {
    public static long MOD = 1000000007;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int k = Integer.parseInt(st[1]);
        String[] s = br.readLine().split(" ");
        int[] cap = new int[n];
        for(int i=0;i<n;i++){
            cap[i] = Integer.parseInt(s[i]);
        }
        long[][] dp = new long[n][k+1];
        
        long last = 0;
        for(int i=0;i<=k;i++){
            long consumed =  k-i;
            if(consumed<=cap[0])
                dp[0][i] = (last+1)%MOD;
            else
                dp[0][i] = last;
            
            last = dp[0][i];
        }
   
        for(int i=1;i<n;i++){
            for (int j = 0; j <=k; j++) {
                long low = j>0?dp[i-1][j-1]:0;
                long high = dp[i-1][Math.min(k,j+cap[i])];
                dp[i][j] = ((j>0?dp[i][j-1]:0) + (high-low+MOD)%MOD)%MOD;
                
            }
        }
        System.out.println(dp[n-1][0]);
    }
}
