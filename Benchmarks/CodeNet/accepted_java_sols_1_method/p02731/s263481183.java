import java.math.BigDecimal;
import java.util.Scanner;

/**
 * TITLE : Maximum Volume
 * URL : https://atcoder.jp/contests/abc159/tasks/abc159_c
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double L = sc.nextDouble();
        sc.close();
        double x = L / 3;
        double y = L / 3;
        double z = L - x - y;
        BigDecimal a = new BigDecimal(String.valueOf(x));
        BigDecimal b = new BigDecimal(String.valueOf(y));
        BigDecimal c = new BigDecimal(String.valueOf(z));
        System.out.println(a.multiply(b).multiply(c));
    }
}