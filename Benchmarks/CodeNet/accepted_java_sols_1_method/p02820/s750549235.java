import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int r = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        
        String str = sc.next();
        char[] c = str.toCharArray();
        
        int[][] dp = new int[n+1][3];
        
        for (int i = 0; i < k; i++) {
            if (c[i] == 'r') {
                dp[i+1][2] = p;
            } else if (c[i] == 's') {
                dp[i+1][0] = r;
            } else {
                dp[i+1][1] = s;
            }
        }
        
        for (int i = k; i < n; i++) {
            dp[i+1][0] = Math.max(dp[i-k+1][1], dp[i-k+1][2]);
            dp[i+1][1] = Math.max(dp[i-k+1][2], dp[i-k+1][0]);
            dp[i+1][2] = Math.max(dp[i-k+1][0], dp[i-k+1][1]);
            
            if (c[i] == 'r') {
                dp[i+1][2] += p;
            } else if (c[i] == 's') {
                dp[i+1][0] += r;
            } else {
                dp[i+1][1] += s;
            }
        }
        
        int ans = 0;
        for (int i = n; i >= n - k + 1; i--) {
            int max = Math.max(dp[i][0], Math.max(dp[i][1], dp[i][2]));
            ans += max;
        }
        System.out.println(ans);
        // for (int[] d : dp) {
            // System.out.println(Arrays.toString(d));
        // }
    }
}
