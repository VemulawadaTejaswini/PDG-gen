import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    class Reader {
        BufferedReader in;

        Reader() throws IOException {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        Reader(String name) throws IOException {
            in = new BufferedReader(new FileReader(name));
        }

        StringTokenizer tokin = new StringTokenizer("");

        String next() throws IOException {
            if (!tokin.hasMoreTokens()) {
                tokin = new StringTokenizer(in.readLine());
            }
            return tokin.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        boolean hasNext() throws IOException {
            if (tokin.hasMoreTokens()) {
                return true;
            } else {
                String s = in.readLine();
                while (s != null && s.length() == 0) {
                    s = in.readLine();
                }
                if (s == null) {
                    return false;
                } else {
                    tokin = new StringTokenizer(s);
                    return true;
                }
            }
        }
    }

    class Writer {
        PrintWriter cout;

        Writer() throws IOException {
            cout = new PrintWriter(System.out);
        }

        Writer(String name) throws IOException {
            cout = new PrintWriter(new FileWriter(name));
        }

        StringBuilder out = new StringBuilder();

        void print(Object a) {
            out.append(a);
        }

        void close() {
            cout.print(out.toString());
            cout.close();
        }
    }

    ArrayList<Long> primes = new ArrayList<>();
    int n;

    boolean isPrime(long n) {
        for (int i = 0; i < primes.size() && primes.get(i) * primes.get(i) <= n; i++) {
            if (n % primes.get(i) == 0) {
                return false;
            }
        }
        return true;
    }


    long count[];

    void calck(long n1, int i) {
        for (int j = i; j < primes.size() && primes.get(j) * n1 <= n; j++) {
            long p = primes.get(j);
            for (long n2 = n1 * p, mul = 2; n2 <= n; n2 *= p, mul++) {
                count[(int) n2] = count[(int) n1] * mul;
                calck(n2, i + 1);
            }
        }
    }

    void run() throws Exception {
        Reader in = new Reader();
        Writer out = new Writer();
        int N = in.nextInt();
        n = N - 1;
        for (long i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        count = new long[n + 1];
        count[1] = 1;
        calck(1, 0);
        long sum = 0;
        for (int i = 1; i < N; i++) {
            sum += count[i];
        }
        out.print(sum);
        out.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
