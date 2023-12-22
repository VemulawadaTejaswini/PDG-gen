import java.util.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int wm = sc.nextInt();

        int[] w     = new int[n];
        long[] v    = new long[n];
        long[][] dp = new long[n + 1][wm+1];
        
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextLong();
        }
        
        for (int i = 0; i < n; i++) {
            for (int a = 0; a < wm; a++) {
                dp[i+1][a] = Math.max(dp[i+1][a], dp[i][a]);
                
                if (a + w[i] <= wm) {
                   dp[i + 1][a + w[i]] = Math.max(dp[i + 1][a + w[i]], dp[i][a] + v[i]);
                }
            }
        }
        
        long max = 0;
        for (long aaa : dp[n]) {
            if (max < aaa) max = aaa;
        }
        System.out.println(max);
    }
}
