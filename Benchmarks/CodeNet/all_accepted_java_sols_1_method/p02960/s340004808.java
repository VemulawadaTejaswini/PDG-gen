import java.util.*;

public class Main {

    static long mod = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        long[][] dp = new long[n+1][13];
        dp[0][0] = 1;
        int r = 1;
        for (int i = 1; i <= n; i++) {
            int idx = n - i;
            for (int j = 0; j < 10; j++) {
                if(s[idx] == '?' || Character.getNumericValue(s[idx]) == j){
                    int tr = (r * j) % 13;
                    for (int k = 0; k < 13; k++) {
                        dp[i][(k+tr)%13] = (dp[i][(k+tr)%13] + dp[i-1][k]) %mod;
                    }
                }
            }
            r = r*10%13;
        }
        System.out.println(dp[n][5]);
        sc.close();

    }

}
