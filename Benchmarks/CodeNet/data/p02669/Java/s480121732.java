import java.util.*;

public class Main {
    Scanner in = new Scanner(System.in);

    long f(long n, long[] costs, long d, Map<Long, Long> memo) {
        if (n == 0) return 0;
        if (n == 1) return d;
        if (memo.containsKey(n)) return memo.get(n);

        int[] div = new int[]{2,3,5};
        long ret = Long.MAX_VALUE;
        if (ret / d >= n) ret = n * d;
        for (int i=0;i<3;i++) {
            int di = div[i];
            long c = costs[i];
            if (n % di == 0) {
                ret = Math.min(ret, f(n/di, costs, d, memo) + c);
            } else {
                ret = Math.min(ret, c + f(n / di, costs, d, memo) + d * (n % di));
                ret = Math.min(ret, c + f(n / di + 1, costs, d, memo) + d * (di - n % di));
            }
        }

        memo.put(n, ret);
        return ret;
    }

    long solve() {
        long n = in.nextLong(), a = in.nextLong(), b = in.nextLong(), c = in.nextLong(), d = in.nextLong();
        return f(n, new long[]{a, b, c}, d, new HashMap<>());
    }

    void run() {
        int T = in.nextInt();
        while (T-- > 0) {
            System.out.println(solve());
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
