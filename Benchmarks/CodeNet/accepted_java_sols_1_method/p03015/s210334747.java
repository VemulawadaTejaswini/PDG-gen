import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        long[][] dp = new long[100005][2];
        long mod = 1000000007;
        dp[0][0] = 1;
        for(int i = 1; i<=n; i++) {
            char digit = s.charAt(i-1);
            if(digit == '1') {
                dp[i][0] = (2*dp[i-1][0]) % mod;
                dp[i][1] = (3*dp[i-1][1] + dp[i-1][0]) % mod;
            } else {
                dp[i][0] = (dp[i-1][0]) % mod;
                dp[i][1] = (3*dp[i-1][1]) % mod;
            }
            //System.out.println(dp[i][0]+" "+dp[i][1]);
        }
        System.out.println((dp[n][0]+dp[n][1])%mod);
    }
}