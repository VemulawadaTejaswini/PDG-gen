import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        int search_target = 1;
        int out = 0;
        for (int i = 1; i <= n; i++) {
            if (a[i] == search_target) {
                search_target++;
                continue;
            } else {
                out++;
            }
        }
        if (out == n) {
            out = -1;
        }

        // 出力
        System.out.println(out);
    }
}