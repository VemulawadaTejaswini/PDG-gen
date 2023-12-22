import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        // K * Kの最大公約数を出しておくマップ
        int[][] gmap = new int[K][K];

        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                gmap[i][j] = gcd(i + 1, j + 1);
            }
        }

        // GCD, 個数
        int[] rightGcdMap = new int[K];

        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= K; j++) {
                int gcd = gcd(i, j);

                rightGcdMap[gcd - 1]++;
            }
        }

        int[] leftGcdMap = new int[K];
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= K; j++) {
                int gcd = gcd(i, j);

                leftGcdMap[gcd - 1] += gcd(i, j) * rightGcdMap[j - 1];
            }
        }


        System.out.println(Arrays.stream(leftGcdMap).sum());
    }

    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
