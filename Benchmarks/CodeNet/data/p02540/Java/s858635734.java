import java.util.*;
import java.io.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        // Scanner sc = new Scanner(System.in);
        // FastScanner sc = new FastScanner(System.in);
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt()-1;
            y[i] = sc.nextInt()-1;
        }
        
        int[][] array = new int[n][3];
        for (int i = 0; i < n; i++) {
            array[i][0] = x[i];
            array[i][1] = y[i];
            array[i][2] = i;
        }
        
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            a[i][0] = array[i][0];
            a[i][1] = array[i][1];
            a[i][2] = array[i][2];
        }
        Arrays.sort(a, (ax, bx) -> Integer.compare(ax[0], bx[0]));
        int[][] b = new int[n][3];
        for (int i = 0; i < n; i++) {
            b[i][0] = array[i][0];
            b[i][1] = array[i][1];
            b[i][2] = array[i][2];
        }
        Arrays.sort(b, (ax, bx) -> Integer.compare(ax[1], bx[1]));
        
        int[] ans = new int[n];
        
        // SegmentTree<Integer> seg = new SegmentTree<>(n, Integer::sum, 0);
        
        // // 初期の配列を取得
        // for (int i = 0; i < n; i++) {
        //     seg.update(i, 0);
        // }
        
        // for (int i = 0; i < n; i++) {
        //     int nowy = a[i][1];
        //     seg.update(nowy, 1);
            
        //     int res = seg.query(0, nowy);
        //     int ans_idx = a[i][2];
        //     ans[ans_idx] += res;
        //     // System.out.println(res);
        // }
        
        // seg = new SegmentTree<>(n, Integer::sum, 0);
        
        // // 初期の配列を取得
        // for (int i = 0; i < n; i++) {
        //     seg.update(i, 0);
        // }
        
        // for (int i = n-1; i >= 0; i--) {
        //     int nowy = a[i][1];
        //     seg.update(nowy, 1);
            
        //     int res = seg.query(nowy+1, n);
        //     int ans_idx = a[i][2];
        //     ans[ans_idx] += res;
        //     // System.out.println(res);
        // }
        
        // for (Integer an : ans) {
        //     // System.out.println(an+1);
        // }
        
        UnionFind uf = new UnionFind(n);
        
        // ←
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = n-1; i >= 0; i--) {
            int nowy = a[i][1];
            int idx = a[i][2];
            
            if (map.higherKey(nowy) != null) {
                int key = map.higherKey(nowy);
                int val = map.get(key);
                uf.unite(idx, val);
                // System.out.println(i + " " + idx + " " + val);
            }
            map.put(nowy, idx);
        }
        // System.out.println(map.toString());
        
        // ↓
        map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int nowx = b[i][0];
            int idx = b[i][2];
            
            if (map.lowerKey(nowx) != null) {
                int key = map.lowerKey(nowx);
                int val = map.get(key);
                uf.unite(idx, val);
                // System.out.println(i + " " + idx + " " + val);
            }
            map.put(nowx, idx);
        }
        // System.out.println(map.toString());
        
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < n; i++) {
            int res = uf.size[uf.root(i)];
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
    
// 	// <Fast Scanner> START -------------------------------------------------
// 	static InputStream in = System.in;
// 	static  byte[] buffer = new byte[1024];
// 	static int length = 0, p = 0;
// 	public static boolean hasNextByte () {
// 		if (p < length) return true;
// 		else {
// 			p = 0;
// 			try {length = in.read(buffer);}
// 			catch (Exception e) {e.printStackTrace();}
// 			if (length == 0) return false;
// 		}
// 		return true;
// 	}
// 	public static int readByte () {
// 		if (hasNextByte() == true) return buffer[p++];
// 		return -1;
// 	}
// 	public static boolean isPrintable (int n) {return 33<=n&&n<=126;}
// 	public static void skip () {
// 		while (hasNextByte() && !isPrintable(buffer[p])) p++;
// 	}
// 	public static boolean hasNext () {skip(); return hasNextByte();}
// 	public static String next () {
// 		if (!hasNext()) throw new NoSuchElementException();
// 		StringBuilder sb = new StringBuilder();
// 		int temp = readByte();
// 		while (isPrintable(temp)) {
// 			sb.appendCodePoint(temp);
// 			temp = readByte();
// 		}
// 		return sb.toString();
// 	}
// 	public static int nextInt () {return Math.toIntExact(nextLong());}
// 	public static int[] nextInts (int n) {
// 		int[] ar = new int[n];
// 		for (int i=0; i<n; i++) ar[i] = nextInt();
// 		return ar;
// 	}
// 	public static long nextLong () {
// 		if (!hasNext()) throw new NoSuchElementException();
// 		boolean minus = false;
// 		int temp = readByte();
// 		if (temp == '-') {
// 			minus = true;
// 			temp = readByte();
// 		}
// 		if (temp<'0' || '9'<temp) throw new NumberFormatException();
// 		long n = 0;
// 		while (isPrintable(temp)) {
// 			if ('0'<=temp && temp<='9') {
// 				n *= 10;
// 				n += temp - '0';
// 			}
// 			temp = readByte();
// 		}
// 		return minus? -n : n;
// 	}
// 	// <Fast Scanner> END ----------------------------------------------------------
}

