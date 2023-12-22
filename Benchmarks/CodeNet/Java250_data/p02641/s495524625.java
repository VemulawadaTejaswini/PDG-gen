import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        ABC170_c solver = new ABC170_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC170_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int X = in.nextInt();
            int N = in.nextInt();
            int p[] = new int[N];
            int mas[] = new int[110];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = Integer.MAX_VALUE;
            }
            for (int i = 0; i < N; i++) {
                p[i] = in.nextInt();
            }
            Arrays.sort(p);
            for (int i = 0; i < p.length; i++) {
                mas[p[i]] = p[i];
            }
            if (mas[X] == Integer.MAX_VALUE) {
                out.println(X);
                return;
            }
            int plus = 0;
            for (int i = X; i < mas.length; i++) {
                if (mas[i] == Integer.MAX_VALUE) {
                    plus = i;
                    break;
                }
            }
            int minus = 0;
            for (int i = X; i >= 0; i--) {
                if (mas[i] == Integer.MAX_VALUE) {
                    minus = i;
                    break;
                }
            }
            if (Math.abs(X - plus) >= Math.abs(X - minus)) {
                out.println(minus);
            } else {
                out.println(plus);
            }
        }

    }
}

