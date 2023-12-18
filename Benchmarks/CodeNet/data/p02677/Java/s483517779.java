import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), h = sc.nextDouble(), m = sc.nextDouble();
        double res = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(Math.abs(h * 30 + 0.5 * m - m * 6))));
        System.out.println(res);
    }
}
