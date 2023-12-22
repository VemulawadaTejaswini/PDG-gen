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
        BATCoder solver = new BATCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class BATCoder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String str = in.next();
            int n = str.length();
            int ans = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    String sliced = str.substring(i, j);
                    boolean flg = true;
                    for (int k = 0; k < sliced.length(); k++) {
                        char c = sliced.charAt(k);
                        if (c != 'A' && c != 'C' && c != 'G' && c != 'T') {
                            flg = false;
                            break;
                        }
                    }
                    if (flg) {
                        ans = Math.max(ans, sliced.length());
                    }
                }
            }
            out.println(ans);
        }

    }
}

