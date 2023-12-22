import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int h[] = new int[n];
        int dp[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        
        for (int i = 1; i < n; i++) {
            if (i == 1) {
                dp[i] = Math.abs(h[i] - h[i-1]);
            } else {
                dp[i] = Math.min(dp[i-1] + Math.abs(h[i-1] - h[i]), dp[i-2] + Math.abs(h[i-2] - h[i]));
            }
        }
        
        System.out.println(dp[n-1]);
    }
}
