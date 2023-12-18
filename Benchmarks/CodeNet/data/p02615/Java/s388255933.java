import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Long.max;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static void solve() throws Exception {
        int n = scanInt();
        long[] a = new long[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanLong();
        }
        Arrays.sort(a);
        if (a.length == 2) {
            out.print(max(a[0], a[1]));
            return;
        }
        for (int i = n / 2 + 1; i < n; i++) {
            ans += a[i];
        }
        for (int i = 0; i < n / 2; i++) {
            if (n % 2 == 0 && i + 1 < n / 2) {
                ans += a[n - 2 - i];
            } else {
                ans += a[n - 1 - i];
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
        }
        catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}