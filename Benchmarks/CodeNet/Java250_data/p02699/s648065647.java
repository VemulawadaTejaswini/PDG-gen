import java.io.*;
import java.util.*;


public class Main{
    static long [][] memo;
    static long [] pow = new long[33];
    static ArrayList <Integer> [] graph;
    static Integer [] d;
    static int [] dist;
    static boolean[][] visited;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        long MOD = 1000000007;
        //int t = sc.nextInt();
        int t = 1;
        while(t -- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            //int k = sc.nextInt();
            if(n <= m)
            out.println("unsafe");
            else
                out.println("safe");
        }
        out.close();
    }
    public static void bfs(int source, int i, int g)
    {
        if(visited[i][g]) return;
        visited[i][g] = true;
        if(g == 0) graph[source].add(i);

        if(dist[i] <= g) bfs(source, i - 1, g - dist[i]);
        if(dist[i + 1] <= g) bfs(source, i + 1, g - dist[i + 1]);
    }
    public static long solve(long n){
        for(int i = 1; i < 33; i ++)
            if(n % pow[i] == 0)
                return n / pow[i];
        return -1;
    }
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    //--------------------------------------------------------
}
