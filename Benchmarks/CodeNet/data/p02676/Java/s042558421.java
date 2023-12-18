

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static class pair implements Comparable<pair> {
        int l;
        int r;
        int dif;

        public pair(int lef, int ri) {
            l = lef;
            r = ri;
            dif = r - l;
        }

        @Override
        public int compareTo(pair p) {
            if (p.dif == dif)
                return l - p.l;
            return p.dif - dif;
        }
    }

    static int n, m;
    static ArrayList<Integer>[] adj;
    static int dist[];
    static int parent[];
    static long inf = (long) 1e18;
    static int INF = (int) 1e9;


    public static boolean isSimilar(char[] Arr, int s, int k) {
        for (int i = s; i < k - 1; i++) {
            if (Arr[i + 1] != Arr[i])
                return false;
        }
        return true;
    }

    public static int ciel(int d, int mod) {
        if (d % mod == 0)
            return d / mod;
        return d / mod + 1;
    }


    public static long gcd(long u, long v) {
        if (v == 0)
            return u;
        return gcd(v, u % v);
    }

    static int k, Arr[], lefAcc[], riAcc[];
    static PrintWriter pw;

    static long memo[][],Matrix[][];

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        pw = new PrintWriter(System.out);
        int k=sc.nextInt();

        String str=sc.next();
      if(str.length()<=k)
          pw.println(str);
      else
          pw.println(str.substring(0,k)+"...");
        pw.close();

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
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
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException, IOException {
            return br.ready();
        }

    }
}
