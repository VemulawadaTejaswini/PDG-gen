import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        boolean judge = true;
        if (1 < n) {
            for (int i = 0; i < h.length - 1; i++) {
                if (h[i + 0] <= h[i + 1] - 1) {
                    h[i + 1] -= 1;
                } else if (h[i + 0] != h[i + 1]) {
                    judge = false;
                    break;
                }
            }
        }
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
