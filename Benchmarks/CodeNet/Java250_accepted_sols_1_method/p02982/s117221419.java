import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int d = sc.nextInt();
        final int[][] x = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = sc.nextInt();
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) continue;
                double sum = 0;
                for (int k = 0; k < d; k++) {
                    sum += Math.pow(x[i][k] - x[j][k], 2);
                }
                if (Math.sqrt(sum) == Math.floor(Math.sqrt(sum))) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
