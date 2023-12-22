import java.util.*;
import java.io.*;

public class Main {
    static class Reader {
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

    }
    static class Writer {
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

        void println(Object a) {
            out.append(a + "\n");
        }

        void close() {
            cout.print(out.toString());
            cout.close();
        }
    }

    public static void main(String args[]) throws IOException {
        Reader in = new Reader();
        Writer out = new Writer();
        int n = in.nextInt();
        TreeSet<String> t = new TreeSet<>();
        boolean must = true;
        String last = in.next();
        t.add(last);
        for (int i = 1; i < n; i++) {
            String s = in.next();
            if(t.contains(s)) {
                must = false;
            } else {
                t.add(s);
            }
            if(last.charAt(last.length() - 1) != s.charAt(0))
                must = false;
            last = s;
        }
        if(must){
            out.print("Yes");
        } else {
            out.print("No");
        }
        out.close();
    }
}