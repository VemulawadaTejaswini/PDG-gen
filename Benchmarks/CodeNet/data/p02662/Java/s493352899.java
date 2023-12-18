import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author maheshwari29
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FKnapsackForAllSubsets solver = new FKnapsackForAllSubsets();
        solver.solve(1, in, out);
        out.close();
    }

    static class FKnapsackForAllSubsets {
        static long mod = 998244353;
        static ArrayList<Integer> temp = new ArrayList<>();
        static boolean[][] dp;

        static long exponent(long a, long n) {
            long ans = 1;
            while (n != 0) {
                if (n % 2 == 1) ans = (ans * a) % mod;
                a = (a * a) % mod;
                n = n >> 1;
            }
            return ans;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int i, j;
            int n = in.ni();
            int sum = in.ni();
            int arr[] = in.nia(n);

            //int arr[] = {1, 2, 3, 4, 5};
            //int n = arr.length;
            //int sum = 10;
            temp = new ArrayList<>();
            printAllSubsets(arr, n, sum);
            //out.println(temp);
            long ans = 0;
            for (int c : temp)
                ans = (ans + exponent(2, n - c)) % mod;
            out.println(ans);

        }

        static void display(ArrayList<Integer> v) {
            temp.add(v.size());
            //System.out.println(v);
        }

        static void printSubsetsRec(int arr[], int i, int sum,
                                    ArrayList<Integer> p) {
            // If we reached end and sum is non-zero. We print
            // p[] only if arr[0] is equal to sun OR dp[0][sum]
            // is true.
            if (i == 0 && sum != 0 && dp[0][sum]) {
                p.add(arr[i]);
                display(p);
                p.clear();
                return;
            }

            // If sum becomes 0
            if (i == 0 && sum == 0) {
                display(p);
                p.clear();
                return;
            }

            // If given sum can be achieved after ignoring
            // current element.
            if (dp[i - 1][sum]) {
                // Create a new vector to store path
                ArrayList<Integer> b = new ArrayList<>();
                b.addAll(p);
                printSubsetsRec(arr, i - 1, sum, b);
            }

            // If given sum can be achieved after considering
            // current element.
            if (sum >= arr[i] && dp[i - 1][sum - arr[i]]) {
                p.add(arr[i]);
                printSubsetsRec(arr, i - 1, sum - arr[i], p);
            }
        }

        static void printAllSubsets(int arr[], int n, int sum) {
            if (n == 0 || sum < 0)
                return;

            // Sum 0 can always be achieved with 0 elements
            dp = new boolean[n][sum + 1];
            for (int i = 0; i < n; ++i) {
                dp[i][0] = true;
            }

            // Sum arr[0] can be achieved with single element
            if (arr[0] <= sum)
                dp[0][arr[0]] = true;

            // Fill rest of the entries in dp[][]
            for (int i = 1; i < n; ++i)
                for (int j = 0; j < sum + 1; ++j)
                    dp[i][j] = (arr[i] <= j) ? (dp[i - 1][j] ||
                            dp[i - 1][j - arr[i]])
                            : dp[i - 1][j];
            if (dp[n - 1][sum] == false) {
                return;
            }

            // Now recursively traverse dp[][] to find all
            // paths from dp[n-1][sum]
            ArrayList<Integer> p = new ArrayList<>();
            printSubsetsRec(arr, n - 1, sum, p);
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

        public int ni() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
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

        public int[] nia(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = ni();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

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
}

