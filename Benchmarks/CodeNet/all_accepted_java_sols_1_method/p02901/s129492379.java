import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[m];
        ArrayList<ArrayList<Integer>> b = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            b.add(new ArrayList<>());
        }
        for (int i = 0; i < m; ++i) {
            a[i] = in.nextInt();
            int x = in.nextInt();
            for (int j = 0; j < x; ++j) {
                b.get(i).add(in.nextInt() - 1);
            }
        }

        int[] dp = new int[(1 << n)];
        dp[0] = 0;
        for (int i = 1; i < (1 << n); ++i) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < m; ++j) {
                int x = i;
                for (int y: b.get(j)) {
                    x ^= (x & (1 << y));
                }
                if (x < i && dp[x] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[x] + a[j], dp[i]);
                }
            }
        }

        if (dp[(1 << n) - 1] != Integer.MAX_VALUE) {
            System.out.println(dp[(1 << n) - 1]);
        } else {
            System.out.println(-1);
        }
    }
}
