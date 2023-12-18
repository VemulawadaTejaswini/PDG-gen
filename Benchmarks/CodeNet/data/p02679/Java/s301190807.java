import java.io.*;
import java.math.BigInteger;
import java.util.*;

// written by luchy0120

public class Main {
    public static void main(String[] args) throws Exception {

        new Main().run();
    }


    long gcd(long a,long b){
        return b==0?a:gcd(b,a%b);
    }

    class Pair{
        long x;long y;
        Pair(long xx,long yy){
            long fk = gcd(Math.abs(xx),Math.abs(yy));
            x =xx/fk;y =yy/fk;

            if(x<=0&&y<=0){
                x= -x;y=-y;
            }else if(x<=0||y<=0){
                x = -Math.abs(x);
                y = Math.abs(y);
            }

        }
        public int hashCode(){
            return Long.hashCode(x)<<17+Long.hashCode(y);
        }
        public boolean equals(Object other){
            Pair p = (Pair) other;
            return p.x==x&&p.y==y;
        }

        public Pair get() {
            return new Pair(-y, x);
        }
    }


    void solve() {
        int n = ni();

        HashMap<Pair,Integer> mp = new HashMap<>();
        long r = 0;
        int z = 0;
        for(int i=0;i<n;++i){
            long x = ni();
            long y = ni();
            if(x==y&&x==0){
                z++;
            }else{

                Pair cur = new Pair(x,y);
                mp.put(cur,mp.getOrDefault(cur,0)+1);


            }
        }

        long mod = 1000000007;
        long f[] = new long[200001];
        f[0] =1;
        for(int i=1;i<=200000;++i){
            f[i] = f[i-1]*2L;
            f[i] %= mod;
        }



        Set<Pair> st = new HashSet<>();
        r = 1;
        for(Pair k:mp.keySet()){
            if(st.contains(k)) continue;
            Pair ck = k.get();
            st.add(ck);
            if(mp.containsKey(ck)){
                r *= f[mp.get(k)] + f[mp.get(ck)]-1;
                r %= mod;
            }else{
                r *= f[mp.get(k)];
                r %= mod;
            }
        }
        r--;
        r += z;
        r %= mod;

        r= (r + mod)%mod;



        println(r);

    }

    double dis(long x,long y,long a,long b){
        long v = (x-a)*(x-a)+(y-b)*(y-b);
        return Math.sqrt(v);
    }







    InputStream is;
    PrintWriter out;

    void run() throws Exception {
        //is = new FileInputStream(new File("C:\\Users\\Luqi\\Downloads\\P3387_9.in"));
        is = System.in;
        out = new PrintWriter(System.out);

        solve();
        out.flush();
    }

    private byte[] inbuf = new byte[1024];
    public int lenbuf = 0, ptrbuf = 0;

    private int readByte() {
        if (lenbuf == -1) throw new InputMismatchException();
        if (ptrbuf >= lenbuf) {
            ptrbuf = 0;
            try {
                lenbuf = is.read(inbuf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (lenbuf <= 0) return -1;
        }
        return inbuf[ptrbuf++];
    }

    private boolean isSpaceChar(int c) {
        return !(c >= 33 && c <= 126);
    }

    private int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b)) ;
        return b;
    }

    private double nd() {
        return Double.parseDouble(ns());
    }

    private char nc() {
        return (char) skip();
    }

    private char ncc() {
        int b = readByte();
        return (char) b;
    }

    private String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
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

    private String nline() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!isSpaceChar(b) || b == ' ') {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[][] nm(int n, int m) {
        char[][] a = new char[n][];
        for (int i = 0; i < n; i++) a[i] = ns(m);
        return a;
    }

    private int[] na(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = ni();
        return a;
    }

    private long[] nal(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = nl();
        return a;
    }

    private int ni() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) {
        }
        ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') num = (num << 3) + (num << 1) + (b - '0');
            else return minus ? -num : num;
            b = readByte();
        }
    }

    private long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) {
        }
        ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') num = num * 10 + (b - '0');
            else return minus ? -num : num;
            b = readByte();
        }
    }

    void print(Object obj) {
        out.print(obj);
    }

    void println(Object obj) {
        out.println(obj);
    }

    void println() {
        out.println();
    }

    void printArray(int a[],int from){
        int l = a.length;
        for(int i=from;i<l;++i){
            print(a[i]);
            if(i!=l-1){
                print(" ");
            }
        }
        println();
    }

    void printArray(long a[],int from){
        int l = a.length;
        for(int i=from;i<l;++i){
            print(a[i]);
            if(i!=l-1){
                print(" ");
            }
        }
        println();
    }
}