import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = Integer.parseInt(in.next());
            double a[] = new double[n];
            int cnt = 0;
            int pear = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Double.parseDouble(in.next());
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (BigDecimal.ZERO.compareTo(new BigDecimal(a[i] * a[j]).remainder(BigDecimal.ONE)) == 0) {
                        cnt++;
                        if (a[i] == a[j]) {
                            pear++;
                        }
                    }
                }
            }
            out.println(cnt - pear);
        }

    }
}

