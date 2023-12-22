import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int varN = Integer.parseInt(sc.next());
        sc.close();

        int result = 0;
        result = 1000 - (varN % 1000);
        if (result == 1000) {
            result = 0;
        }
        System.out.println(result);
    }
}