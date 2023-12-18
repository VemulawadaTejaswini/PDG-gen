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

    long S[];

    long calck(int s) {
        if (S[s] == -1) {
            long ans = 0;
            if (s >= 3) {
                ans += 1;
            }
            for (int i = 3; i < s; i++) {
                ans = (ans + calck(s - i)) % m;
            }
            S[s] = ans;
        }
        return S[s];
    }

    void run() throws IOException {
        Reader in = new Reader();
        Writer out = new Writer();
        int s = in.nextInt();
        S = new long[s + 1];
        for (int i = 0; i < s + 1; i++) {
            S[i] = -1;
        }
        out.print(calck(s));
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }
}