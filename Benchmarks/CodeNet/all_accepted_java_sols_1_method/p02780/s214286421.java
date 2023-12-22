import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int[] sum = new int[2000001];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + i;
        }

        double[] ev = new double[n];
        for (int i = 0; i < n; i++) {
            ev[i] = (double) sum[p[i]] / p[i];
        }

        double[] dp = new double[n + 1];
        for (int i = 0; i < k; i++) {
            dp[k - 1] += ev[i];
        }
        for (int i = k; i < n; i++) {
            dp[i] = dp[i - 1] - ev[i - k] + ev[i];
        }

        double result = Arrays.stream(dp).max().getAsDouble();

        // 出力
        System.out.println(result);
        sc.close();
    }
}
