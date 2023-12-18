import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read input
        int n = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");
        int[] stones = new int[n+1];
        for (int i = 0; i < n; i++) {
            stones[i+1] = Integer.parseInt(split[i]);
        }
        
        // Compute answer
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;
        
        for (int i = 1; i < dp.length-1; i++) {

            dp[i+1] = Math.min(dp[i+1], dp[i] + Math.abs(stones[i] - stones[i+1]));
            
            if ((i+2) < dp.length)
                dp[i+2] = Math.min(dp[i+2], dp[i] + Math.abs(stones[i] - stones[i+2]));

        }

        // Print answer
        System.out.println(dp[n]);
    }
}