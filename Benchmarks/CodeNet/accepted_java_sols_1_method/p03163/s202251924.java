
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int [] weight = new int[n + 1];
        int[] value = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            weight[i] = scanner.nextInt();
            value[i] = scanner.nextInt();
        }
        long [][] result = new long[n + 1][w + 1];
        for (int i = 1; i <= n; ++i) {
            for (int k = 0; k < weight[i]; ++k) {
                result[i][k] = result[i - 1][k];
            }
            for (int k = weight[i]; k <= w; ++k) {
                result[i][k] = Math.max(
                        result[i - 1][k],
                        result[i - 1][k - weight[i]] + value[i]
                );
            }
        }
        System.out.println(result[n][w]);
    }
}
