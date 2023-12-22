import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Vishal Burman
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CFennecVsMonster solver = new CFennecVsMonster();
        solver.solve(1, in, out);
        out.close();
    }

    static class CFennecVsMonster {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String str[] = in.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            long k = Long.parseLong(str[1]);
            String str2[] = in.readLine().split(" ");
            long a[] = new long[str2.length];
            for (int i = 0; i < str2.length; i++)
                a[i] = Long.parseLong(str2[i]);
            Arrays.sort(a);
            for (int i = n - 1; ; i--) {
                if (i == -1 || k == 0)
                    break;
                a[i] = 0;
                k--;
            }
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i];
            }
            out.println(sum);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        private String readLine0() {
            StringBuilder buf = new StringBuilder();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r') {
                    buf.appendCodePoint(c);
                }
                c = read();
            }
            return buf.toString();
        }

        public String readLine() {
            String s = readLine0();
            while (s.trim().length() == 0) {
                s = readLine0();
            }
            return s;
        }

    }
}

