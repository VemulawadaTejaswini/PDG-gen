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
        CurryMaking solver = new CurryMaking();
        solver.solve(1, in, out);
        out.close();
    }

    static class CurryMaking {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int r0 = in.nextInt(), w0 = in.nextInt(), c = in.nextInt(), r = in.nextInt();
            while (r0 != 0 && w0 != 0 && c != 0 && r != 0) {
                int ans = 0;
                while (r0 < c * w0) {
                    r0 += r;
                    ans++;
                }
                out.println(ans);

                r0 = in.nextInt();
                w0 = in.nextInt();
                c = in.nextInt();
                r = in.nextInt();
            }
        }

    }
}


