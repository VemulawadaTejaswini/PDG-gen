import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

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
        EMultiplication4 solver = new EMultiplication4();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMultiplication4 {
        final int M = (int) 1e9 + 7;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.readInt(), k = in.readInt();
            Integer[] a = new Integer[n];

//        List<Integer> pos = new ArrayList<>(), neg = new ArrayList<>();
            for (int i = 0; i < n; i++)
                a[i] = in.readInt();


            // k== n

            if (n == k) {
                long ans = 1;
                for (int num : a)
                    ans = (ans % M * num % M) % M;

                System.out.println((ans + M) % M);
                return;
            }

            Arrays.sort(a, new Comparator<Integer>() {

                public int compare(Integer o1, Integer o2) {
                    return -Integer.compare(Math.abs(o1), Math.abs(o2));
                }
            });

//        System.out.println(Arrays.toString(a));
            // all pos

            if (a[n - 1] > 0 && a[0] > 0) {
                long ans = 1;
                for (int i = 0; i < k; i++) {
                    ans = (ans % M * a[i] % M) % M;
                }
                System.out.println((ans + M) % M);
                return;
            }

            // all negs
            if (a[0] < 0 && a[n - 1] < 0) {

                //odd k - take k from back
                if (k % 2 == 1) {

                    long ans = 1;
                    for (int i = n - k; i < n; i++)
                        ans = (ans % M * a[i] % M) % M;

                    System.out.println((ans + M) % M);
                    return;
                }

                //even k - take k from front

                else {
                    long ans = 1;
                    for (int i = 0; i < k; i++) {
                        ans = (ans % M * a[i] % M) % M;
                    }
                    System.out.println((ans + M) % M);
                    return;

                }

            }

            //hybrid - 2 ptr

            // -4 -3 2 1
            // 2 separate arrays - pos , neg


            int nNeg = 0;
            for (int i = 0; i < n; i++)
                if (a[i] < 0)
                    nNeg++;


            int[] pos = new int[n - nNeg], neg = new int[nNeg];

            int pi = n - nNeg - 1, ni = 0;  // pos index and neg index
            for (int i = 0; i < n; i++) {
                if (a[i] >= 0)
                    pos[pi--] = a[i];
                else
                    neg[ni++] = a[i];
            }


            // prefix prod

            long[] ppos = new long[pos.length + 1], pneg = new long[neg.length + 1];
            ppos[0] = pneg[0] = 1;

            for (int i = 1; i <= pos.length; i++)
                ppos[i] = (pos[i - 1] % M * ppos[i - 1] % M) % M;

            for (int i = 1; i <= neg.length; i++)
                pneg[i] = (neg[i - 1] % M * pneg[i - 1] % M) % M;


            int pst, nst; // pos and neg starts
            //start by taking all pos (and required neg if pos array size < k)
            // make sure to always keep the negatives chosen as even to get max positive product

            //PST and NST are in decreasing orders of their magnitudes

            pst = Math.min(k, pos.length);
            nst = k - pst;

            // taking even number of negatives and decreasing one from positives taken

            if (nst % 2 == 1) {
                nst++;
                pst--;
            }

            //boundary check and since I am removing 2 elements from pos and adding 2 into neg , I need to make
            //sure they are the best choice else stop

            while (nst + 2 <= nNeg && pst >= 2 &&
                    pos[pst - 1] * (long) pos[pst - 2] < neg[nst] * (long) neg[nst + 1]) {

                //as long as we get a better pair , keep on incrementing neg else no point in adding neg pairs if
                // they don't contribute to better val

                nst += 2;
                pst -= 2;
            }


            System.out.println((ppos[pst] % M * pneg[nst] % M) % M);
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

