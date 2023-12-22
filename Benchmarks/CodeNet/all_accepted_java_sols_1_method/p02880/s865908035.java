
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int n = sc.nextInt();
        sc.close();
        String result = "No";
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (n == i * j) {
                    result = "Yes";
                }
            }
        }

        System.out.println(result);
    }
}
