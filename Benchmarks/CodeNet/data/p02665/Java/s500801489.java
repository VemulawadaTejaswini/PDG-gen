import java.util.Arrays;
import java.util.Scanner;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] A = new int[N + 1];
        Arrays.setAll(A, $ -> sc.nextInt());
        if (N == 0) {
            System.out.println(A[0] == 1 ? 1 : -1);
            return;
        }
        if (!possible(A, N)) {
            System.out.println(-1);
            return;
        }
        int lo = 0;
        int up = N;
        while (up - lo > 1) {
            final int x = (lo + up + 1) / 2;
            if (possible(A, x))
                up = x;
            else
                lo = x;
        }
        final int x = (lo + up + 1) / 2;
        System.err.println(x);
        long ans = 0;
        long nodes = 0;
        for (int i = N; i >= x; i--) {
            nodes += A[i];
            ans += nodes;
        }
        for (int i = x - 1; i >= 0; i--) {
            nodes = (nodes + 1) / 2;
            nodes += A[i];
            ans += nodes;
        }
        System.out.println(ans);
    }

    static boolean possible(final int[] A, final int x) {
        long lo = 0;
        for (int i = x; i < A.length; i++)
            lo += A[i];
        long up = 1;
        for (int i = 0; i < x; i++) {
            up -= A[i];
            if (up < 0) {
                return false;
            }
            up = Math.min(up * 2, Long.MAX_VALUE / 2);
        }
        return up >= lo;
    }
}
public class Main {
    public static void main(String... args) {
        C.main();
    }
}
