import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        Arrays.sort(h);
        int result = 1000000000;
        for (int i = 0; i <= n - k; i++) {
            int min = h[i];
            int max = h[i + k - 1];
            result = Math.min(result, max - min);
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
