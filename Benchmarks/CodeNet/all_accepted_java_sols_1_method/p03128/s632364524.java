import java.util.*;

public class Main {

    private static final int[] NS = new int[]{2, 5, 5, 4, 5, 6, 3, 7, 6};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M];
        for (int m = 0; m < M; m += 1) {
            A[m] = sc.nextInt();
        }

        int[] dp = new int[N + 1];
        dp[0] = 0;
        for (int n = 1; n <= N; n += 1) {
            int next = -1;
            for (int a : A) {
                int prevDP = n - NS[a - 1];
                if (prevDP < 0) {
                    continue;
                }
                int curNext = dp[prevDP] + 1;
                if (next < curNext) {
                    next = curNext;
                }
            }
            dp[n] = next;
        }

        while (N > 0) {
            int curA = 0;
            for (int a : A) {
                int nextDP = N - NS[a - 1];
                if (curA < a && nextDP >= 0) {
                    if (dp[nextDP] == (dp[N] - 1)) {
                        curA = a;
                    }
                }
            }
            N -= NS[curA - 1];
            System.out.print(curA);
        }

    }

}
