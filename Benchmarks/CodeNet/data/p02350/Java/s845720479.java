import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
       int  N = sc.nextInt();
        int q = sc.nextInt();
        RUQ seg = new RUQ(N);
        seg.update(0,N,(1<<31)-1);
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if (t == 0) {
                seg.update( sc.nextInt(), sc.nextInt()+1, sc.nextInt());
            } else {
                System.out.println(seg.min( sc.nextInt(),  sc.nextInt()+1));
            }
        }
        
    }
        
    static class RUQ {
        int n;
        long[] sum, min, max, lazy;
        int[] couMin, couMax;
        boolean[] lazyFlag;

        RUQ(int size) {
            n = 1;
            while (n < size) n *= 2;
            sum = new long[2 * n - 1];
            min = new long[2 * n - 1];
            max = new long[2 * n - 1];
            lazy = new long[2 * n - 1];
            couMin = new int[2 * n - 1];
            couMax = new int[2 * n - 1];
            lazyFlag = new boolean[2 * n - 1];
            Arrays.fill(min, Long.MAX_VALUE);
            Arrays.fill(max, Long.MIN_VALUE);
            for (int i = 0; i < n; i++) {
                couMin[i + n - 1] = 1;
                couMax[i + n - 1] = 1;
            }
            for (int i = 0; i < size; i++) {
                update(i, 0);
            }
        }

        RUQ(int[] a) {
            this(a.length);
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
                i = (i - 1) / 2;
                sum[i] = sum[i * 2 + 1] + sum[i * 2 + 2];
                setMinMax(i);
            }
        }

        public void update(int l, int r, int x) {
            update(l, r, 0, x, 0, n);
        }

        public void update(int a, int b, int k, int x, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return;
            else if (a <= l && r <= b) {
                lazy[k] = x;
                lazyFlag[k] = true;
                eval(k, l, r);
            } else {
                update(a, b, k * 2 + 1, x, l, (l + r) / 2);
                update(a, b, k * 2 + 2, x, (l + r) / 2, r);
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
            if (r <= a || b <= l) return Integer.MAX_VALUE;
            else if (a <= l && r <= b) {
                return min[k];
            } else {
                long lv = min(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = min(a, b, k * 2 + 2, (l + r) / 2, r);
                return Math.min(lv, rv);
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

        public long couMin(int l, int r) {
            return couMin(l, r, 0, 0, n);
        }

        public long couMin(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return 0;
            else if (a <= l && r <= b) {
                return couMin[k];
            } else {
                long lv = min(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = min(a, b, k * 2 + 2, (l + r) / 2, r);
                long coul = couMin(a, b, k * 2 + 1, l, (l + r) / 2);
                long cour = couMin(a, b, k * 2 + 2, (l + r) / 2, r);
                long cou = 0;
                if (lv <= rv) cou += coul;
                if (lv >= rv) cou += cour;
                return cou;
            }
        }

        public long couMax(int l, int r) {
            return couMax(l, r, 0, 0, n);
        }

        public long couMax(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return -1;
            else if (a <= l && r <= b) {
                return couMax[k];
            } else {
                long lv = max(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = max(a, b, k * 2 + 2, (l + r) / 2, r);
                long coul = couMax(a, b, k * 2 + 1, l, (l + r) / 2);
                long cour = couMax(a, b, k * 2 + 2, (l + r) / 2, r);
                long cou = 0;
                if (lv >= rv) cou += coul;
                if (lv <= rv) cou += cour;
                return cou;
            }
        }

        private void eval(int k, int l, int r) {
            if (lazyFlag[k]) {
                sum[k] = lazy[k] * (r - l);
                min[k] = lazy[k];
                max[k] = lazy[k];
                couMin[k] = (r - l);
                couMax[k] = (r - l);
                if (r - l > 1) {
                    lazy[k * 2 + 1] = lazy[k];
                    lazy[k * 2 + 2] = lazy[k];
                    lazyFlag[k * 2 + 1] = true;
                    lazyFlag[k * 2 + 2] = true;
                }
                lazyFlag[k] = false;
            }
        }

        private void setMinMax(int i) {
            couMin[i] = couMax[i] = 0;
            if (min[i * 2 + 1] <= min[i * 2 + 2]) {
                min[i] = min[i * 2 + 1];
                couMin[i] += couMin[i * 2 + 1];
            }
            if (min[i * 2 + 1] >= min[i * 2 + 2]) {
                min[i] = min[i * 2 + 2];
                couMin[i] += couMin[i * 2 + 2];
            }
            if (max[i * 2 + 1] >= max[i * 2 + 2]) {
                max[i] = max[i * 2 + 1];
                couMax[i] += couMax[i * 2 + 1];
            }
            if (max[i * 2 + 1] <= max[i * 2 + 2]) {
                max[i] = max[i * 2 + 2];
                couMax[i] += couMax[i * 2 + 2];
            }
        }
    }

    }



