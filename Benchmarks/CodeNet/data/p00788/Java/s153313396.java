import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int p = sc.nextInt();
            int n = sc.nextInt();
            if ((n | p) == 0)
                break;
            Rational max = new Rational(1, n);
            Rational min = new Rational(n, 1);
            double rp = Math.sqrt(p);
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int a = i;
                    int b = j;
                    int d = gcd(a, b);
                    a /= d;
                    b /= d;
                    Rational r = new Rational(a, b);
                    if (rp > r.v && max.compareTo(r) < 0) {
                        max = r;
                        continue;
                    }
                    if (rp < r.v && min.compareTo(r) > 0) {
                        min = r;
                        continue;
                    }

                }
            }
            System.out.println(min + " " + max);
        }
    }

    int gcd(int a, int b) {
        if (a < b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        }
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}

class Rational {
    int a;
    int b;
    double v;
    static double EPS = 1.0e-10;

    Rational(int a, int b) {
        this.a = a;
        this.b = b;
        this.v = 1.0 * a / b;
    }

    public boolean equals(Object o) {
        Rational r = (Rational) o;
        return r.a == a && r.b == b;
    }

    public int hashCode() {
        return Integer.parseInt(a + "0" + b);
    }

    public int compareTo(Rational r) {
        if (Math.abs(v - r.v) < EPS)
            return 0;
        else if (v - r.v > 0) {
            return 1;
        } else
            return -1;
    }

    public String toString() {
        return a + "/" + b;
    }
}