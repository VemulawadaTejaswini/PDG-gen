import java.util.*;
import java.io.*;
import java.text.*;

class Main{
    //SOLUTION BEGIN
    //Into the Hardware Mode
    void pre() throws Exception{}
    void solve(int TC) throws Exception{
        int N = ni(), K = ni();
        int[][] op = new int[K][];
        for(int i = 0; i< K; i++)op[i] = new int[]{ni(), ni()};
        LazySegmentTree st = new LazySegmentTree(N);
        st.update(0,0,1);
        for(int i = 0; i< N; i++){
            long ways = st.sum(i, i);
            for(int[] o:op){
                int l = i+o[0], r = i+o[1];
                if(l > N-1)continue;
                if(r > N-1)r = N-1;
                st.update(l, r, ways);
            }
        }
        pn(st.sum(N-1, N-1));
    }
    static final long MOD = 998244353;
    class LazySegmentTree{
        int m = 1;
        long[] t, lazy;
        public LazySegmentTree(int n){
            while(m<n)m<<=1;
            t = new long[m<<1];
            lazy = new long[m<<1];
        }
        public void print(){
            for(int i = 1; i< m<<1; i++)System.err.println(i+" "+t[i]+" "+lazy[i]);
        }
        public void reset(){
            Arrays.fill(t, 0);
            Arrays.fill(lazy, 0);
        }
        //EDIT
        private void push(int i, int ll, int rr){
            if(lazy[i] != 0){
                t[i] += (lazy[i]*(rr-ll+1))%MOD;
                if(t[i] >= MOD)t[i] -= MOD;
                if(i < m){
                    lazy[i<<1] = (lazy[i<<1]+lazy[i])%MOD;
                    lazy[i<<1|1] = (lazy[i<<1|1]+lazy[i])%MOD;
                }
                lazy[i] = 0;
            }
        }
        public void update(int l, int r, long x){u(l, r, 0, m-1, 1, x);}
        public long sum(int l, int r){return s(l, r, 0, m-1, 1);}

        private void u(int l, int r, int ll, int rr, int i, long x){
            push(i, ll, rr);
            if(l == ll && r == rr){
                lazy[i] += x;
                push(i, ll, rr);return;
            }
            int mid = (ll+rr)/2;
            if(r <= mid){
                u(l, r, ll, mid, i<<1, x);
                push(i<<1|1, mid+1, rr);
            }else if(l > mid){
                push(i<<1, ll, mid);
                u(l, r, mid+1, rr, i<<1|1, x);
            }else{
                u(l, mid, ll, mid, i<<1, x);
                u(mid+1, r, mid+1, rr, i<<1|1, x);
            }
            t[i] = t[i<<1]+t[i<<1|1];//EDIT
            if(t[i] >= MOD)t[i] -= MOD;
        }
        private long s(int l, int r, int ll, int rr, int i){
            push(i, ll, rr);
            if(l == ll && r == rr)return t[i];
            int mid = (ll+rr)/2;
            if(r <= mid)return s(l ,r, ll, mid, i<<1);
            else if(l > mid)return s(l, r, mid+1, rr, i<<1|1);
            else return (s(l, mid, ll, mid, i<<1)+s(mid+1, r, mid+1, rr, i<<1|1))%MOD;//EDIT
        }
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    void exit(boolean b){if(!b)System.exit(0);}
    static void dbg(Object... o){System.err.println(Arrays.deepToString(o));}
    final long IINF = (long)1e17;
    final int INF = (int)1e9+2;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.141592653589793238462643383279502884197169399, eps = 1e-8;
    static boolean multipleTC = false, memory = false, fileIO = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        long ct = System.currentTimeMillis();
        if (fileIO) {
            in = new FastReader("");
            out = new PrintWriter("");
        } else {
            in = new FastReader();
            out = new PrintWriter(System.out);
        }
        //Solution Credits: Taranpreet Singh
        int T = multipleTC? ni():1;
        pre();
        for (int t = 1; t <= T; t++) solve(t);
        out.flush();
        out.close();
        System.err.println(System.currentTimeMillis() - ct);
    }
    public static void main(String[] args) throws Exception{
        if(memory)new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();System.exit(1);}}}, "1", 1 << 28).start();
        else new Main().run();
    }
    int[][] make(int n, int e, int[] from, int[] to, boolean f){
        int[][] g = new int[n][];int[]cnt = new int[n];
        for(int i = 0; i< e; i++){
            cnt[from[i]]++;
            if(f)cnt[to[i]]++;
        }
        for(int i = 0; i< n; i++)g[i] = new int[cnt[i]];
        for(int i = 0; i< e; i++){
            g[from[i]][--cnt[from[i]]] = to[i];
            if(f)g[to[i]][--cnt[to[i]]] = from[i];
        }
        return g;
    }
    int[][][] makeS(int n, int e, int[] from, int[] to, boolean f){
        int[][][] g = new int[n][][];int[]cnt = new int[n];
        for(int i = 0; i< e; i++){
            cnt[from[i]]++;
            if(f)cnt[to[i]]++;
        }
        for(int i = 0; i< n; i++)g[i] = new int[cnt[i]][];
        for(int i = 0; i< e; i++){
            g[from[i]][--cnt[from[i]]] = new int[]{to[i], i, 0};
            if(f)g[to[i]][--cnt[to[i]]] = new int[]{from[i], i, 1};
        }
        return g;
    }
    int find(int[] set, int u){return set[u] = (set[u] == u?u:find(set, set[u]));}
    int digit(long s){int ans = 0;while(s>0){s/=10;ans++;}return ans;}
    long gcd(long a, long b){return (b==0)?a:gcd(b,a%b);}
    int gcd(int a, int b){return (b==0)?a:gcd(b,a%b);}
    int bit(long n){return (n==0)?0:(1+bit(n&(n-1)));}
    void p(Object... o){for(Object oo:o)out.print(oo+" ");}
    void pn(Object... o){for(Object oo:o)out.print(oo+" ");out.println();}
    void pni(Object... o){for(Object oo:o)out.print(oo+" ");out.println();out.flush();}
    String n()throws Exception{return in.next();}
    String nln()throws Exception{return in.nextLine();}
    int ni()throws Exception{return Integer.parseInt(in.next());}
    long nl()throws Exception{return Long.parseLong(in.next());}
    double nd()throws Exception{return Double.parseDouble(in.next());}

    class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception{
            br = new BufferedReader(new FileReader(s));
        }

        String next() throws Exception{
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException  e){
                    throw new Exception(e.toString());
                }
            }
            return st.nextToken();
        }

        String nextLine() throws Exception{
            String str;
            try{
                str = br.readLine();
            }catch (IOException e){
                throw new Exception(e.toString());
            }
            return str;
        }
    }
}