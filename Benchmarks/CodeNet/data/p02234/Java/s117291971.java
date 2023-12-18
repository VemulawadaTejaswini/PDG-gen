import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dims = new int[n + 1];
        for (int i = 0; i < n; i++) {
            dims[i] = sc.nextInt();
            if (i == n - 1) {
                dims[i + 1] = sc.nextInt();
            } else {
                sc.nextInt();
            }
        }

        int[][] costs = new int[n][n];

        for (int i = 0; i < n; i++) {
            costs[i][i] = 0;
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                costs[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = costs[i][k] + costs[k + 1][j] + dims[i] * dims[k + 1] * dims[j + 1];

                    if (cost < costs[i][j]) {
                        costs[i][j] = cost;
                    }
                }
            }
        }

        System.out.println(costs[0][n - 1]);
    }
}