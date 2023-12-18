import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int len = Math.max(s.length(), t.length());
        int[][] dp = new int[len + 1][len + 1];

        // dp
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            for (int j = 0; j < t.length(); j++) {
                char ct = t.charAt(j);
                if (cs == ct) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                }
                dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1],
                        Math.max(dp[i + 1][j], dp[i][j + 1]));
            }
        }
        // 復元
        StringBuilder ans = new StringBuilder();
        int i = s.length();
        int j = t.length();
        while (i > 0 && j > 0) {
            if (dp[i][j] == dp[i - 1][j]) {
                i--;
            } else if (dp[i][j] == dp[i][j - 1]) {
                j--;
            } else {
                ans.insert(0, s.charAt(i - 1));
                i--;
                j--;
            }
        }
        System.out.println(ans);
    }

}
