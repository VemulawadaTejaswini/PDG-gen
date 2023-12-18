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

    void run() throws IOException {
        Reader in = new Reader();
        Writer out = new Writer();
        int n = in.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        int countA[] = new int[n + 1];
        int countB[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
            countA[A[i]]++;
        }
        for (int i = 0; i < n; i++) {
            B[i] = in.nextInt();
            countB[B[i]]++;
        }
        boolean must = true;
        for (int i = 1; i < n + 1; i++) {
            if (countA[i] + countB[i] > n) {
                must = false;
                break;
            }
        }
        if (must) {
            int B1[] = new int[n];
            int i1 = 0;
            int i2 = n;
            for (int i = 0; i < n; i++) {
                while (countB[i1] == 0) {
                    i1++;
                }
                if (i1 == A[i]) {
                    while (countB[i2] == 0) {
                        i2--;
                    }
                    B1[i] = i2;
                    countB[i2]--;
                } else {
                    B1[i] = i1;
                    countB[i1]--;
                }
            }
            out.print("Yes\n");
            for (int i = 0; i < n; i++) {
                out.print(B1[i] + " ");
            }
        } else {
            out.print("No");
        }
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }
}