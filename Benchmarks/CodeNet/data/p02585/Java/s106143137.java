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
    long max;
    int p[];
    int c[];
    int n,k;
    boolean vis[];
    void go(int i){
        List<Integer> al = new ArrayList<>();
        while(!vis[i]){
            al.add(i);
            vis[i]=true;
            i=p[i];
        }
        int l=al.size();
       /* int tl=al.get(l-1);
        int t0=al.get(0);
        al.set(0, tl);
        al.set(l-1, t0);*/
        long pre[]=new long[2*l+1];
        for (int j = 1; j <=2*l; j++) {
            pre[j]=pre[j-1]+c[al.get((j-1)%l)];
        }
        long sum=pre[l]*(k/l);
        if(k/l!=0)max=Math.max(sum,max);
        int x=k%l;
        for (int j = 0; j <l; j++) {
            for (int len = 0; len <=x; len++) {
                 max=Math.max(max, sum+pre[j+len]-pre[j]);
            }
        }
        for (int len = 1; len <=Math.min(2*l,k); len++) {
            for (int j = 0; j <=2*l-len; j++) {
                max=Math.max(max,pre[j+len]-pre[j]);
            }
        }
        
    }
    
     void solve() throws IOException {
        int t = 1;
        //t = ni();
        while (t-- > 0) {
           n=ni();
           k=ni();
           p=new int[n];
           max=Long.MIN_VALUE;
            vis=new boolean[n];
            for (int i = 0; i < n; i++) {
                p[i]=ni()-1;
            }
            c=na(n);
            int maxN=Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                maxN=Math.max(maxN,c[i]);
                if(!vis[i])go(i);
            }
            //out.println(max);
            out.println(Math.max(max,maxN));
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
