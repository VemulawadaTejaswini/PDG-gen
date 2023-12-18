import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] h = new int[n+1];
        
        for(int i = 1; i <= n; i++) h[i] = sc.nextInt();
        
        int[] dp = new int[n+1];
        
        dp[2] = Math.abs(h[1]-h[2]);
        
        for(int i = 3; i <= n; i++){
            dp[i] = Math.min(Math.abs(h[i-1] - h[i]) + dp[i-1], Math.abs(h[i-2] - h[i]) + dp[i-2]);
        }
        
        System.out.println(dp[n]);
    }
}
