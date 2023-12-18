import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int[] ans = solve2(N, K, A);
        for (int i=0; i<N; i++) {
            if (i != 0) System.out.print(" ");
            System.out.print(ans[i]);
        }
        System.out.println();
    }

    private static int[] solve2(int N, int K, int[] A) {
        int[] ans = A.clone();
        int[] next = null;

        for (int i=0; i<Math.max(K, 100); i++) {
            next = new int[N];

            for (int j=0; j<N; j++) {
                for (int d=j-ans[j]; d<=j+ans[j]; d++) {
                    if (d < 0 || d >= N) continue;

                    next[d]++;
                }
            }

            ans = next;
        }

        return next;
    }
}