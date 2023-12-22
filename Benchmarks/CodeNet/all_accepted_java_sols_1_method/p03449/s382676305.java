import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        for (int i = 1; i < n; i++) {
            a[0][i] += a[0][i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            a[1][i] += a[1][i + 1];
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int total = a[0][i] + a[1][i];
            ans = Math.max(ans, total);
        }

        System.out.println(ans);

    }
}