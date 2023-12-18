import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        double[][] memo = new double[n + 1][n + 1];
        memo[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            double p = in.nextDouble();
            for (int j = 0; j <= n; j++) {
                if (j == 0) {
                    memo[i][j] = memo[i - 1][j] * (1 - p);
                } else {
                    memo[i][j] = memo[i - 1][j] * (1 - p) + memo[i - 1][j - 1] * p;
                }
            }
        }
        in.close();


        double result = 0;
        for (int i = 0; i <= n; i++) {
            if (i > n - i) {
                result = result + memo[n][i];
            }
        }

        System.out.println(result);
    }
}