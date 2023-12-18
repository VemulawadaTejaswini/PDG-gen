import java.util.*;

public class Main {

static int n;
static long[] lazy;
static long[] node;
static long[] min;
static long INF = (1<<31)-1;

static void eval(int k, int l, int r) {
    if (lazy[k]!=0) {
        node[k] += lazy[k];
        min[k] += lazy[k]/(r-l);
        if (r-l>1) {
            lazy[2*k+1] += lazy[k]/2;
            lazy[2*k+2] += lazy[k]/2;
        }
        lazy[k] = 0;
    }
}

static void add(int a, int b, int x, int k, int l, int r) {
    eval(k, l, r);
    if (a<=l && r<=b) {
        lazy[k] += (long)x*(r-l);
        // min[k] += x;
        eval(k, l, r);
    } else if (b<=l || r<=a) {
    } else {
        add(a, b, x, 2*k+1, l, (l+r)/2);
        add(a, b, x, 2*k+2, (l+r)/2, r);
        min[k] = Math.min(min[2*k+1], min[2*k+2]);
    }
}

static void update(int k, int x) {
    min[n-1+k] = x;
    int tmp = n-1+k;
    while (tmp>0) {
        tmp = (tmp-1)/2;
        min[tmp] = Math.min(min[2*tmp+1], min[2*tmp+2]);
    }
}

static long query(int a, int b, int k, int l, int r) {
    eval(k, l, r);
    if (a<=l && r<=b) {
        return min[k];
    } else if (b<=l || r<=a) {
        return INF;
    } else {
        long lv = query(a, b, 2*k+1, l, (l+r)/2);
        long rv = query(a, b, 2*k+2, (l+r)/2, r);
        return Math.min(lv, rv);
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n_ = sc.nextInt();
        n = 1;
        while (n<n_) n*=2;
        lazy = new long[2*n-1];
        node = new long[2*n-1];
        min = new long[2*n-1];
        // Arrays.fill(min, INF);
        // for (int i=0;i<n_;i++) {
            // update(i, 0);
        // }
        // System.out.println(Arrays.toString(min));

        int q = sc.nextInt();
        for (int i=0;i<q;i++) {
            int com = sc.nextInt();
            if (com==0) {
                int s = sc.nextInt();
                int t = sc.nextInt();
                int x = sc.nextInt();
                add(s, t+1, x, 0, 0, n);
            } else { // com==1
                int s = sc.nextInt();
                int t = sc.nextInt();
                System.out.println(query(s, t+1, 0, 0, n));
            }
        }
        // System.out.println(Arrays.toString(min));
        // System.out.println(Arrays.toString(lazy));
        // System.out.println(Arrays.toString(node));
    }
}
