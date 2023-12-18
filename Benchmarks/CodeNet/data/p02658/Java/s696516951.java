import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author CompuWare
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BMultiplication2 solver = new BMultiplication2();
        solver.solve(1, in, out);
        out.close();
    }

    static class BMultiplication2 {
        static final BigInteger FI = new BigInteger("1000000000000000000");

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            BigInteger res = new BigInteger("1");
            for (int i = 0; i < a; i++) {
                res = res.multiply(in.nextBigInteger());
            }
            if (res.compareTo(FI) > 0) {
                out.print("-1");
            } else
                out.print(res);
        }

    }
}

