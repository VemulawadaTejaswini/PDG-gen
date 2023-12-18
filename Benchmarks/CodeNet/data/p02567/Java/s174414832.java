import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Q = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        SegTree seg = new SegTree(A, -1, (x,y) -> Math.max(x, y));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int q = sc.nextInt();
            if(1 == q){
                int k = sc.nextInt()-1, a = sc.nextInt() ;
                seg.set(k, a);
            }else if(2 == q){
                int l = sc.nextInt()-1, r = sc.nextInt();
                sb.append(seg.query(l, r) + "\n");
            }else{
                int l = sc.nextInt()-1, v = sc.nextInt();
                int j = seg.maxRight(l, x -> x < v) + 1;
                sb.append(j + "\n");
            }
        }
        System.out.println(sb.toString());
        sc.close();

    }

}

class SegTree {

    /** SegTreeで扱う要素数 */
    private int n;
    /** nより大きい最小の2の累乗数 */
    private int size;
    /** 単位元 */
    private int e;
    /** 演算 */
    private IntBinaryOperator op;
    /**
     * 要素全体を含むノードのindex：0.
     * k番目(0-indexed)の要素のindex：k + size - 1
     * ノードkの親要素のindex：(k - 1) / 2.
     * ノードkの子要素のうち左側のindex：k*2+1.
     * ノードkの子要素のうち右側のindex：k*2+2.
     */
    private int[] data;

    /**
     * コンストラクタ.
     * @param n 要素数
     * @param e 単位元
     * @param op 演算
     */
    public SegTree(int n, int e, IntBinaryOperator op){
        this.n = n;
        this.e = e;
        this.op = op;
        size = 1;
        while(size < n) size *= 2;
        data = new int[size*2];
        Arrays.fill(data, e);
    }

    /**
     * コンストラクタ.
     * @param a 初期配列
     * @param e 単位元
     * @param op 演算
     */
    public SegTree(int[] a, int e, IntBinaryOperator op){
        this.n = a.length;
        this.e = e;
        this.op = op;
        size = 1;
        while(size < n) size *= 2;
        data = new int[size*2];
        Arrays.fill(data, e);
        for (int i = 0; i < n; i++) data[i + size - 1] = a[i];
        for (int i = size-2; i >= 0; i--) update(i);
    }

    /**
     * k番目の要素を取得する.
     * 計算量：O(1)
     * @param k
     * @return k番目の要素の値
     */
    public int get(int k) {
        return data[k + size - 1];
    }

    /**
     * k番目（0-indexed）の要素をaに更新します.
     * @param k 変更対象要素のindex（0-indexed）
     * @param v 変更後の値
     */
    public void set(int k, int v){
        k += size - 1;
        data[k] = v;
        while(0 < k){
            k = (k - 1) / 2;
            update(k);
        }
    }

    private void update(int k) {
        data[k] = op.applyAsInt(data[k * 2 + 1], data[k * 2 + 2]);
    }

    public int query(int l, int r){
        return query(l, r, 0, 0, size);
    }

    /**
     * 区間[a, b)での○○を求めます.
     * 最初に呼ぶ際は、query(a, b, 0, 0, size)として呼ぶ.
     * @param l 求める区間の下限（含む）
     * @param r 求める区間の上限（含まない）
     * @param k 確認するノードのindex
     * @param a 確認するノードの下限（含む）
     * @param b 確認するノードの上限（含まない）
     * @return 区間[a, b)での○○
     */
    private int query(int l, int r, int k, int a, int b){
        if(b <= l || r <= a) return e;

        if(l <= a && b <= r) return data[k];

        int vl = query(l, r, k*2+1, a, (a+b)/2);
        int vr = query(l, r, k*2+2, (a+b)/2, b);
        return op.applyAsInt(vl, vr);
    }

    public int maxRight(int l, IntPredicate pr) {
        return maxRight(l, n, pr);
    }

    public int maxRight(int l, int r, IntPredicate pr) {
        int idx = l + size - 1;
        int li = l, ri = l, width = 1;
        int applied = e;
        while(ri < size) {
            int tmp = op.applyAsInt(applied, data[idx]);
            if(ri < r && pr.test(tmp)) {
                applied = tmp;
                if((idx&1) == 1) {
                    idx++;
                }else {
                    idx = (idx-1)/2 +1;
                    width *= 2;
                }
                li = ri + 1;
                ri = li + width -1;
            }else {
                if(size - 1 <= idx) {
                    return li;
                }
                idx = idx*2+1;
                width /= 2;
                ri -= width;
            }
        }
        return r;
    }
}
