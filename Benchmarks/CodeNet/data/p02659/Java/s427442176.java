import java.math.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();

        long b = (long)(B * 100.0);

		double ans = A * b;
        ans /= 100;
        ans = Math.floor(ans);
        System.out.println(String.format("%.0f", ans));
    }
}