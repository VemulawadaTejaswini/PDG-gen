
import java.util.*;
import java.io.*;

class Main {

    Scanner in;
    InputStream is;
    PrintWriter out;
    String INPUT = "";
    
    
     int MAX = 1000001; 
   class Query  { 
        int l, r, idx; 
    } 
     void update(int idx, int val, int bit[], int n)  { 
        for (; idx <= n; idx += idx & -idx) 
            bit[idx] += val; 
    } 
   int query(int idx, int bit[], int n)  { 
        int sum = 0; 
        for (; idx > 0; idx -= idx & -idx) 
            sum += bit[idx]; 
        return sum; 
    } 
    void answeringQueries(int[] arr, int n, Query[] queries, int q){ 
  
        int[] bit = new int[n + 1]; 
        Arrays.fill(bit, 0); 
        int[] last_visit = new int[MAX]; 
        Arrays.fill(last_visit, -1); 
        int[] ans = new int[q]; 
        int query_counter = 0; 
        for (int i = 0; i < n; i++)  
        { 
            if (last_visit[arr[i]] != -1) 
                update(last_visit[arr[i]] + 1, -1, bit, n);
            
            last_visit[arr[i]] = i; 
            update(i + 1, 1, bit, n); 
            while (query_counter < q && queries[query_counter].r == i) { 
                ans[queries[query_counter].idx] =  
                        query(queries[query_counter].r + 1, bit, n) 
                        - query(queries[query_counter].l, bit, n); 
                query_counter++; 
            } 
        } 
        for (int i = 0; i < q; i++) 
            System.out.println(ans[i]); 
    } 
  
    
//----------------------------------------------------------------------------------------------------//
    int INF=Integer.MAX_VALUE;
    int mod=(int)(1e9)+7;
    long pow(int x,int y,int m){
        if(y==0)return 1;
        long p=pow(x, y>>1, m);
        p=(p*p)%m;
        if((y&1)==1)p=(p*x)%m;
        return p;
    }
     void solve() throws IOException {
        int t = 1;
        //t = ni();
        while (t-- > 0) {
            int n=ni();
            int q=ni();
            int ar[]=na(n);
            Query[] queries = new Query[q];
            for (int i = 0; i < q; i++) {
                queries[i] = new Query(); 
                queries[i].l = ni()-1; 
                queries[i].r = ni()-1; 
                queries[i].idx = i; 
            }
           Arrays.sort(queries, new Comparator<Query>()  
        { 
            public int compare(Query x, Query y) 
            { 
                if (x.r < y.r) 
                    return -1; 
                else if (x.r == y.r) 
                    return 0; 
                else
                    return 1; 
            } 
        }); 
            answeringQueries(ar, n, queries, q); 
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
