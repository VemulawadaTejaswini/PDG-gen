import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MOD = 998244353;
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int l = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            for (int j = l; j <= r; j++) {
                a.add(j);
            }
        }
        sc.close();
        a.sort(Comparator.naturalOrder());
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            if (dp[i] == 0) {
                continue;
            }
            for (int x : a) {
                if (i + x > n - 1) {
                    break;
                }
                dp[i + x] += dp[i];
                dp[i + x] %= MOD;
            }
        }
        System.out.println(dp[n - 1]);
    }
}