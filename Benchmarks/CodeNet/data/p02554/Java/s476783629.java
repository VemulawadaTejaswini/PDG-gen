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

    long m = (long) 1e9 + 7;

    long pow(long a, long n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return a % m;
        }
        if (n % 2 == 0) {
            long b = pow(a, n / 2);
            return (b * b) % m;
        } else {
            return (pow(a, n - 1) * a) % m;
        }
    }

    void run() throws IOException {
        Reader in = new Reader();
        Writer out = new Writer();
        long n = in.nextInt();
        long ans = pow(10, n) - (2 * (pow(9, n) - pow(8, n)) + pow(8, n));
        while (ans < 0) {
            ans += m;
        }
        out.print(ans % m);
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }
}