import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = 10000005;

        final int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        final int[] cnt = new int[M];

        for (int x : a) {
            if (cnt[x] != 0) {
                cnt[x] = 2;
                continue;
            }
            for (int i = x; i < M; i += x) {
                cnt[i]++;
            }
        }

        int ans = 0;

        for (int x : a) {
            if (cnt[x] == 1) ans++;
        }

        System.out.println(ans);
    }
}
