import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            A[i] = sc.nextInt();
        }
        sc.close();

        int[] cnt = new int[110000];
        for (int i = 1; i <= N; ++i) {
            if (A[i] > 0) {
                ++cnt[A[i] - 1];
            }
        }
        for (int i = 1; i <= N; ++i) {
            ++cnt[A[i]];
        }
        for (int i = 1; i <= N; ++i) {
            ++cnt[A[i] + 1];
        }
        int max = -1;
        int x = 0;
        for (int i = 1; i <= N; ++i) {
            if (cnt[A[i]] >= max) {
                max = cnt[A[i]];
                x = A[i];
            }
        }

        int res = x;
        int ans = 0;
        for (int i = 1; i <= N; ++i) {
            if (A[i] == x - 1) {
                ++ans;
            } else if (A[i] == x) {
                ++ans;
            } else if (A[i] == x + 1) {
                ++ans;
            }
        }

        System.out.println(ans);
    }
}
