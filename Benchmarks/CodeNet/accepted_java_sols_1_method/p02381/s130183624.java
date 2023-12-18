import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int n = sc.nextInt();
                if (n == 0) break;
                double s[] = new double[n];
                double m = 0;
                for (int i = 0; i < n; i++) {
                    s[i] = sc.nextDouble();
                    m += s[i];
                }
                m /= n;
                double v = 0;
                for (int i = 0; i < n; i++) {
                    s[i] = Math.pow(s[i]-m, 2);
                    v += s[i];
                }
                v /= n;
                double d = Math.pow(v, 0.5);
                System.out.println(d);
            }
        }
    }
}
