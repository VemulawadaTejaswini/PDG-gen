import java.util.*;

public class Main {
    static long mod = 1000000007;

    public static double calc(double x) {
        if (x <= 1.0) {
            return 1.0;
        } else {
            return Math.pow(0.5, Math.ceil(Math.log(x) / Math.log(2)));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double res = 0.0;

        for (int i = 1; i <= n; ++i) {
            // System.out.println(String.format("%d: %f", i, Math.log(k / (double)i) / Math.log(2)));
            res += (calc(k / (double)i) / n);
        }
        System.out.println(res);
    }
}
