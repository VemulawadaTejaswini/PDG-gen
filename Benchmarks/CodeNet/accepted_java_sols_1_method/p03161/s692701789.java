import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read input
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);
        split = br.readLine().split(" ");
        int[] stones = new int[n+1];
        for (int i = 0; i < n; i++) {
            stones[i+1] = Integer.parseInt(split[i]);
        }
        
        // Compute answer
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;
        
        for (int i = 1; i < dp.length-1; i++) {

            int p = 1;
            while(p <= k && i + p < dp.length) {
                dp[i+p] = Math.min(dp[i+p], dp[i] + Math.abs(stones[i] - stones[i+p]));
                p++;
            }
    
        }

        // Print answer
        System.out.println(dp[n]);
    }
}