import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 引数を取得
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        sc.close();

        // DP 配列全体を「DP の種類に応じた初期値」で初期化
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // 初期条件を入力
        dp[0] = 0;

        // ループを回す
        for (int i = 1; i < n; i++) {
            int a = dp[i - 1] + Math.abs(h[i] - h[i - 1]);
            if (dp[i] > a) {
                dp[i] = a;
            }

            if (i > 1) {
                int b = dp[i - 2] + Math.abs(h[i] - h[i - 2]);
                if (dp[i] > b) {
                    dp[i] = b;
                }
            }
        }

        // テーブルから解を得て出力
        System.out.println(dp[n - 1]);
    }
}
