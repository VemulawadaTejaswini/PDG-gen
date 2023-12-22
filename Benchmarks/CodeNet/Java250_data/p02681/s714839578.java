
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final String s = sc.next();
        final String t = sc.next();
        sc.close();
        String result = "No";

        if (t.length() == s.length() + 1 && t.substring(0, s.length()).equals(s)) {
            result = "Yes";
        }

        System.out.println(result);
    }
}
