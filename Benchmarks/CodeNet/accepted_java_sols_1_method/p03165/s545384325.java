import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int N = s.length();
        int M = t.length();
        int[][] dp = new int[N + 1][M + 1];

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                } else {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1]);
                }
            }
        }
        List<Character> ansList = new ArrayList<>();
        int n = N - 1;
        int m = M - 1;
        while (n >= 0 && m >= 0) {
            if (s.charAt(n) == t.charAt(m)) {
                ansList.add(s.charAt(n));
                n--;
                m--;
            } else {
                if (dp[n + 1][m + 1] == dp[n][m + 1]) {
                    // case s.charAt(n) is not needed
                    n--;
                } else {
                    m--;
                }
            }
        }
        Collections.reverse(ansList);
        StringBuilder sb = new StringBuilder();
        for (Character c : ansList) {
            sb.append(c);
        }
        String ans = sb.toString();
        System.out.println(ans);
    }
}