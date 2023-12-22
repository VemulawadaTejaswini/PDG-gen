import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        // 矛盾チェック
        Arrays.sort(a);

        // 奇数なら、[0, 2, 2, 4, 4, ...]
        // 偶数なら、[1, 1, 3, 3, ...]
        if (N % 2 == 1) {
            if (a[0] != 0) {
                out.println(0);
                return;
            }

            for (int i = 1; i < N; i++) {
                if (a[i] != (int) Math.ceil(i / 2.0) * 2) {
                    out.println(0);
                    return;
                }
            }
        } else {
            for (int i = 0; i < N; i++) {
                if (a[i] != (i / 2) * 2 + 1) {
                    out.println(0);
                    return;
                }
            }

        }

        N /= 2;
        long ans = 1;
        long mod = 1_000_000_007;
        while (N > 0) {
            ans = (ans * 2) % mod;
            N--;
        }

        out.println(ans);
    }
}