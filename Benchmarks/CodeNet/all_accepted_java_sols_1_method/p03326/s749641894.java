import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int m = scan.nextInt();

        long[][] a = {{1, 1, 1}, {1, 1, -1}, {1, -1, 1}, {-1, 1, 1}, {-1, -1, 1}, {-1, 1, -1}, {1, -1, -1}, {-1, -1, -1}};
        long[][] sum = new long[8][n];

        for (int i = 0; i < n; i++) {
            long x = scan.nextLong();
            long y = scan.nextLong();
            long z = scan.nextLong();
            for (int j = 0; j < 8; j++) {
                sum[j][i] = a[j][0] * x + a[j][1] * y + a[j][2] * z;
            }
        }

        long ans = 0;
        for (int i = 0; i < 8; i++) {
            Arrays.sort(sum[i]);
            long lower = 0, upper = 0;
            for (int j = 0, c = n - 1; j < m; j++, c--) {
                lower += sum[i][j];
                upper += sum[i][c];
            }
            ans = Math.max(ans, Math.max(Math.abs(lower), Math.abs(upper)));
        }

        System.out.println(ans);
    }
}
