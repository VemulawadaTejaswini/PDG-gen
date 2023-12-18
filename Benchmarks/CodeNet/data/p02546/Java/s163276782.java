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

    void run() throws Exception {
        Reader in = new Reader();
        Writer out = new Writer();
        String s = in.next();
        if (s.charAt(s.length() - 1) == 's') {
            out.print(s + "es");
        } else {
            out.print(s + "s");
        }
        out.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}