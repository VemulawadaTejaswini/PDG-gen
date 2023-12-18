import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a1 = new int[n];
        Arrays.setAll(a1, i -> Integer.parseInt(sc.next()));
        int[] a2 = new int[n];
        Arrays.setAll(a2, i -> Integer.parseInt(sc.next()));

        // 主処理
        int[][] dp = new int[2][n];

        dp[0][0] = a1[0];
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + a1[i];
        }

        dp[1][0] = dp[0][0] + a2[0];
        for (int i = 1; i < n; i++) {
            dp[1][i] = Math.max(dp[0][i] + a2[i], dp[1][i - 1] + a2[i]);
        }

        int result = dp[1][n - 1];

        // 出力
        System.out.println(result);
        sc.close();
    }
}
