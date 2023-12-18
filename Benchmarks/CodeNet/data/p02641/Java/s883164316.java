import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static void solve() throws Exception {
        int x = scanInt(), n = scanInt();
        if (n == 0) {
            System.out.println(x);
            return;
        }

        boolean o = true;
        List<Integer> p = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int t = scanInt();
            p.add(t);
            if (t == x) o = false;
        }

        if (o) {
            System.out.println(x);
            return;
        }

        int ans = x;
        for (int i = x-1; i >= 0; i--) {
            if (!p.contains(i)) {
                ans = i;
                break;
            }
        }

        for (int i = x+1; i < x+(x-ans); i++) {
            if (!p.contains(i)) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
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