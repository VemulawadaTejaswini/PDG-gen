import java.io.*;
import java.util.*;
import java.math.BigDecimal;

@SuppressWarnings("unused")
public class Main {
    FastScanner in;
    PrintWriter out;
    final static int MOD = (int)1e9+7;
    
    void solve(){
        int H = in.nextInt(), W = in.nextInt();
        int sy = in.nextInt()-1, sx = in.nextInt()-1;
        int gy = in.nextInt()-1, gx = in.nextInt()-1;
        char[][] S = new char[H][W];
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                S[i][j] = in.nextChar();
            }
        }
        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, 1, 0, -1};
    
        ArrayList<ArrayList<Edge>> g = new ArrayList<>();
        for(int i = 0; i < H * W; i++) g.add(new ArrayList<>());
        UnionFind uf = new UnionFind(H * W);
        
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                for(int k = 0; k < dy.length; k++){
                    int ny = i + dy[k], nx = j + dx[k];
                    if(ny < 0 || ny >= H || nx < 0 || nx >= W) continue;
                    if(S[i][j] == '#' || S[ny][nx] == '#') continue;
                    g.get(i + j * H).add(new Edge(i + j * H, ny + nx * H, 0));
                    uf.unite(i + j * H, ny + nx * H);
                }
            }
        }
    
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                for(int ry = -2; ry <= 2; ry++){
                    for(int rx = -2; rx <= 2; rx++){
                        int ny = i + ry, nx = j + rx;
                        if(ny < 0 || ny >= H || nx < 0 || nx >= W) continue;
                        if(S[i][j] == '#' || S[ny][nx] == '#') continue;
                        if(uf.isSame(i + j * H, ny + nx * H)) continue;
                        g.get(i + j * H).add(new Edge(i + j * H, ny + nx * H, 1));
                        g.get(ny + nx * H).add(new Edge(ny + nx * H, i + j * H, 1));
                        uf.unite(i + j * H, ny + nx * H);
                    }
                }
            }
        }
        
        long INF = Long.MAX_VALUE / 2;
        long[] dist = dijkstra(g, sy + sx * H, INF);
        out.println(dist[gy + gx * H] == INF ? "-1" : dist[gy + gx * H]);
    }
    
    long[] dijkstra(ArrayList<ArrayList<Edge>> g, int start, long INF){
        long[] dist = new long[g.size()];
        Arrays.fill(dist, INF);
        dist[start] = 0;
        PriorityQueue<Node> priorityQueue = new PriorityQueue<Node>();
        priorityQueue.add(new Node(start, 0));
        
        while(!priorityQueue.isEmpty()){
            Node node = priorityQueue.poll();
            if(dist[node.index] < node.cost) continue;
            for(Edge e : g.get(node.index)){
                long next = dist[node.index] + e.cost;
                if(dist[e.to] > next){
                    dist[e.to] = next;
                    priorityQueue.add(new Node(e.to, next));
                }
            }
        }
        
        return dist;
    }
    
    class Node implements Comparable<Node>{
        int index;
        long cost;
        public Node(int i, long c){
            index = i; cost = c;
        }
        @Override
        public int compareTo(Node o) {
            return Long.compare(this.cost, o.cost);
        }
    }
    
    class Edge implements Comparable<Edge>{
        int from;
        int to;
        long cost;
        public Edge(int f, int t, long c){
            from = f; to = t; cost = c;
        }
        @Override
        public int compareTo(Edge o) {
            return Long.compare(this.cost, o.cost);
        }
    }
    
    class UnionFind{
        private int[] par;
        private int[] rank;
        private int[] size;
        private int group;
        
        UnionFind(int n){
            par = new int[n];
            rank = new int[n];
            size = new int[n];
            group = n;
            for(int i = 0; i < n; i++){
                par[i] = i;
                rank[i] = 0;
                size[i] = 1;
            }
        }
        
        //ランクの小さいほうにつなげる
        boolean unite(int x, int y){
            x = root(x);
            y = root(y);
            if(x == y) return false;
            
            if(rank[x] < rank[y]){
                int tmp = x; x = y; y = tmp;
            }
            
            //y(のroot)をx(のroot)の下にくっつける
            //yのほうが重くなる(ポテンシャルが高くなる)
            if(rank[x] == rank[y]) rank[x]++;
            group--;
            par[y] = x;
            size[x] += size[y];
            
            return true;
        }
        
        //経路圧縮しながらrootを求める
        int root(int x){
            if(par[x] == x){
                return x;
            }else{
                int f = root(par[x]);
                return par[x] = f;
            }
        }
        
        int rank(int x){return rank[root(x)];}
        int size(int x){return size[root(x)];}
        int group(){return this.group;}
        boolean isSame(int x, int y){
            return root(x) == root(y);
        }
    }
    
    public static void main(String[] args) {
        new Main().m();
    }
    
    private void m() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        /*
        try {
            String path = "input.txt";
            out = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))));
        }catch (IOException e){
            e.printStackTrace();
        }
        */
        solve();
        out.flush();
        in.close();
        out.close();
    }
    
    static class FastScanner {
        private Reader input;
        
        public FastScanner() {this(System.in);}
        public FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}
        public void close() {
            try {
                this.input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        
        public long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }
        
        public double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }
        
        public char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }
        
        public String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
        
        public String nextLine() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (b != -1 && b != '\n') {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
        
        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }
        
        public int[] nextIntArrayDec(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt() - 1;
            }
            return res;
        }
        
        public int[] nextIntArray1Index(int n) {
            int[] res = new int[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextInt();
            }
            return res;
        }
        
        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }
        
        public long[] nextLongArrayDec(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }
        
        public long[] nextLongArray1Index(int n) {
            long[] res = new long[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextLong();
            }
            return res;
        }
        
        public double[] nextDoubleArray(int n) {
            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextDouble();
            }
            return res;
        }
    }
}