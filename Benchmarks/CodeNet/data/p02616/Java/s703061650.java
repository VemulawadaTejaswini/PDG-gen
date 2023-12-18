import java.util.*;

public class Main {
    private final static long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        int[] a = new int[n];
        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<Integer> t = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < 0)
                t.add(a[i]);
            else
                s.add(a[i]);
        }

        int S = s.size();
        int T = t.size();
        boolean ok = false;
        if (S > 0) {
            if (n == k)
                ok = (T % 2 == 0);
            else
                ok = true;
        } else {
            ok = (k % 2 == 0);
        }
        Long ans = 1L;
        if (!ok) {
            Collections.sort(s, (x, y) -> (Math.abs(x) - Math.abs(y)));
            for (int i = 0; i < k; i++) {
                ans = mul(ans, a[i]);
            }
        } else {
            Collections.sort(s);
            Collections.sort(t, (x, y) -> (y - x));
            if (k % 2 == 1) {
                int last = s.size() - 1;
                ans = mul(ans, s.get(last));
                s.remove(last);
            }
            ArrayList<Long> p = new ArrayList<>();
            while (s.size() >= 2) {
                int last = s.size() - 1;
                long x = s.get(last);
                s.remove(last--);
                x *= s.get(last);
                s.remove(last);
                p.add(x);
            }
            while (t.size() >= 2) {
                int last = t.size() - 1;
                long x = t.get(last);
                t.remove(last--);
                x *= t.get(last);
                t.remove(last);
                p.add(x);
            }
            Collections.sort(p, (o1, o2) -> Long.compare(o2, o1));
            for (int i = 0; i < k / 2; i++) {
                ans = mul(ans, p.get(i));
            }
            ans = Math.floorMod(ans, MOD);
            System.out.println(ans);

        }

    }

    private static long mul(long a, long b) {
        return (((a + MOD) % MOD) * ((b + MOD) % MOD)) % MOD;
    }
}