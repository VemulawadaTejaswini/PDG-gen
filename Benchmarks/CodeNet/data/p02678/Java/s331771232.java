import java.io.*;
import java.math.BigInteger;
import java.util.*;

// written by luchy0120

public class Main {
    public static void main(String[] args) throws Exception {

        new Main().run();
    }






    void solve() {
        int n = ni();
        int m = ni();

        List g[] = new ArrayList[n+1];

        for(int i=1;i<=n;++i){
            g[i] = new ArrayList();
        }

        for(int i=0;i<m;++i){
            int a = ni();
            int b = ni();
            g[a].add(b);
            g[b].add(a);
        }

        int q[]  =new int[1000000];
        int e = 0 ;int s = 0;
        q[e++] = 1;

        boolean vis[]  = new boolean[n+1];
        vis[1] = true;
        int back[] = new int[n+1];
        int ct =1;
        while(s<e){
            int c = q[s++];

            for(Object gg: g[c]){
                int go  = (int) gg;

                if(!vis[go]){
                    vis[go] = true;
                    back[go] = c;
                    q[e++] = go;
                    ct++;
                }
            }


        }
        if(ct==n){
            println("Yes");
            for(int i=2;i<=n;++i){
                println(back[i]);
            }
        }else{
            println("No");
        }


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