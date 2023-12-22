import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int next() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextStr() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            StringBuffer str = new StringBuffer();
            do {
                str.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return str.toString();
        }

        public int nextInt() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
    public static void main(String[] args) throws IOException {

        InputReader sc = new InputReader(System.in);
        int n1 = sc.nextInt();
        int sp1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            sp1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int sp2[] = new int[n1];
        for (int i = 0; i < n2; i++) {
            sp2[i] = sc.nextInt();
        }
        int sum = 0;
        for (int j = 0; j < n2; j++) {
            if (Arrays.binarySearch(sp1, sp2[j]) > 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
