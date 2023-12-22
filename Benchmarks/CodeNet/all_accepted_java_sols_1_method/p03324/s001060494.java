
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int d = sc.nextInt();
        final int n = sc.nextInt();
        sc.close();
        double result = 0;
        int nn = n;
        if (nn == 100) {
            nn = 101;
        }
        if (d == 0) {
            result = nn;
        } else {
            result = nn * Math.pow(100, d);
        }

        System.out.println((int) result);
    }
}
