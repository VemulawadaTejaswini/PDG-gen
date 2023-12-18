import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
import java.io.*;
import java.text.*;
class CF_464B{
    //SOLUTION BEGIN
    //Into the Hardware Mode
    void pre() throws Exception{}
    void solve(int TC) throws Exception{
        int N = ni(), Q = ni();
        int[] C = new int[N];
        for(int i = 0; i< N; i++)C[i] = ni()-1;
        int[] prev = new int[N];
        Arrays.fill(prev, -1);
        int[][] qu = new int[Q][];
        for(int i = 0; i< Q; i++)qu[i] = new int[]{i, ni()-1, ni()-1};
        Arrays.sort(qu, (int[] i1, int[] i2) -> Integer.compare(i1[2], i2[2]));
        SegmentTree t = new SegmentTree(N);
        int[] ans = new int[Q];
        for(int i = 0, qq = 0; i< N; i++){
            if(prev[C[i]] != -1)t.update(prev[C[i]], -1);
            prev[C[i]] = i;
            t.update(i, 1);
            while(qq < Q && qu[qq][2] == i){
                ans[qu[qq][0]] = (int)t.query(qu[qq][1], i);
                qq++;
            }
        }
        for(int i:ans)pn(i);
    }
    class SegmentTree{
        int m= 1;
        long[] t;
        public SegmentTree(int n){
            while(m<n)m<<=1;
            t = new long[m<<1];
        }
        public SegmentTree(long[] a){
            while(m<a.length)m<<=1;
            t = new long[m<<1];
            for(int i = 0; i< a.length; i++)t[i+m] = a[i];
            for(int i = m-1; i>0; i--)t[i] = t[i<<1]+t[i<<1|1];
        }
        public void update(int pos, long delta){
            t[pos+=m]+=delta;
            for(pos>>=1;pos>0;pos>>=1)t[pos] = t[pos<<1]+t[pos<<1|1];
        }
        long query(int l, int r){
            long ans = 0;
            for(l+=m,r+=m+1;l<r;l>>=1,r>>=1){
                if((l&1)==1)ans+=t[l++];
                if((r&1)==1)ans+=t[--r];
            }
            return ans;
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
    static boolean multipleTC = false, memory = true, fileIO = false;
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
        if(memory)new Thread(null, new Runnable() {public void run(){try{new CF_464B().run();}catch(Exception e){e.printStackTrace();}}}, "1", 1 << 28).start();
        else new CF_464B().run();
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