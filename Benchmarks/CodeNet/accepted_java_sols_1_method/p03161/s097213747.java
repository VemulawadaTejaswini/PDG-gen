import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n+1];
        
        for(int i = 1; i <= n; i++) h[i] = sc.nextInt();
        
        int[] dp = new int[n+1];
        
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[1] = 0;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= k; j++){
                if(i+j == n+1) break;
                
                dp[i+j] = Math.min(dp[i+j], dp[i] + Math.abs(h[i] - h[i+j]));
            }
        }
        
        System.out.println(dp[n]);
    }
}
