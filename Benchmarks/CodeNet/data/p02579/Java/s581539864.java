import java.util.*;
import java.io.*;

class Main {

    Scanner in;
    InputStream is;
    PrintWriter out;
    String INPUT = "";
    class Dsu {

        int par[];
        int size[];
        Dsu(int n) {
            par = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                par[i] = i;
                size[i] = 1;
            }
        }

        int root(int i) {
            if (i == par[i]) {
                return i;
            }
            return par[i] = root(par[i]);
        }

        void union(int p, int q) {
            int a = root(p);
            int b = root(q);
            if (a == b) {
                return;
            }
            if (size[a] < size[b]) {
                int temp = a;
                a = b;
                b = temp;
            }
            par[b] = a;
            size[a] += size[b];
        }


    }
//----------------------------------------------------------------------------------------------------//
    int INF=Integer.MAX_VALUE;
    int mod=(int)(1e9)+7;
    int n,m,src[],des[],s,d;
    char mat[][];
    int dx[]=new int[]{1,-1,0,0};    
    int dy[]=new int[]{0,0,1,-1}; 
    int  rootIdx[][];
    Set<Integer>adj[];
    boolean vis[];
    Dsu uf;
    void graph(int n){
        adj=new HashSet[n];
        vis=new boolean[n];
        for (int i = 0; i < n; i++) {
            adj[i]=new HashSet<>();
        }
    }
    void addEdge(int u,int v){
        adj[u].add(v);
        adj[v].add(u);
    }
    
    boolean isValid(int i,int j){
        return (!(i<0||j<0||i>=n||j>=m||mat[i][j]=='#'));
    }
    
    void connectAll(int x,int y){
        int u=rootIdx[x][y];
        for (int i = Math.max(0, x-2); i < Math.min(n, x+3); i++) {
            for (int j = y; j < Math.min(m,y+3); j++) {
                int v=rootIdx[i][j];
                if(u!=v&&v!=-1)addEdge(u, v);
            }
        }
    }
    int bfs(){
        int cnt=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            
            int nq=q.size();
            for (int i = 0; i < nq; i++) {
                int u=q.poll();
                vis[u]=true;
                if(u==d)return cnt;
                for (Integer v : adj[u]) {
                    if(!vis[v])
                        q.add(v);
                }
            }
            cnt++;
            
        }
        return -1;
    }
     void solve() throws IOException {
        int tt = 1;
        //t = ni();
        while (tt-- > 0) {
           n=ni();
           m=ni();
           mat=new char[n][m];
            src=new int[2];
            des=new int[2];
            src[0]=ni()-1;
            src[1]=ni()-1;
            des[0]=ni()-1;
            des[1]=ni()-1;
             for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j]=nc();
                }
            }
             uf=new Dsu(n*m);
             for (int i = 0; i < n; i++) {
                 for (int j = 0; j < m; j++){ 
                     if(mat[i][j]=='#')continue;
                     for (int k = 0; k < 4; k++) {
                         int x=i+dx[k];
                         int y=j+dy[k];
                         if(isValid(x, y)){
                             uf.union(i*m+j, x*m+y);
                         }
                     }
                 }
            }
             if(uf.root(src[0]*m+src[1])==uf.root(des[0]*m+des[1])){
                 out.println(0);
                 return;
             }
             rootIdx=new int[n][m];
             for (int i = 0; i < n; i++) {
                Arrays.fill(rootIdx[i],-1);
            }
             Map<Integer, Integer> rootID = new HashMap<>();
            int idx=0;
             for (int i = 0; i < n; i++) {
                 for (int j = 0; j < m; j++) {
                     if(mat[i][j]=='#')continue;
                     int r=uf.root(i*m+j);
                     if(!rootID.containsKey(r))rootID.put(r, idx++);
                 }
            }
             for (int i = 0; i < n; i++) {
                 for (int j = 0; j < m; j++) {
                     if(mat[i][j]=='#')continue;
                     int r=uf.root(i*m+j);
                     rootIdx[i][j]=rootID.get(r);
                 }
            }
             
             /*for (Integer r : roots.keySet()) {
                 out.println(r+" "+roots.get(r));
            }*/
             graph(idx);
             s=rootIdx[src[0]][src[1]];
             d=rootIdx[des[0]][des[1]];
            // out.println(s+"->"+d);
             /*for (int i = 0; i < n; i++) {
                 for (int j = 0; j < m; j++) {
                     if(mat[i][j]=='#')continue;
                     connectAll(i, j);
                 }
            }*/
             
            out.println(bfs()); 
            //out.println(-1);
             
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
