
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] = in.nextInt();

        }
        
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        dp[1] = Math.abs(a[0] - a[1]);
        
        for (int i = 2; i < n; i++) {
            
            
            int ind ;
            for (int j = 1; j <= k; j++) {
                
                ind = i - j;
                if (ind == -1) {
                    break;
                }
                dp[i] = Math.min(dp[i], Math.abs(a[i] - a[ind]) + dp[ind]);
                
            }
            
            
        }
        
        
        System.out.println(dp[n - 1]);
        
        
        
    }

}
