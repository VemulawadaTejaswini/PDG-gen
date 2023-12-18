import org.omg.CORBA.INTERNAL;

import java.io. *;
import java.util.*;
import static java.lang.Math.*;
public class Main {

    static final FastReader sc = new FastReader(System.in);
    static final PrintWriter pw = new PrintWriter(System.out);

    static int visited[];
    static ArrayList<ArrayList<Integer>> adjlist;
    static class edge implements  Comparator<edge>{
        int dest;
        int cost;

        public edge(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compare(edge o1, edge o2) {
            return o1.cost-o2.cost;
        }
    }

    static int dist[];
    static int nodesinSubtree[];
    static int color[];
    static ArrayList<Integer> leaves;
    static ArrayList<PriorityQueue<Integer>> apq;

    static class Graph {
        int V;
        ArrayList<ArrayList<edge>> adj;
        PriorityQueue<edge> pq;
        boolean visited[];

        public Graph(int V) {
            this.V = V;
            adj = new ArrayList<>(V);
            pq = new PriorityQueue<>(V, new edge(-1, -1));
            dist = new int[V];
            visited = new boolean[V];
            for (int i = 0; i < V; i++) {
                dist[i] = Integer.MAX_VALUE;
                adj.add(i, new ArrayList<>());
            }
        }

        void addedge(int u, int v, int w) {
            adj.get(u).add(new edge(v, w));
            adj.get(v).add(new edge(u, w));
        }

        void rDfs(int src, int e) {
            if(adj.get(src).size()==0){
                leaves.add(src);
            }

            for (int i = 0; i < adj.get(src).size(); i++) {
                if (adj.get(src).get(i).dest == e) {
                    continue;
                }
                rDfs(adj.get(src).get(i).dest, src);
            }
        }

        PriorityQueue<Integer> Dfs(int src, int e, PriorityQueue<Integer> pq) {
            if(adj.get(src).size()==0){
                if(src!=0 && !pq.isEmpty()){
                    pq.remove(adj.get(src).get(e).cost);
                }
            }

            for (int i = 0; i < adj.get(src).size(); i++) {
                if (adj.get(src).get(i).dest == e) {
                    continue;
                }
                if (adj.get(src).get(i).dest == 1) {
                    pq.add(adj.get(src).get(i).cost);
                    return pq;
                }
                pq.add(adj.get(src).get(i).cost);
                Dfs(adj.get(src).get(i).dest, src, pq);
            }

            return pq;

        }



/*
        void dijkstra(int src){
            for(int i=0; i<V; i++){
                dist[i] = Integer.MAX_VALUE;
            }
            dist[src] = 0;
            pq.add(new edge(src,0));
            while (!pq.isEmpty()){
                int u = pq.poll().dest;
                for(int i=0; i<adj.get(u).size(); i++){
                    int v = adj.get(u).get(i).dest;
                    int w = adj.get(u).get(i).cost;
                    if(dist[u]+w<=dist[v]){
                        dist[v] = dist[u] + w;
                        pq.add(new edge(v,dist[v]));
                    }
                }
            }

        }


    }

 */
    }



