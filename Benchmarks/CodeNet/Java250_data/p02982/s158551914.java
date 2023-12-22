import java.util.Scanner;

public class Main {

    private static final int MOD = 1_000_000_007;

    private static int[][] X;
    private static int D;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        D = sc.nextInt();

        X = new int[N][D];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                X[i][j] = sc.nextInt();
            }
        }


        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) break;

                if (distance(i, j)) cnt++;
            }
//            System.out.println();
        }

        System.out.println(cnt);
    }

    private static boolean distance(int i, int j) {
        double sum = 0;

        for (int k = 0; k < D; k++) {
            long x = X[i][k] - X[j][k];
            sum += x * x;
        }

        double s = Math.sqrt(sum);

        return s == Math.floor(s);
    }
}
