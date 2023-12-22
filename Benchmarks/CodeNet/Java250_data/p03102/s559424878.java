
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();
        int [] b = new int[m];
        for (int i = 0; i < m; ++i) {
            b[i] = scanner.nextInt();
        }
        int  [][] a = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                a[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; ++i) {
            long res = c;
            for (int j = 0; j < m; ++j) {
                res += a[i][j] * b[j];
            }
            if (res > 0) {
                ++count;
            }
        }
        System.out.println(count);
    }
}
