import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static RUQ d = new RUQ(100005, (1 << 31) - 1);
    static int n, q;
    static int com;
    static int indx;
    static int s, t, x;
    
    public static void main(String[] args) {
        n = sc.nextInt();
        q = sc.nextInt();
        
        for (int i = 0; i < q; i++) {

            com = sc.nextInt();
            if (com == 0) {

                s = sc.nextInt();
                t = sc.nextInt();
                x = sc.nextInt();
                d.update(s, t + 1, x);
            }
            else {
                indx = sc.nextInt();
                out.println(d.query(indx, indx + 1));
            }
        }
        
        out.flush();
    }
}

class RUQ extends LazySqrtDecomposition<Integer> {

    public RUQ(int n, int e) {
        super(n, e);
    }
    
    @Override
    protected Integer f(Integer x, Integer y) {
        return y;
    }
    
    @Override
    protected Integer g(Integer x, Integer y, int t) {
        return y;
    }
    
    @Override
    protected Integer h(Integer x, Integer y) {
        return y;
    }

}

/**
 * @author ei1710
 * @version 1.00
 */

//package toyama.ei1710.DataStructures;
/**
 * モノイドを乗せられる平方分割の抽象クラス.<br>
 * operatorメソッドをオーバライドすることで二項演算を定義する<br>
 * データの区間更新、区間に対する質問クエリをO(sqrt(N))で行う
 *
 * 更新<br>
 * 更新する区間が、bucket_iの管理する区間を完全に含むなら、lazy_iに値を入れる<br>
 * 交差している場合は、対象部分のデータを更新してから、bucket_iを更新する<br>
 *
 * クエリ<br>
 * 質問の対象区間が、bucket_iを完全に含む場合、bucket_iとlazy_iをマージして返す
 * 交差していて、かつlazy_iに値がある場合、その区間のデータを更新後、bucket_iを更新する
 * すると、通常の平方分割と同じになる
 *
 */
abstract class LazySqrtDecomposition<T> {
    /** 生データ */
    protected ArrayList<T> raw_data;
    /** バケットごとに事前に演算した結果を保持 */
    protected ArrayList<T> bucket;
    /** バケット範囲に一様に作用させる値 */
    protected ArrayList<T> lazy;
    
    /** lazyにデータはあるかな？ */
    protected boolean[] lazy_flag;
    /** 単位元 */
    protected T e;
    /** データ数 */
    protected int N;

    protected int sqrtN;

    /** バケットの数 */
    protected int K;
    
    /** 要素と要素の合成 */
    abstract protected T f(T x, T y);

    /** 要素と作用素の合成 bucketとlazyのマージに使うよ */
    abstract protected T g(T x, T y, int t);

    /** 作用素と作用素の合成 lazyにデータが入ってるときに使うよ*/
    abstract protected T h(T x, T y);
    
    /** 単位元eを初期値として要素数nmembの平方分割 */
    public LazySqrtDecomposition(int nmemb, T e) {
        this.e = e;
        N = nmemb;
        sqrtN = 1;
        while (sqrtN * sqrtN < N) sqrtN++;
        
        K = (N + sqrtN - 1) / sqrtN;
        
        raw_data = new ArrayList<T>(N);
        bucket = new ArrayList<T>(K);
        lazy = new ArrayList<T>(K);
        lazy_flag = new boolean[K];
        
        build();
    }
    
    private void build() {

        for (int i = 0; i < N; i++) {
            raw_data.add(e);
        }

        for (int i = 0; i < K; i++) {
            bucket.add(e);
            lazy.add(e);
            lazy_flag[i] = false;
        }
    }
    
    /** bucket[k]の区間に対して、lazy[k]を適用したりbucket[k]を再計算したりする */
    protected void eval(int k) {
        
        T x = e;
        for (int i = k * sqrtN; i < Math.min(N, (k + 1) * sqrtN); i++) {
            if (lazy_flag[k]) {
                raw_data.set(i, g(raw_data.get(i), lazy.get(k), 1));
            }
            x = f(x, raw_data.get(i));
        }
        
        lazy_flag[k] = false;
        bucket.set(k, x);
    }

    
    /** [l, r)区間をdatで更新するよ O(sqrt(N)) */
    public void update(int l, int r, T dat) {
        int s = l / sqrtN;
        int t = (r + sqrtN - 1) / sqrtN;

        int bucket_l, bucket_r;
        
        for (int i = s; i < t; i++) {
            bucket_l = i * sqrtN;
            bucket_r = (i + 1) * sqrtN;
            
            if (l <= bucket_l && bucket_r <= r) {
                if (lazy_flag[i]) {
                    lazy.set(i, h(lazy.get(i), dat));
                }
                else {
                    lazy.set(i, dat);
                }
                lazy_flag[i] = true;
            }
            else {
                eval(i);
                for (int j = Math.max(bucket_l, l); j < Math.min(bucket_r, r); j++) {
                    raw_data.set(j, g(raw_data.get(j), dat, 1));
                }
            }
        }
    }

    /** [l, r)の区間クエリに答える O(sqrt(N)) */
    public T query(int l, int r) {
        int s = l / sqrtN;
        int t = (r + sqrtN - 1) / sqrtN;
        int bucket_l, bucket_r;
        T x = e;
        
        for (int i = s; i < t; i++) {
            bucket_l = i * sqrtN;
            bucket_r = (i + 1) * sqrtN;
            if (l <= bucket_l && bucket_r <= r) {
                if (lazy_flag[i]) {
                    x = f(x, g(bucket.get(i), lazy.get(i), 1));
                }
                else {
                    x = f(x, bucket.get(i));
                }
            }
            else {
                eval(i);
                
                for (int j = Math.max(bucket_l, l); j < Math.min(bucket_r, r); j++) {
                    x = f(x, raw_data.get(j));
                }
            }
        }
        return x;
    }
    
    /** デバッグ情報の印字 */
    public void debugPrint() {
        
        System.err.println("-lazy-");
        for (int i = 0; i < lazy.size(); i++) {
            if (!lazy_flag[i]) {
                System.err.print(" --  ");
            }
            else {
                System.err.print(lazy.get(i));
                System.err.print(' ');
            }
        }
        System.err.print('\n');
        
        System.err.println("-bucket-");
        for (T p : bucket) {
            System.err.print(p);
            System.err.print(' ');
        }
        System.err.print('\n');

        System.err.println("-raw_data-");
        for (T q : raw_data) {
            System.err.print(q);
            System.err.print(' ');
        }
        System.err.print('\n');

        System.err.println("-other data-");
        System.err.printf("N: %d, sqrtN: %d, K: %d\n", N, sqrtN, K);
    }
}

