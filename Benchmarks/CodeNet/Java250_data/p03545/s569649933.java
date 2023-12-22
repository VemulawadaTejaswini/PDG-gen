import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Closeable;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CTrainTicket solver = new CTrainTicket();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTrainTicket {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            char[] chars = in.next().toCharArray();
            int[] nums = new int[4];
            for (int i = 0; i < 4; i++) {
                nums[i] = Character.getNumericValue(chars[i]);
            }
            for (int i = 0; i < 8; i++) {
                int sum = nums[0];
                StringBuilder ans = new StringBuilder();
                ans.append(sum);
                for (int j = 0; j < 3; j++) {
                    if (((i >> j) & 1) == 0) {
                        sum += nums[j + 1];
                        ans.append('+');
                    } else {
                        sum -= nums[j + 1];
                        ans.append('-');
                    }
                    ans.append(nums[j + 1]);
                }
                if (sum == 7) {
                    ans.append("=7");
                    out.println(ans.toString());
                    return;
                }
            }
        }

    }

    static class FastScanner implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

