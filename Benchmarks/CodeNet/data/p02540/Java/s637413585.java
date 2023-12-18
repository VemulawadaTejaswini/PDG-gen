import java.util.*;
import java.io.*;
// import java.io.PrintWriter; 

public class Main {
    public static void main(String[] args) throws Exception {
   
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt()-1; 
            arr[i][1] = sc.nextInt()-1;  
            arr[i][2] = i;
        }
        
      
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            a[i][0] = arr[i][0];
            a[i][1] = arr[i][1];
            a[i][2] = arr[i][2];
        }
        Arrays.sort(a, (ax, bx) -> Integer.compare(ax[0], bx[0]));
        
    
        int[][] b = new int[n][3];
        for (int i = 0; i < n; i++) {
            b[i][0] = arr[i][0];
            b[i][1] = arr[i][1];
            b[i][2] = arr[i][2];
        }
        Arrays.sort(b, (ax, bx) -> Integer.compare(ax[1], bx[1]));
        
        UnionFind uf = new UnionFind(n);
        
    
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = n-1; i >= 0; i--) {
            int nowy = a[i][1];
            int idx = a[i][2];
            
            if (map.higherKey(nowy) != null) {
                int key = map.higherKey(nowy);
                int val = map.get(key);
                uf.unite(idx, val);
              
            }
            map.put(nowy, idx);
        }
      
        map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int nowx = b[i][0];
            int idx = b[i][2];
            
            if (map.lowerKey(nowx) != null) {
                int key = map.lowerKey(nowx);
                int val = map.get(key);
                uf.unite(idx, val);
              
            }
            map.put(nowx, idx);
        }
       
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < n; i++) {
            int res = uf.size[uf.rot(i)];
            out.println(res);
        }    
        out.flush();
    }
    
    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
        
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
        
        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        
        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        
            return tokenizer.nextToken("\n");
        }
        
        public long nextLong() {
            return Long.parseLong(next());
        }
        
        public int nextInt() {
            return Integer.parseInt(next());
        }
        
        public double nextDouble() {
             return Double.parseDouble(next());
        }
        
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
        
        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        } 
    }
}

class UnionFind {
    int[] par;  
    int[] size; 
               
    int cnt;

    UnionFind(int n) {
        par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        
        size = new int[n];
        Arrays.fill(size, 1);
        cnt = n;
    }

    int rot(int x) {
        if (par[x] == x) return x;
        return par[x] = rot(par[x]);
       
    }
    
    void unite(int x, int y) {
        int rx = rot(x);
        int ry = rot(y);
        if (rx != ry) {
            par[ry] = rx;
            
            int resize = size[rx] + size[ry];
            size[rx] = resize;
            size[ry] = resize;
            cnt--;
        }
    }
    
   
    boolean eq(int x, int y) {
        int cx = rot(x);
        int cy = rot(y);
        return cx == cy;
    }
}