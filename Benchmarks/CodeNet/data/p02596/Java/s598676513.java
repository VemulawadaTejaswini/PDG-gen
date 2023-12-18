import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;

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
            int K = Integer.parseInt(in.next());
            if ((K & 1) != 1) {
                out.println(-1);
            } else {
                BigInteger sevenes = BigInteger.valueOf(Long.parseLong(String.format("%7" + String.valueOf(K).length() + "d", 7).trim()));
                while (true) {
                    if (sevenes.remainder(BigInteger.valueOf(K)).compareTo(BigInteger.ZERO) == 0) {
                        out.println(String.valueOf(sevenes).length());
                        break;
                    } else {
                        sevenes = sevenes.multiply(BigInteger.TEN).add(BigInteger.valueOf(7));
                    }
                }
            }
        }

    }
}

