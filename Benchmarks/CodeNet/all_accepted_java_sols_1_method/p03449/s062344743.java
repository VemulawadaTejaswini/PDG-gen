import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < n; i++) {
            a2[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int result = 0;
        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j <= i; j++) {
                sum1 += a1[j];
            }
            for (int j = i; j < n; j++) {
                sum2 += a2[j];
            }
            int sum = sum1 + sum2;
            result = Math.max(result, sum);
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
