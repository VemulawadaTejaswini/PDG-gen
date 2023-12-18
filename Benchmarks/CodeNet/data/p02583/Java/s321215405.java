import java.util.*;
import java.io.*;

class Main {

    Scanner in;
    InputStream is;
    PrintWriter out;
    String INPUT = "";
    
//----------------------------------------------------------------------------------------------------//
    int INF=Integer.MAX_VALUE;
    int mod=(int)(1e9)+7;
    /*long pow(int x,int y,int m){
        if(y==0)return 1;
        long p=pow(x, y>>1, m);
        p=(p*p)%m;
        if((y&1)==1)p=(p*x)%m;
        return p;
    }*/
     void solve() throws IOException {
        int t = 1;
        //t = ni();
        while (t-- > 0) {
            int n=ni();
            int a[]=na(n);
            if(n<3){
                out.println(0);
                return;
            }
            Arrays.sort(a);
            int cnt=0;
            for (int i = 0; i < n-2; i++) {
                for (int j = i+1; j < n-1; j++) {
                    for (int k = j+1; k < n; k++) {
                        if(a[i]==a[j]||a[i]==a[k]||a[j]==a[k])continue;
                        if(!(a[i]+a[j]<=a[k]||a[i]+a[k]<=a[j]||a[k]+a[j]<=a[i]))cnt++;
                    }
                }
            }
            out.println(cnt);
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
