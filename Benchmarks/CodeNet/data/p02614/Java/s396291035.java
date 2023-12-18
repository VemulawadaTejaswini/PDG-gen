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
            int h = Integer.parseInt(in.next());
            int w = Integer.parseInt(in.next());
            int k = Integer.parseInt(in.next());
            char[][] c = new char[h][w];
            for (int i = 0; i < h; i++) {
                c[i] = in.next().toCharArray();
            }
            int ans = 0;

            for (int bith = 0; bith < (1 << h); ++bith) {
                for (int bitw = 0; bitw < (1 << w); ++bitw) {

                    int black = 0;
                    for (int i = 0; i < h; i++) {
                        if ((bith >> i) % 2 == 1) continue;
                        for (int j = 0; j < w; j++) {
                            if ((bitw >> j) % 2 == 1) continue;
                            if (c[i][j] == '#') black++;
                        }
                    }

                    if (black == k) ans++;
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

