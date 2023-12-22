import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final double varN = Integer.parseInt(sc.next());
        final double varX = Integer.parseInt(sc.next());
        final double varT = Integer.parseInt(sc.next());
        sc.close();

        int result = 0;
        result = (int) (Math.ceil(varN / varX) * varT);
        System.out.println(result);
    }
}