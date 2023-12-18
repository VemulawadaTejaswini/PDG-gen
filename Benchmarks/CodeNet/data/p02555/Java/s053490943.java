//package Test;

import java.util.*;

public class Main {

    static class Solution {

        void solve(int s){
            if(s < 3) {
                System.out.println(0);
                return;
            }
            int mod = 1000000007;
            int[] dp = new int[s + 1];
            dp[3] = 1;
            for(int i = 4; i <= s; i++) {
                for(int j = 3; j <= i - 3; j++) {
                    dp[i] = (dp[i] + dp[j]) % mod;
                }
                dp[i] = (dp[i] + 1) % mod;
            }
            System.out.println(dp[s]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        Solution solution = new Solution();
        solution.solve(s);

    }
}
