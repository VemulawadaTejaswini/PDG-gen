import java.util.*;
import java.util.stream.*;

public class Main {
    public static final long MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        long[][] dp = new long[s.length()+1][4];
        for(int i = s.length(); 0 <= i; i--) {
            for(int j = 3; 0 <= j; j--) {
                if(i == s.length()) {
                    dp[i][j] = j == 3 ? 1L : 0L;
                } else {
                    dp[i][j] = dp[i+1][j] * (s.charAt(i) == '?' ? 3L : 1L);
                    if(j < 3 && (s.charAt(i) == '?' || s.charAt(i) == "ABC".charAt(j))) {
                        dp[i][j] += dp[i+1][j+1];
                    }
                    dp[i][j] %= MOD;
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}