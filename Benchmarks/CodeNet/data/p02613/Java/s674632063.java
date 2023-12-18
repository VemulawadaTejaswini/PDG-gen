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
        int n = scanInt();
        int ac = 0, wa = 0, tle = 0, re = 0;


        for (int i = 0; i < n; i++) {
            switch(scanString()) {
            case "AC":
                ac++;
                break;
            case "WA":
                wa++;
                break;
            case "TLE":
                tle++;
                break;
            case "RE":
                re++;
                break;
            }
        }
        out.println("AC x " + ac);
        out.println("WA x " + wa);
        out.println("TLE x " + tle);
        out.println("RE x " + re);
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