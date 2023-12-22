import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 処理
        long[] mon = new long[n];
        for (int i = 0; i < n; i++) {
            mon[i] = sc.nextLong();
        }
        Arrays.sort(mon);

        long out = 0;
        if (k >= n) {
            out = 0;
        } else {
            for (int i = (n - 1 - k); i >= 0; i--) {
                out += mon[i];
            }
        }

        // 出力
        System.out.println(out);
    }
}