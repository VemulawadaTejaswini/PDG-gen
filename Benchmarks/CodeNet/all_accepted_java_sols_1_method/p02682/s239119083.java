
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final int c = sc.nextInt();
        final int k = sc.nextInt();
        sc.close();
        int result = 0;
        if (a >= k) {
            result = k;
        } else if (b >= k - a) {
            result = a;
        } else if (c >= k - b - a) {
            result = 2 * a + b - k;
        }

        System.out.println(result);
    }
}
