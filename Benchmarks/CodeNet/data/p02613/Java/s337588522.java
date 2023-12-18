import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Spandan Mishra
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BJudgeStatusSummary solver = new BJudgeStatusSummary();
        solver.solve(1, in, out);
        out.close();
    }

    static class BJudgeStatusSummary {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            //AC WA TLE RE
            int n = in.readInt();
            int[] cnt = new int[4];
            while (n-- > 0) {
                String s = in.readString();
                if (s.equals("AC"))
                    cnt[0]++;
                else if (s.equals("WA"))
                    cnt[1]++;
                else if (s.equals("TLE"))
                    cnt[2]++;
                else if (s.equals("RE"))
                    cnt[3]++;
            }
            System.out.println("AC x " + cnt[0]);
            System.out.println("WA x " + cnt[1]);
            System.out.println("TLE x " + cnt[2]);
            System.out.println("RE x " + cnt[3]);
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
            if (numChars == -1)
                throw new RuntimeException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String readString() {
            final StringBuilder stringBuilder = new StringBuilder();
            int c = read();
            while (isSpaceChar(c))
                c = read();
            do {
                stringBuilder.append((char) c);
                c = read();
            } while (!isSpaceChar(c));
            return stringBuilder.toString();
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

