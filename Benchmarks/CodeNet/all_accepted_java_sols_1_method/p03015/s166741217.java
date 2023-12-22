import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] l = sc.next().toCharArray();
        long mod = 1_000_000_007;
        long[] dp = new long[l.length+1];
        long[] dp2 = new long[l.length+1];
        dp[0] = 1L;
        dp2[0] = 1L;
        for (int i = 0; i < l.length; i++) {
            dp[i+1] = (dp[i] * 3) % mod;
            if(l[l.length - i -1] == '1') dp2[i+1] = (dp2[i] * 2 + dp[i]) % mod;
            else dp2[i+1] = dp2[i];
        }
        System.out.println((dp[l.length-1] + dp2[l.length-1]*2) % mod);
        sc.close();

    }

}
