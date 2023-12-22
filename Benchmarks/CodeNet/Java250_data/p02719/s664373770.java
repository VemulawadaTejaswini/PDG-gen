import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.util.Set;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author L_aka_ryuga
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CReplacingInteger solver = new CReplacingInteger();
        solver.solve(1, in, out);
        out.close();
    }

    static class CReplacingInteger {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
/*
        for(int i = 0; i <= 100;i++){
            for(int j = 1;j <= 100 ;j++)
            {

            long n = in.nl() , k = in.nl();
                long min = Long.MAX_VALUE;
                Set<Long> set = new LinkedHashSet<>();

                for(long i = 0 ; i <= Long.MAX_VALUE - 1     ; i++){
                    if(n%k == 0){
                        min = 0;
                        break;
                    }
                    n = Math.abs(n - k);
                    min = Math.min(min , n);
                    /*if(!set.contains(min)) set.add(min);
                    else break;

                }

                out.println(min);
        */
            long n1 = in.nl(), k1 = in.nl();
            long ans = 0;
            if (n1 == k1) {
                ans = 0;
            } else if (n1 < k1) {
                ans = Math.min(n1, k1 - n1);
            } else {
                n1 = n1 - k1 * (n1 / k1);
                long min1 = Long.MAX_VALUE;
                Set<Long> set1 = new LinkedHashSet<>();
                while (true) {
                    if (n1 % k1 == 0) {
                        min1 = 0;
                        break;
                    }
                    n1 = Math.abs(n1 - k1);
                    min1 = Math.min(min1, n1);
                    if (!set1.contains(min1)) set1.add(min1);
                    else break;

                }
                ans = min1;
            }

            out.println(ans);


        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

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

        public long nl() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

