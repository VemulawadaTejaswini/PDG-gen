

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        int sn = sc.nextInt();
        int tn = sc.nextInt();

        String in = sc.next();
        if (in.equals(s)) {
            sn = sn - 1;
        }
        else if (in.equals(t))
            tn-=1;
        pw.println(sn + " " + tn);

        pw.close();
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String file) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(file));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}


