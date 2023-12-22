
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final double a = sc.nextInt();
        final double b = sc.nextInt();
        final double h = sc.nextInt();
        final double m = sc.nextInt();
        double h_deg = h * 360 / 12 + m * 360 / 12 / 60;
        double m_deg = m * 360 / 60;
        sc.close();
        double result = 0;
        result = Math.pow(
                (Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(Math.abs(h_deg - m_deg)))), 0.5);

        System.out.println(result);
    }
}