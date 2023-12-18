import java.util.*;
import java.io.*;

class Main {

    Scanner in;
    InputStream is;
    PrintWriter out;
    String INPUT = "";
    class DSU{
        int par[];
        int sz[];
        int n;
        DSU(int n){
            this.n=n;
            par=new int[n];
            sz=new int[n];
            for (int i = 0; i < n; i++) {
                par[i]=i;
                sz[i]=1;
            }
        }
        int root(int x){
            if(par[x]==x)return x;
            return par[x]=root(par[x]);
        }
        void union(int u,int v){
            int a=root(u);
            int b=root(v);
            if(a==b)return;
            if(sz[a]<sz[b]){
                int t=a;
                a=b;
                b=t;
            }
            par[b]=a;
            sz[a]+=sz[b];
        }
    }
//----------------------------------------------------------------------------------------------------//
    int INF=Integer.MAX_VALUE;
    int mod=(int)(1e9)+7;
    int MAX=(int)(1e6)+10;
    int spf[];
    Set<Integer> primeFactors;
    
    void seive(){
         primeFactors= new HashSet<>();
        spf=new int[MAX];
        for (int i = 1; i <MAX; i++) {
            spf[i]=i;
        }
        for (int i = 2; i < MAX; i+=2) {
            spf[i]=2;
        }
        for (int i = 3; i <MAX; i++) {
            if(spf[i]==i){
                for (int j = 2*i; j <MAX; j+=i) {
                    spf[j]=Math.min(i,spf[j]);
                }
            }
        }
    }
    boolean isPairwiseCoprime(int x){
        Set<Integer> pf = new HashSet<>();
        
        while(x>1){
            pf.add(spf[x]);
            x=x/spf[x];
        }
        for (Integer p : pf) {
            if(primeFactors.contains(p))return false;
            primeFactors.add(p);
        }
        return true;
    }
    int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
     void solve() throws IOException {
        int tt = 1;
        //tt = ni();
        seive();
        while (tt-- > 0) {
            int n=ni();
            int a[]=na(n);
            String ans[]={"pairwise coprime","setwise coprime","not coprime"};
            int i=0;
            for (; i < n; i++) {
                if(!isPairwiseCoprime(a[i]))
                    break;
            }
            if(i==n){
                out.println(ans[0]);
                return;
            }
            i=1;
            int g=a[0];
            for (; i < n; i++) {
                g=gcd(g, a[i]);
                if(g==1){
                    out.println(ans[1]);
                    return;
                }
            }
            out.println(ans[2]);
        }

    }
//----------------------------------------------------------------------------------------------------//

    void run() throws Exception {
        is = System.in;
        out = new PrintWriter(System.out);

        //long s = System.currentTimeMillis();
        solve();
        out.flush();
        //tr(System.currentTimeMillis() - s + "ms");
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    private byte[] inbuf = new byte[1024];
    public int lenbuf = 0, ptrbuf = 0;

    private int readByte() {
        if (lenbuf == -1) {
            throw new InputMismatchException();
        }
        if (ptrbuf >= lenbuf) {
            ptrbuf = 0;
            try {
                lenbuf = is.read(inbuf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (lenbuf <= 0) {
                return -1;
            }
        }
        return inbuf[ptrbuf++];
    }

    private boolean isSpaceChar(int c) {
        return !(c >= 33 && c <= 126);
    }

    private int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b));
        return b;
    }

    private double nd() {
        return Double.parseDouble(ns());
    }

    private char nc() {
        return (char) skip();
    }

    private String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!(isSpaceChar(b))) {  // when nextLine(take whole line as input wid space), (!isSpaceChar(b) || b == ' ') 
            //if(b!=' ') to remove spaces in Str when taking spaces in Str
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while (p < n && !(isSpaceChar(b))) {
            buf[p++] = (char) b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for (int i = 0; i < n; i++) {
            map[i] = ns(m);
        }
        return map;
    }

    private int[] na(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ni();
        }
        return a;
    }

    private int ni() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    /*private boolean oj = System.getProperty("ONLINE_JUDGE") != null;
    
    private void tr(Object... o) {
        if (!oj) {
            System.out.println(Arrays.deepToString(o));
            
        }
    }*/

}
