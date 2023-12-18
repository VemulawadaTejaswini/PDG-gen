import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.next())-1;
            y[i] = Integer.parseInt(sc.next())-1;
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
        for (int i = n-1; i >= 0; i--) {
            int nowx = b[i][0];
            int idx = b[i][2];
            
            if (map.higherKey(nowx) != null) {
                int key = map.higherKey(nowx);
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
}

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