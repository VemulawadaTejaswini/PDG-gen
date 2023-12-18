import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
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
            // 入力
            int D = Integer.parseInt(in.next());
            int[] c = new int[26];
            for (int i = 0; i < 26; i++) {
                c[i] = Integer.parseInt(in.next());
            }
            int[][] s = new int[D][27];
            for (int i = 0; i < D; i++) {
                for (int j = 0; j < 26; j++) {
                    s[i][j] = Integer.parseInt(in.next());
                }
            }

          int[] last = new int[26];
            for (int i = 0; i < D; i++) {
                int t = 0;
                int satisfy = -999999999;

                for (int j = 0; j < 26; j++) {
                    int manj = 0;
                    for (int k = 0; k < 26; k++) {
                        if (j == k) {
                            manj += s[i][j];
                        } else {
                            manj -= (c[k] * ((i + 1) - last[k]));
                        }
                    }

                    if (manj > satisfy || (manj == satisfy && c[j] > c[t])) {
                        satisfy = manj;
                        t = j;
                    }
                }

                last[t] = i + 1;
                System.out.println(t + 1);
            }
        }

    }
}

