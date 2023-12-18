import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int m = sc.nextInt();
        final int x = sc.nextInt();

        final int[] c = new int[n];
        final int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < (1 << n); i++) {
            int cost = 0;
            int[] d = new int[m];
            for (int j = 0; j < n; j++) {
                if ((i>>j & 1) == 1) {
                    cost += c[j];
                    for (int k = 0; k < m; k++) {
                        d[k] += a[j][k];
                    }
                }
            }

            boolean ok = true;

            for (int j = 0; j < m; j++) {
                if (d[j] < x) ok = false;
            }

            if (ok) {
                ans = Math.min(ans, cost);
            }
        }

        System.out.println(ans != Integer.MAX_VALUE ? ans : -1);
    }
}
