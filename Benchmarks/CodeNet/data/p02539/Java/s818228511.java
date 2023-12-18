import java.util.*;
import java.io.*;
import java.text.*;

class Main{
    //SOLUTION BEGIN
    //Into the Hardware Mode
    final long MOD = 998244353;
    int GEN = 3;
    long[] fact, ifact, pow2;
    int mx = (int)1e5+2;
    void pre() throws Exception{
        fact = new long[mx];
        ifact = new long[mx];
        pow2 = new long[mx];
        fact[0] = ifact[0] = pow2[0] = 1;
        long inv2 = (MOD+1)/2;
        for(int i = 1; i< mx; i++){
            fact[i] = fact[i-1] * i %MOD;
            pow2[i] = pow2[i-1] * inv2 %MOD;
        }
        ifact[mx-1] = pow(fact[mx-1], MOD-2);
        for(int i = mx-2; i > 0; i--)ifact[i] = ifact[i+1] * (i+1) %MOD;
    }
    long pow(long x, long p){
        long o = 1;
        for(; p> 0; p>>=1){
            if((p&1)==1)o = o*x%MOD;
            x = x*x%MOD;
        }
        return o;
    }
    void solve(int TC) throws Exception{
        int N = ni();
        int[] h = new int[mx];
        for(int i = 0; i< 2*N; i++)h[ni()]++;

        int c = 0;
        for(int i = 0; i< mx; i++)if(h[i] > 0){
            h[c++] = h[i];
        }
        h = Arrays.copyOf(h, c);

        PriorityQueue<long[]> pq = new PriorityQueue<>((long[] l1, long[] l2) -> Integer.compare(l1.length, l2.length));
        for(int i:h)pq.add(getP(i));
        while(pq.size() > 1)pq.add(NTT.multiply(pq.poll(), pq.poll(), (int)MOD, GEN));
        long[] ways = Arrays.copyOf(pq.poll(), 1+N);

        for(int i = 0; i<= N; i++){
            ways[i] = ways[i] * numPairs(2*(N-i), (N-i)) %MOD;
        }
        long total = 0;
        for(int i = 0; i<= N; i++){
            if(i%2 == 0)total += ways[i];
            else total += MOD-ways[i];
            if(total >= MOD)total -= MOD;
        }
        pn(total);

    }
    long[] getP(int x){
        long[] P = new long[1+x/2];
        for(int i = 0; i<= x/2; i++)P[i] = numPairs(x, i);
        return P;
    }
    long numPairs(int N, int K){
        if(N < 2*K)return 0;
        return fact[N] * ifact[N-2*K] %MOD * ifact[K] %MOD * pow2[K] %MOD;
    }

    //uwi is great
    static class NTT{
        public static int getGenerator(int MOD){
            long X = MOD-1;
            long[] s = new long[15];int c = 0;
            for(long i = 2; i*i <= MOD-1; i++){
                if(X%i != 0)continue;
                s[c++] = i;
                while(X%i == 0)X/= i;
            }
            if(X > 1)s[c++] = X;
            int root;
            for(root = 3; true; root++){
                boolean f = true;
                for(long x:s)if(pow(root, (MOD-1)/x, MOD) == 1)f = false;
                if(f)break;
            }
            return root;
        }
        public static long[] multiply(long[] a, long[] b, int MOD, int GEN){
            int m = Math.max(2, Integer.highestOneBit(Math.max(a.length, b.length)-1)<<2);
            long[] fa = nttmb(a, m, false, MOD, GEN);
            long[] fb = a == b ? fa : nttmb(b, m, false, MOD, GEN);
            for(int i = 0;i < m;i++)fa[i] = fa[i]*fb[i]%MOD;
            return nttmb(fa, m, true, MOD, GEN);
        }
        private static long[] nttmb(long[] src, int n, boolean inverse, int P, int g){
            long[] dst = new long[n];
            for(int i = 0; i< src.length; i++)dst[i] = src[i];
            int h = Integer.numberOfTrailingZeros(n);
            long K = Integer.highestOneBit(P)<<1;
            int H = Long.numberOfTrailingZeros(K)*2;
            long M = K*K/P;
            int[] wws = new int[1<<h-1];
            long dw = inverse ? pow(g, P-1-(P-1)/n, P) : pow(g, (P-1)/n, P);
            long w = (1L<<32)%P;
            for(int k = 0;k < 1<<h-1;k++, w = modh(w*dw, M, H, P))wws[k] = (int)w;
            long J = invl(P, 1L<<32);
            for(int i = 0;i < h;i++){
                for(int j = 0;j < 1<<i;j++){
                    for(int k = 0, s = j<<h-i, t = s|1<<h-i-1;k < 1<<h-i-1;k++,s++,t++){
                        long u = (dst[s] - dst[t] + 2*P)*wws[k];
                        dst[s] += dst[t];
                        if(dst[s] >= 2*P)dst[s] -= 2*P;
                        long Q = (u<<32)*J>>>32;
                        dst[t] = (u>>>32)-(Q*P>>>32)+P;
                    }
                }
                if(i < h-1)for(int k = 0;k < 1<<h-i-2;k++)wws[k] = wws[k*2];
            }
            for(int i = 0;i < n;i++)if(dst[i] >= P)dst[i] -= P;
            for(int i = 0;i < n;i++){
                int rev = Integer.reverse(i)>>>-h;
                if(i < rev){long d = dst[i]; dst[i] = dst[rev]; dst[rev] = d;}
            }
            long in = invl(n, P);
            if(inverse)for(int i = 0;i < n;i++)dst[i] = modh(dst[i]*in, M, H, P);
            return dst;
        }
        private static long invl(long a, long mod) {
            long b = mod;
            long p = 1, q = 0;
            while (b > 0) {
                long c = a / b, d = a;a = b;b = d % b;
                d = p;p = q;q = d - c * q;
            }
            return p < 0 ? p + mod : p;
        }
        private static long MASK = (1L<<31)-1;
        private static long modh(long a, long M, int h, int mod){
            long r = a-((M*(a&MASK)>>>31)+M*(a>>>31)>>>h-31)*mod;
            return r < mod ? r : r-mod;
        }
        private static long pow(long a, long n, long mod) {
            long ret = 1;
            int x = 63 - Long.numberOfLeadingZeros(n);
            for (; x >= 0; x--){
                ret = ret * ret % mod;
                if (n << 63 - x < 0)ret = ret * a % mod;
            }
            return ret;
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