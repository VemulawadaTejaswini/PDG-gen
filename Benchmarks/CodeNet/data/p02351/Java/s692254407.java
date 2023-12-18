import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        int n = sc.nextInt();
        int[] data = new int[n];
        RSQ_RAQ rsq = new RSQ_RAQ(data);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int cmd = sc.nextInt();
            if (cmd == 0) {
                int s = sc.nextInt() - 1;
                int t = sc.nextInt() - 1;
                int x = sc.nextInt();
                rsq.add(s, t + 1, x);
            } else if (cmd == 1) {
                int s = sc.nextInt() - 1;
                int t = sc.nextInt() - 1;
                System.out.println(rsq.query(s, t + 1));

            }
        }
    }

    static class RSQ_RAQ {
        long[] stAdd;
        long[] stSum;
        int n;

        public RSQ_RAQ(int[] data) {
            n = 1;
            while (n < data.length) {
                n *= 2;
            }
            stAdd = new long[2 * n - 1];
            stSum = new long[2 * n - 1];
            for (int i = 0, size = data.length; i < size; i++) {
                stSum[n - 1 + i] = data[i];
            }
            for (int i = n - 2; i >= 0; i--) {
                stSum[i] = stSum[2 * i + 1] + stSum[2 * i + 2];
            }
        }

        void add(int l, int r, int x) {
            add(l, r, x, 0, 0, n);
        }

        void add(int l, int r, int x, int k, int ll, int rr) {
            if (ll >= l && rr <= r) {
                stAdd[k] += x;
            } else if (ll >= r || rr <= l) {

            } else {
                stSum[k] += (Math.min(r, rr) - Math.max(l, ll)) * x;
                int mm = (ll + rr) / 2;
                add(l, r, x, 2 * k + 1, ll, mm);
                add(l, r, x, 2 * k + 2, mm, rr);
            }
        }

        long query(int l, int r) {
            return query(l, r, 0, 0, n);
        }

        long query(int l, int r, int k, int ll, int rr) {
            long ret;
            if (ll >= l && rr <= r) {
                ret = stSum[k] + (rr - ll) * stAdd[k];
            } else if (ll >= r || rr <= l) {
                ret = 0;
            } else {
                ret = (Math.min(r, rr) - Math.max(l, ll)) * stAdd[k];
                int mm = (ll + rr) / 2;
                ret += query(l, r, 2 * k + 1, ll, mm);
                ret += query(l, r, 2 * k + 2, mm, rr);
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
