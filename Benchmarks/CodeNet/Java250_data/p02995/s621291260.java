import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            Long a = Long.parseLong(in.next());
            Long b = Long.parseLong(in.next());
            Long c = Long.parseLong(in.next());
            Long d = Long.parseLong(in.next());

            Long G = gcd(c, d);
            Long L = c / G * d;
            Long ans1 = b - b / c - b / d + b / L;
            Long ans2 = (a - 1) - (a - 1) / c - (a - 1) / d + (a - 1) / L;

            // 出力
            out.println(ans1 - ans2);

        }

        public static long gcd(long num1, long num2) {
            if (num2 == 0) return num1;
            else return gcd(num2, num1 % num2);
        }

    }
}

