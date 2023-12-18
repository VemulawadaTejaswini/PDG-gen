import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int result = Integer.MAX_VALUE;
        for (int i = -100; i <= 100; i++) {
            int cost = 0;
            for (int num : a) {
                int diff = num - i;
                cost += diff * diff;
            }
            result = Math.min(result, cost);
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
