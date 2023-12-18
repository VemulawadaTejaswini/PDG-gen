import java.util.Scanner;

public class Main {
    final double EPS = 1.0e-10;
    final int INF = 1 << 28;
    int k;
    double p;
    double e;
    double t;

    void run() {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        double l = sc.nextInt();
        double r = sc.nextInt();
        p = sc.nextDouble();
        e = sc.nextDouble();
        t = sc.nextDouble();
        System.out.printf("%.10f\n", solve(0, l, r));
    }

    double solve(int n, double l, double r) {
        double h = (l + r) / 2;
        if (n == k) {
            if (Math.abs(t - h) <= e) {
                return 1;
            } else {
                return 0;
            }
        }
        if (r < t - e || t + e < l)
            return 0;
        else if (t - e <= l && r <= t + e)
            return 1;

        if (h > t) {
            return (1 - p) * solve(n + 1, l, h) + p * solve(n + 1, h, r);
        } else {
            return p * solve(n + 1, l, h) + (1 - p) * solve(n + 1, h, r);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}