import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble(), m = sc.nextDouble(), d = sc.nextDouble();
        long nn = (long) n, dd = (long) d;

        double count = 2 * (n - d);
        double temp = count / (n * n);
        if (d == 0) temp = 1 / n;
        System.out.println((m - 1.0) * temp);
    }
}
