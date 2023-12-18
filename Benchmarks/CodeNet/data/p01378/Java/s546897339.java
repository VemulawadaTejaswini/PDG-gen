import java.io.*;
import java.util.*;

public class Main {
    void run() {
        String s = read();
        int p = s.indexOf("iwi");
        char[] left = s.substring(0, p).toCharArray();
        char[] right = s.substring(p + 3).toCharArray();
//        sysout.println("left " + new String(left));
//        sysout.println("right " + new String(right));
        int ans = 0;
        for (int i = 0; i < 1 << left.length; i++) {
            for (int j = 0; j < 1 << right.length; j++) {
                if (Integer.bitCount(i) != Integer.bitCount(j)) {
                    continue;
                }
                StringBuilder L = new StringBuilder();
                for (int k = 0; k < left.length; k++) {
                    if (((i >> k) & 1) != 0) {
                        L.append(left[k]);
                    }
                }
                StringBuilder R = new StringBuilder();
                for (int k = 0; k < right.length; k++) {
                    if (((j >> k) & 1) != 0) {
                        R.append(right[k]);
                    }
                }
//                sysout.println(L.toString() + " " + R.toString());
                int len = L.length();
                boolean f = true;
                for (int k = 0; k < len; k++) {
                    if (L.charAt(k) == '(' && R.charAt(len - 1 - k) != ')') f = false;
                    if (L.charAt(k) == ')' && R.charAt(len - 1 - k) != '(') f = false;
                    if (L.charAt(k) == '[' && R.charAt(len - 1 - k) != ']') f = false;
                    if (L.charAt(k) == ']' && R.charAt(len - 1 - k) != '[') f = false;
                    if (L.charAt(k) == '{' && R.charAt(len - 1 - k) != '}') f = false;
                    if (L.charAt(k) == '}' && R.charAt(len - 1 - k) != '{') f = false;
                }
                if (f) ans = Math.max(ans, 3 + 2 * len);
            }
        }
        sysout.println(ans);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = new StringTokenizer("");

    String read() {
        if (!buffer.hasMoreTokens()) {
            try {
                buffer = new StringTokenizer(in.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return buffer.nextToken();
    }

    int readInt() {
        return Integer.parseInt(read());
    }

    long readLong() {
        return Long.parseLong(read());
    }

    double readDouble() {
        return Double.parseDouble(read());
    }

    String readLine() {
        buffer = new StringTokenizer("");
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}