// class FastScanner {
//     private final InputStream in = System.in;
//     private final byte[] buffer = new byte[1024];
//     private int ptr = 0;
//     private int buflen = 0;
//     private boolean hasNextByte() {
//         if (ptr < buflen) {
//             return true;
//         }else{
//             ptr = 0;
//             try {
//                 buflen = in.read(buffer);
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//             if (buflen <= 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
//     private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
//     private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
//     public boolean hasNext() { skipUnprintable(); return hasNextByte();}
//     public String next() {
//         if (!hasNext()) throw new NoSuchElementException();
//         StringBuilder sb = new StringBuilder();
//         int b = readByte();
//         while(isPrintableChar(b)) {
//             sb.appendCodePoint(b);
//             b = readByte();
//         }
//         return sb.toString();
//     }
//     public long nextLong() {
//         if (!hasNext()) throw new NoSuchElementException();
//         long n = 0;
//         boolean minus = false;
//         int b = readByte();
//         if (b == '-') {
//             minus = true;
//             b = readByte();
//         }
//         if (b < '0' || '9' < b) {
//             throw new NumberFormatException();
//         }
//         while(true){
//             if ('0' <= b && b <= '9') {
//                 n *= 10;
//                 n += b - '0';
//             }else if(b == -1 || !isPrintableChar(b)){
//                 return minus ? -n : n;
//             }else{
//                 throw new NumberFormatException();
//             }
//             b = readByte();
//         }
//     }
// }


class UnionFind {
    int[] par;  // 自身の親
    int[] size; // ※(自身の属するグループの要素数はsize[uf.root(i)]。)
                // (※[i]全てに対して↑を更新するのは時間がかかるので)
    int connectedComponent;

    UnionFind(int n) {
        par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        
        size = new int[n];
        Arrays.fill(size, 1);
        connectedComponent = n;
    }

    int root(int x) {
        if (par[x] == x) return x;
        return par[x] = root(par[x]);
        // 1-2-4の場合、4の親=2を4の根=1に繋ぎ変えた上で親を返す
        // ↑根まで辿る深さ(計算量)を減らす為
        // return a = b;とは、aにbを代入し、aを返すという意味
    }
    
    // 点x, yを連結させる=同じグループにする
    void unite(int x, int y) {
        int rx = root(x);
        int ry = root(y);
        if (rx != ry) {
            par[ry] = rx;
            
            int resize = size[rx] + size[ry];
            size[rx] = resize;
            size[ry] = resize;
            connectedComponent--;
        }
    }
    
    // 同グループか否か
    boolean same(int x, int y) {
        int rx = root(x);
        int ry = root(y);
        return rx == ry;
    }
}

// class SegmentTree<T> {
//     // dat: 0-indexed
//     // 00000000
//     // 11112222
//     // 33445566
//     // 789ABCDE ... a[0]-a[n]
    
//     final T[] dat;              // データを格納する配列
//     final int n;                // datの一番下のレベルの要素数
//     final BinaryOperator<T> f;  // 二項演算子
//     final T e;                  // 単位元

//     // 単位元で埋めて新規作成
//     public SegmentTree(int len, BinaryOperator<T> f, T e) {
//         int n = 1;
//         while (n < len) n <<= 1;
//         this.n = n;
//         this.f = f;
//         this.e = e;
//         this.dat = (T[]) new Object[n << 1];
//         Arrays.fill(dat, e);
//     }
    
//     // 一点更新(a[i] = x) O(logN)
//     public void update(int i, T x) {
//         i += n - 1;
//         dat[i] = x;
//         while (i > 0) {
//             i = (i - 1) / 2;  // i: parent of vl/vr
//             T vl = dat[i * 2 + 1];
//             T vr = dat[i * 2 + 2];
//             dat[i] = f.apply(vl, vr);
//         }
//     }
    
//     // 区間取得[a, b) O(logN)
//     public T query(int a, int b) { return query_sub(a, b, 0, 0, n); }
//     public T query_sub(int a, int b, int k, int l, int r) {
//         if (r <= a || b <= l) {             // outside completely
//             return e;
//         } else if (a <= l && r <= b) {      // inside completely
//             return dat[k];
//         } else {
//             T vl = query_sub(a, b, k * 2 + 1, l, (l + r) / 2);
//             T vr = query_sub(a, b, k * 2 + 2, (l + r) / 2, r);
//             return f.apply(vl, vr);
//         }
//     }
    
//     // 使用例
//     // Range Sum Query
//     // SegmentTree<Integer> seg = new SegmentTree<>(n, Integer::sum, 0);
//     // SegmentTree<Long> seg = new SegmentTree<>(n, Long::sum, 0L);
    
//     // Range Minimum Query
//     // SegmentTree<Integer> seg = new SegmentTree<>(n, Integer::min, Integer.MAX_VALUE);
    
//     // Range Maximum Query
//     // SegmentTree<Long> seg = new SegmentTree<>(n, Long::max, Long.MIN_VALUE);
// }