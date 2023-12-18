import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {
    private static final PrintStream ps     = System.out;
    private static final InputStream IS     = System.in;
    private static final byte[]      BUFFER = new byte[1024];
    private static int               ptr    = 0;
    private static int               buflen = 0;

    public static void main(String[] args) {

        int n = ni();
        //無向グラフの作成
        @SuppressWarnings("unchecked")
        List<Edge>[] edges = new List[n];
        for (int i = 0; i < edges.length; i++) {
            edges[i] = new ArrayList<Edge>();
        }
        for (int i = 0; i < n; i++) {
            int u = ni();
            int m = ni();
            for (int j = 0; j < m; j++) {
                edges[i].add(new Edge(u, ni(), ni()));
            }   
        }
        int[] d = dijkstra(n, edges, 0);
        
        for (int i = 0; i < n; i++) {
            System.out.println(i + " " + d[i]);
        }
    }
    //ダイクストラ法[単一始点最短経路(Single Source Shortest Path)]
    static int[] dijkstra(int n, List<Edge>[] edges, int s) {
        int[] distance = new int[n];        //始点からの最短距離

        Arrays.fill(distance, Integer.MAX_VALUE);    //各頂点までの距離を初期化(INF 値)
        distance[s] = 0;    //始点の距離は０

        Queue<Edge> q = new PriorityQueue<Edge>();
        q.add(new Edge(s, s, 0));     //始点を入れる

        while (!q.isEmpty()) {
            Edge e = q.poll();        //最小距離(cost)の頂点を取り出す
            if (distance[e.target] < e.cost) {
                continue;
            }

            //隣接している頂点の最短距離を更新する
            for (Edge v : edges[e.target]) {
                if (distance[v.target] > distance[e.target] + v.cost) {  //(始点～)接続元＋接続先までの距離    
                    distance[v.target] = distance[e.target] + v.cost;    //現在記録されている距離より小さければ更新
                    q.add(new Edge(e.target, v.target, distance[v.target]));  //始点～接続先までの距離    
                }
            }
        }

        return distance;    //到達できなかったときは、INF となる
    }

    static class Edge implements Comparable<Edge> {
        public int source = 0;    //接続元ノード
        public int target = 0;    //接続先ノード
        public int cost = 0;      //重み

        public Edge(int source, int target, int cost) {
            this.source = source;
            this.target = target;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }

        @Override
        public String toString() {    //デバッグ用
            return "source = " + source + ", target = " + target + ", cost = " + cost;
        }
    }

    private static boolean hasNextByte() {
        if (ptr < buflen)
            return true;
        else {
            ptr = 0;
            try {
                buflen = IS.read(BUFFER);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0)
                return false;
        }
        return true;
    }

    private static int readByte() {
        if (hasNextByte())
            return BUFFER[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public static boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(BUFFER[ptr]))
            ptr++;
        return hasNextByte();
    }

    public static String n() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public static long nl() {
        if (!hasNext())
            throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b)
            throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b))
                return minus ? -n : n;
            else
                throw new NumberFormatException();
            b = readByte();
        }
    }

    public static int ni() {
        long nl = nl();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public static double nextDouble() {
        return Double.parseDouble(n());
    }

    private static int[] nia(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = ni();
        return a;
    }

    private static long[] nla(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nl();
        return a;
    }

    private static String[] na(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = n();
        return a;
    }

    private static int[][] nia2(int n, int m) {
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++)
            a[i] = nia(m);
        return a;
    }

    private static long[][] nla2(int n, int m) {
        long[][] a = new long[n][m];
        for (int i = 0; i < n; i++)
            a[i] = nla(m);
        return a;
    }

    private static char[][] nca2(int n) {
        char[][] a = new char[n][];
        for (int i = 0; i < n; i++)
            a[i] = n().toCharArray();
        return a;

    }
}

