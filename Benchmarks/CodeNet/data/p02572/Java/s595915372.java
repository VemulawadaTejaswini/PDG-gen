import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Long[] a = new Long[n];
        long sum = 0;
        final long MOD = 1000000007L;
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(sc.next());
            for (int j = 0; j < i; j++) {
                sum += a[i] * a[j];
                sum %= MOD;
            }
        }
        sc.close();

        // 主処理
        long result = sum;

        // 出力
        System.out.println(result);
    }
}
