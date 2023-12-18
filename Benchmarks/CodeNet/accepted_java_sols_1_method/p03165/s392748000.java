import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }

        int sI = s.length();
        int tI = t.length();

        StringBuilder builder = new StringBuilder(dp[sI][tI]);

        while (dp[sI][tI] > 0) {
            if (dp[sI][tI] == dp[sI - 1][tI]) {
                sI--;
            } else if (dp[sI][tI] == dp[sI][tI - 1]) {
                tI--;
            } else {
                builder.insert(0, t.charAt(tI - 1));
                tI--;
                sI--;
            }
        }

        System.out.println(builder);
    }
}