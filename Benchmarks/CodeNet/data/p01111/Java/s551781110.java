import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static long ans = 0, low = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long n = in.nextInt();
        while (n > 0) {
            ans = 0;
            low = 0;
            long d = 2 * n;
            for (int i = 1; i * i <= d; i++) {
                if (d % i != 0) continue;

                calc(i, d / i);
                calc(d / i, i);
            }
            out.println(low + " " + ans);

            n = in.nextInt();
        }
        out.flush();
    }

    private static void calc(long x, long y) {
        //System.out.println("x=" + x + " y=" + y);
        if ((x - y + 1) % 2 != 0 || (x + y - 1) % 2 != 0) return;
        long b = (x + y - 1) / 2, a = (x - y + 1) / 2;
        if (b < 1 || a < 1) return;
        //System.out.println("a=" + a + " b=" + b);
        if (b - a + 1 > ans) {
            ans = b - a + 1;
            low = a;
        }
    }

}

