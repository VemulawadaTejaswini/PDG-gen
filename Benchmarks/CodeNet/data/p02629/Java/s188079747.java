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
        String N = Long.toString(scanLong(),26);
        String ans = "";
        for (int i = 0; i < N.length(); i++) {
            switch (N.charAt(i)) {
            case  '1': ans += "a";break;
            case  '2': ans += "b";break;
            case  '3': ans += "c";break;
            case  '4': ans += "d";break;
            case  '5': ans += "e";break;
            case  '6': ans += "f";break;
            case  '7': ans += "g";break;
            case  '8': ans += "h";break;
            case  '9': ans += "i";break;
            case  'a': ans += "j";break;
            case  'b': ans += "k";break;
            case  'c': ans += "l";break;
            case  'd': ans += "m";break;
            case  'e': ans += "n";break;
            case  'f': ans += "o";break;
            case  'g': ans += "p";break;
            case  'h': ans += "q";break;
            case  'i': ans += "r";break;
            case  'j': ans += "s";break;
            case  'k': ans += "t";break;
            case  'l': ans += "u";break;
            case  'm': ans += "v";break;
            case  'n': ans += "w";break;
            case  'o': ans += "x";break;
            case  'p': ans += "y";break;
            case  'q': ans += "z";break;
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