

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
       int n=sc.nextInt();
       int m=sc.nextInt();
       adj=new ArrayList[n];
       for(int i=0;i<n;i++)
           adj[i]=new ArrayList<>();
       for(int i=0;i<m;i++){
           int u=sc.nextInt()-1;
           int v=sc.nextInt()-1;
           adj[u].add(v);
           adj[v].add(u);
       }
        int[]dist=new int[n];
        Arrays.fill(dist,-1);
        dist[0]=0;
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        int cnt=1;
        while (!q.isEmpty()){
            int u=q.poll();
            for(int v:adj[u])
                if(dist[v]==-1)
                {
                  q.add(v);
                  dist[v]=dist[u]+1;
                  cnt++;
                }
        }
        if(cnt<n){
            pw.println("No");
        }else{
            pw.println("Yes");
            for(int i=1;i<n;i++)
                pw.println(dist[i]);
        }
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
