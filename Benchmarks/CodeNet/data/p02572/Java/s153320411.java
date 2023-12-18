import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Long[] a = new Long[n];
        Long[] cumulativeSum = new Long[n];

        a[0] = Long.parseLong(sc.next());
        cumulativeSum[0] = a[0];
        for (int i = 1; i < n; i++) {
            a[i] = Long.parseLong(sc.next());
            cumulativeSum[i] = a[i] + cumulativeSum[i - 1];
        }
        sc.close();

        // 主処理
        long sum = 0;
        final long MOD = 1000000007L;
        for (int i = 1; i < n; i++) {
            sum += cumulativeSum[i - 1] * a[i] % MOD;
            sum %= MOD;
        }
        long result = sum;

        // 出力
        System.out.println(result);
    }
}
