import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static void solve() throws Exception {
        int h = scanInt(), w = scanInt(), m = scanInt();
        int[][] map = new int[h][w];
        for (int i = 0; i < m; i++) {
            int hi = scanInt() - 1;
            int wi = scanInt() - 1;

            for (int j = 0; j < w; j++) {
                map[hi][j]++;
            }
            for (int j = 0; j < h; j++) {
                if (j != hi) {
                    map[j][wi]++;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (ans < map[i][j]) {
                    ans = map[i][j];
                }
            }
        }

        out.print(ans);
    }

    static int scanInt() throws IOException {
        return parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return parseLong(scanString());
    }

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        } catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}