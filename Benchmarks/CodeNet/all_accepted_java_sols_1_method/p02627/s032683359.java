
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final String s1 = sc.next();
        sc.close();
        String result = "a";
        if (Character.isUpperCase(s1.charAt(0))) {
            result = "A";
        }
        System.out.println(result);
    }
}
