import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.BitSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSumOfDivisors solver = new DSumOfDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSumOfDivisors {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] f = LinearSieve.sieve(n, LinearSieve.divisorCount);

            long answer = 0;
            for (int i = 1; i <= n; i++) {
                answer += (long) i * f[i];
            }

            out.println(answer);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class LinearSieve {
        public final BitSet isComposite;
        public final int[] leastPrimeDivisor;
        public final int[] primes;
        public static final LinearSieve.PrimePowerFunction divisorCount = (p, k) -> k + 1;

        public LinearSieve(int n) {
            double estimate;
            if (n < 10000) {
                estimate = n + 1;
            } else {
                estimate = ((double) n) / Math.log(n);
                estimate *= 1.1;
            }
            int[] primes = new int[(int) estimate];
            leastPrimeDivisor = new int[n + 1];
            int size = 0;

            if (n <= 1) {
                isComposite = new BitSet();
            } else {
                isComposite = new BitSet(n + 1);

                for (int i = 2; i <= n; i++) {
                    if (!isComposite.get(i)) {
                        if (size >= primes.length)
                            primes = resize(primes);
                        primes[size++] = i;
                        leastPrimeDivisor[i] = i;
                    }

                    for (int j = 0; j < size; j++) {
                        int p = primes[j];
                        if (i * p > n)
                            break;
                        isComposite.set(i * p);
                        leastPrimeDivisor[i * p] = p;
                        if (i % p == 0)
                            break;
                    }
                }
            }

            this.primes = new int[size];
            System.arraycopy(primes, 0, this.primes, 0, size);
        }

        private static int[] resize(int[] primes) {
            int newSize = 1 + ((primes.length * 11) / 10);
            int[] newPrimes = new int[newSize];
            System.arraycopy(primes, 0, newPrimes, 0, primes.length);
            return newPrimes;
        }

        public static int[] sieve(int n, LinearSieve.PrimePowerFunction function) {
            ASSERT(n >= 1);

            BitSet isComposite = new BitSet();
            int[] f = new int[n + 1];
            int[] count = new int[n + 1];
            List<Integer> primes = new ArrayList<>();

            f[1] = 1;

            for (int i = 2; i <= n; i++) {
                if (!isComposite.get(i)) {
                    primes.add(i);
                    f[i] = function.forPrimePower(i, 1);
                    count[i] = 1;
                }

                for (int p : primes) {
                    if (i * p > n)
                        break;

                    isComposite.set(i * p);

                    if (i % p == 0) {
                        f[i * p] = f[i] * function.forPrimePower(p, count[i] + 1);
                        int div = function.forPrimePower(p, count[i]);
                        if (div != 0)
                            f[i * p] /= div;
                        else
                            ASSERT(f[i * p] == 0);
                        count[i * p] = count[i] + 1;
                    } else {
                        f[i * p] = f[i] * f[p];
                        count[i * p] = 1;
                    }
                }
            }

            return f;
        }

        private static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
        }

        interface PrimePowerFunction {
            int forPrimePower(int p, int k);

        }

    }
}

