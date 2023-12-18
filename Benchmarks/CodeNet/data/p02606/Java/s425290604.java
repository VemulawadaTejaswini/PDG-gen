import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int parL = Integer.parseInt(sc.next());
        final int parR = Integer.parseInt(sc.next());
        final int pard = Integer.parseInt(sc.next());
        sc.close();
        int result = 0;

        for (int i = parL; i <= parR; i++) {
            if (i % pard == 0) {
                result++;
            }
        }

        System.out.println(result);
    }
}