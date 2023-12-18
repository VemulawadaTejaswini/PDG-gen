import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[]adj;
    static int[] ans ;
    static void bfs(){
        ans= new int[adj.length];
        Arrays.fill(ans,-1);
        ans[0]=0;
        Queue<Integer>q = new LinkedList<>();
        ((LinkedList<Integer>) q).add(0);
        while (!q.isEmpty()){
            int u = q.poll();
            for (int v :adj[u]){
                if (ans[v]==-1){
                    ans[v]=u+1;
                    ((LinkedList<Integer>) q).add(v);
                }
            }
        }
        boolean is = true;
        for (int x:ans)if (x==-1)is=false;
        if (!is){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
            for (int i =1;i<ans.length;i++)
                System.out.println(ans[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        int a = sc.nextInt(),b = sc.nextInt();
//        int h = sc.nextInt()*5,m = sc.nextInt();
//        int d = Math.abs(h-m);
//        double ang =Math.PI/30*d;
////        ang=Math.min(ang,2*Math.PI-ang);
//        double ans = a*a+b*b-2*a*b*Math.cos(ang);
//        pw.println(Math.sqrt(ans));
        int n= sc.nextInt(),m = sc.nextInt();
        adj= new ArrayList[n];
        for (int i =0;i<n;i++)adj[i]=new ArrayList<>();
        while (m-->0){
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            adj[v].add(u);
            adj[u].add(v);
        }
        bfs();
        pw.flush();
    }
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

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

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}