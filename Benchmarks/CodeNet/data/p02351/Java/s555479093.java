import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
       int  N = sc.nextInt();
        int q = sc.nextInt();
        SegmentLazy seg = new SegmentLazy(N);
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if (t == 0) {
                seg.add( sc.nextInt() - 1, sc.nextInt(), sc.nextInt());
            } else {
                System.out.println(seg.sum( sc.nextInt() - 1,  sc.nextInt()));
            }
        }
    }
        static class SegmentLazy {
        int n;
        long[] sum, min, max, lazy;
        int[] mini, maxi;

        SegmentLazy(int size) {
            n = 1;
            while (n < size) n *= 2;
            sum = new long[2 * n - 1];
            min = new long[2 * n - 1];
            max = new long[2 * n - 1];
            lazy = new long[2 * n - 1];
            mini = new int[2 * n - 1];
            maxi = new int[2 * n - 1];
           Arrays. fill(min, Long.MAX_VALUE);
            Arrays.fill(max, Long.MIN_VALUE);
        }

        SegmentLazy(int[] a) {
            this(a.length);
            for (int i = 0; i < n; i++) {
                mini[i + n - 1] = i;
                maxi[i + n - 1] = i;
            }
            for (int i = 0; i < a.length; i++) {
                update(i, a[i]);
            }
        }

        public void update(int i, int x) {
            i += n - 1;
            sum[i] = x;
            min[i] = x;
            max[i] = x;
            while (i > 0) {
                i /= 2;
                sum[i] = sum[i * 2 + 1] + sum[i * 2 + 2];
                setMinMax(i);
            }
        }

        public void add(int l, int r, int x) {
            add(l, r, 0, x, 0, n);
        }

        public void add(int a, int b, int k, int x, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return;
            else if (a <= l && r <= b) {
                lazy[k] += x;
                eval(k, l, r);
            } else {
                add(a, b, k * 2 + 1, x, l, (l + r) / 2);
                add(a, b, k * 2 + 2, x, (l + r) / 2, r);
                sum[k] = sum[k * 2 + 1] + sum[k * 2 + 2];
                setMinMax(k);
            }
        }

        public long sum(int l, int r) {
            return sum(l, r, 0, 0, n);
        }

        public long sum(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return 0;
            else if (a <= l && r <= b) {
                return sum[k];
            } else {
                long lv = sum(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = sum(a, b, k * 2 + 2, (l + r) / 2, r);
                return lv + rv;
            }
        }

        public long min(int l, int r) {
            return min(l, r, 0, 0, n);
        }

        public long min(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return 0;
            else if (a <= l && r <= b) {
                return min[k];
            } else {
                long lv = min(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = min(a, b, k * 2 + 2, (l + r) / 2, r);
                return Math.min(lv, rv);
            }
        }

        public long mini(int l, int r) {
            return mini(l, r, 0, 0, n);
        }

        public long mini(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return -1;
            else if (a <= l && r <= b) {
                return mini[k];
            } else {
                long lv = min(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = min(a, b, k * 2 + 2, (l + r) / 2, r);
                long li = mini(a, b, k * 2 + 1, l, (l + r) / 2);
                long ri = mini(a, b, k * 2 + 2, (l + r) / 2, r);
                return lv < rv ? li : ri;
            }
        }

        public long max(int l, int r) {
            return max(l, r, 0, 0, n);
        }

        public long max(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return Integer.MIN_VALUE;
            else if (a <= l && r <= b) {
                return max[k];
            } else {
                long lv = max(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = max(a, b, k * 2 + 2, (l + r) / 2, r);
                return Math.max(lv, rv);
            }
        }

        public long maxi(int l, int r) {
            return maxi(l, r, 0, 0, n);
        }

        public long maxi(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return -1;
            else if (a <= l && r <= b) {
                return maxi[k];
            } else {
                long lv = max(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = max(a, b, k * 2 + 2, (l + r) / 2, r);
                long li = maxi(a, b, k * 2 + 1, l, (l + r) / 2);
                long ri = maxi(a, b, k * 2 + 2, (l + r) / 2, r);
                return lv > rv ? li : ri;
            }
        }


        private void eval(int k, int l, int r) {
            if (lazy[k] != 0) {
                sum[k] += lazy[k] * (r - l);
                min[k] += lazy[k];
                max[k] += lazy[k];
                if (r - l > 1) {
                    lazy[k * 2 + 1] += lazy[k];
                    lazy[k * 2 + 2] += lazy[k];
                }
                lazy[k] = 0;
            }
        }

        private void setMinMax(int i) {
            if (min[i * 2 + 1] < min[i * 2 + 2]) {
                min[i] = min[i * 2 + 1];
                mini[i] = mini[i * 2 + 1];
            } else {
                min[i] = min[i * 2 + 2];
                mini[i] = mini[i * 2 + 2];
            }
            if (max[i * 2 + 1] > max[i * 2 + 2]) {
                max[i] = max[i * 2 + 1];
                maxi[i] = maxi[i * 2 + 1];
            } else {
                max[i] = max[i * 2 + 2];
                maxi[i] = maxi[i * 2 + 2];
            }
        }

    }

}

