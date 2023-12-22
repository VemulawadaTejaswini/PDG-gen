
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int k = sc.nextInt();
        final String s = sc.next();
        sc.close();

        String result = s;
        if (s.length() > k) {
            result = result.substring(0, k) + "...";
        }
        System.out.println(result);
    }
}