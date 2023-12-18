import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[][] x = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                long c = 0;
                for (int k = 0; k < d; k++) {
                    c += Math.abs(x[i][k] - x[j][k]) * Math.abs(x[i][k] - x[j][k]);
                }
                if (Math.sqrt(c) % 1 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}