import java.math.BigDecimal;
        import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] x = new int[50];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        
        long[][][] dp = new long[51][51][3010];
        
        dp[0][0][0] = 1;
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= 2500; k++) {
                    dp[i + 1][j][k] += dp[i][j][k];
                    dp[i + 1][j + 1][k+x[i]] += dp[i][j][k];
                }
            }
 
        }
 
        long ans = 0;
        for (int j = 1; j <= n; j++) {
            ans += dp[n][j][j * a];
        }
        System.out.println(ans);
 
    }
 
}