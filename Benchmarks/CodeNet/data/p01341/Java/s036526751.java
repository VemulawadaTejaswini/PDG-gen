import java.util.*;
import java.io.*;

public class Main {
    static IO io = new IO();
    public static void main(String[] args) {

        int n = io.nextInt();
        int m = io.nextInt();
        int px[] = new int[n];
        int py[] = new int[n];
        for (int i = 0; i < n; i++) {
            px[i] = io.nextInt();
            py[i] = io.nextInt();
        }
        double ans = 0;
        double e[][] = new double[m][3];
        for (int i = 0; i < m; i++) {
            int a = io.nextInt()-1;
            int b = io.nextInt()-1;
            double c = Math.sqrt((px[a] - px[b])*(px[a]-px[b]) + (py[a]-py[b])*(py[a]-py[b]));
            ans += c;
            e[i] = new double[] {a, b, -c};
        }
        Kruskal kr = new Kruskal(n, e);
        ans += kr.ans;
        System.out.println(ans);
    }

    static class Kruskal {
        double ans;
        // ?????????????????????
        public Kruskal(int n, double adj[][]) {
            List<Edge> edges = new LinkedList<Edge>();    //???????????±
            for (double[] anAdj : adj) {
                edges.add(new Edge(anAdj[0], anAdj[1], anAdj[2]));
            }

            ans = kruskal(n, edges);
        }

        // ??????????????????
        private double kruskal(int n, List<Edge> edges) {
            UnionFind uni = new UnionFind(n);  //??????????????¨
            Queue<Edge> q = new PriorityQueue<Edge>(edges);

            double totalCost = 0;	//????°???¨?????¨?????????
            while (!q.isEmpty()) {
                Edge e = q.poll();
                if (!uni.same((int)e.source, (int)e.target)) {
                    totalCost += e.cost;
                    uni.unite((int)e.source, (int)e.target);
                }
            }

            return totalCost;
        }

        //????????±????§???????
        class Edge implements Comparable<Edge> {
            double source = 0;	//??\?¶?????????????
            double target = 0;	//??\?¶?????????????
            double cost = 0;	//??????

            Edge(double source, double target, double cost) {
                this.source = source;
                this.target = target;
                this.cost = cost;
            }

            @Override
            public int compareTo(Edge o) {
                return (int)Math.ceil(this.cost - o.cost);
            }

            @Override
            public String toString() {  //???????????°??¨
                return "source = " + source + ", target = " + target + ", cost = " + cost;
            }
        }

        class UnionFind {
            int par[];	// i??????(parent)
            int rank[];	// i?????±???

            // ????????????????????? n????´???§?????????
            UnionFind(int n) {
                par = new int[n];
                rank = new int[n];
                for (int i=0; i<n; i++) par[i]=i;
            }

            // ??¨??????????±???????
            int find(int x) {
                if (par[x] == x) return x;
                return par[x] = find(par[x]);
            }

            // x??¨y???????????????????±????????????????
            Boolean same(int x,int y) {
                return find(x)==find(y);
            }

            // x??¨y????±??????????????????????
            void unite(int x,int y) {
                x = find(x);
                y = find(y);
                if (x==y) return;
                if (rank[x]<rank[y]) par[x] = y;
                else {
                    par[y]=x;
                    if (rank[x]==rank[y]) rank[x]++;
                }
            }

        }
    }

    static class IO extends PrintWriter {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        IO() {
            this(System.in);
        }

        IO(InputStream source) {
            super(System.out);
            this.in = source;
        }

        boolean hasNextByte() {
            if (ptr < buflen) return true;
            else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) return false;
            }
            return true;
        }

        int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }

        int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public void close() {
            super.close();
            try {
                in.close();
            } catch (IOException ignored) {
            }
        }
    }
}