    static  int I[];
    static  int  L[];
    static int LIS(int n, int arr[]){
        I = new int[n+1];
        L = new int[n];
        I[0] = Integer.MIN_VALUE;
        for(int i=1;i<=n; i++){
            I[i] = Integer.MAX_VALUE;
        }

        int lisLength = 1;

        int cm = 0;

        for(int i=n-1; i>=0; i--) {
            int low = 1;
            int high = lisLength;
            int mid = 0;
            while (low < high) {
                mid = (low + high) >> 1;
                if (I[mid] <= arr[i]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }

            if(I[high]==arr[i]){
                cm++;
            }
            I[high] = arr[i];
            L[i] = high;
            if(lisLength<=high){
                lisLength++;
            }
        }
        return 1;
    }

    public static long gcd(long a, long b)
    {
        if (a == 0)
            return b;

        return gcd(b%a, a);
    }

    public static long lcm(long a, long b)
    {
        return (a*b)/gcd(a, b);
    }

    static long nCr(long n, long r)
    {
        return fact(n) / (fact(r) * fact(n - r));
    }

    // Returns factorial of n
    static long fact(long n)
    {
        long res = 1;
        for (int i = 2; i <= n; i++)
            res = (res * i)%MOD;
        return res;
    }


    static int MOD = 1000000007;
    static int power(int x, int y, int p)
    {

        // Initialize result
        int res = 1;

        // Update x if it is more than or
        // equal to p
        x = x % p;

        while (y > 0)
        {

            // If y is odd, multiply x
            // with result
            if (y % 2 == 1)
                res = (res * x) % p;

            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }

        return res;
    }

    // Returns n^(-1) mod p
    static int modInverse(int n, int p)
    {
        return power(n, p-2, p);
    }

    static int nCrModPFermat(int n, int r,
                             int p)
    {

        if (r == 0)
            return 1;


        int[] fac = new int[n+1];
        fac[0] = 1;

        for (int i = 1 ;i <= n; i++)
            fac[i] = fac[i-1] * i % p;

        return (fac[n]* modInverse(fac[r], p)
                % p * modInverse(fac[n-r], p)
                % p) % p;
    }

    static int[] phi;

    static void generatePhi(int n){
        phi = new int[n+1];

        for(int i = 0; i<=n; i++){
            phi[i] = i;
        }

        for(int i=2; i<=n; i++){
            if(phi[i]==i){
                for(int j= i; j<=n; j+=i){
                    phi[j] -= (phi[j]/i);
                }
            }
        }
    }

    static int gcdCount(int n, int d){
        return phi[n/d];
    }

    static boolean prime[];
    static int smallestFactor[];

    static void sieveOfEratosthenes(int n)
    {
        prime = new boolean[n+1];
        smallestFactor = new int[n+1];

        smallestFactor[1] = 1;
        for(int i=2;i<n;i++) {
            prime[i] = true;
            smallestFactor[i] = i;
        }

        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p])
            {
                smallestFactor[p] = p;
                for(int i = p*p; i <= n; i += p) {
                    prime[i] = false;
                    smallestFactor[i] = min(p,smallestFactor[i]);
                }
            }
        }

    }

    static double Logx(double n, int x){
        return log(n)/log(x);
    }

    static boolean isPrime(long n){
        if(n<2){
            return false;
        }
        for(int i = 2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static int sumOfDigits(int n){
        int digitSum = 0;
        while (n>0){
            digitSum+=n%10;
            n/=10;
        }
        return digitSum;
    }


    static boolean checkSum(PriorityQueue<Integer> pq, long s){
        long sum = 0;
        while (!pq.isEmpty()){
            sum+= pq.poll();
        }
        if(sum>s){
            return false;
        }

        return true;

    }

    static int dsu[];

    static int findParent(int x){
        if(dsu[x]<0){
            return x;
        }
        return findParent(dsu[x]);
    }


    public static void main(String[] args) {

        int n = sc.nextInt();
        int m = sc.nextInt();

        dsu = new int[n+1];

        Arrays.fill(dsu,-1);

        for(int i =0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            int pu = findParent(u);
            int pv = findParent(v);

            if(u==v || pu==pv){
                continue;
            }

            if(dsu[pu]<dsu[pv]){
                dsu[pu]-=1;
                dsu[v] = u;
            }else{
                dsu[u] = v;
                dsu[pv]-=1;
            }

        }

        int parents = 0;

        for(int i = 1; i<n+1; i++){
            if(dsu[i]<0){
                parents = max(parents,abs(dsu[i]));
            }
        }


        pw.println(parents);


        pw.flush();


    }

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    static class FastReader {
        InputStream is;
        private byte[] inbuf = new byte[1024];
        private int lenbuf = 0, ptrbuf = 0;

        public FastReader(InputStream is) {
            this.is = is;
        }

        public int readByte(){
            if(lenbuf == -1)throw new InputMismatchException();
            if(ptrbuf >= lenbuf){
                ptrbuf = 0;
                try {
                    lenbuf = is.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if(lenbuf <= 0)
                    return -1;
            }
            return inbuf[ptrbuf++];
        }
        public boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }
        public int skip() {
            int b;
            while ((b = readByte()) != -1 && isSpaceChar(b)) ;
            return b;
        }
        public String next(){
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while(!(isSpaceChar(b))) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public String nextLine(){
            int b = readByte();
            StringBuilder sb = new StringBuilder();
            while(b != '\n' || b != '\r'){
                sb.appendCodePoint(b);
            }
            return sb.toString();
        }
        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }
        public long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public char[] next(int n){
            char[] buf = new char[n];
            int b = skip(), p = 0;
            while (p < n && !(isSpaceChar(b))) {
                buf[p++] = (char) b;
                b = readByte();
            }
            return n == p ? buf : Arrays.copyOf(buf, p);
        }
        public char nextChar () {
            return (char) skip();
        }
    }
}