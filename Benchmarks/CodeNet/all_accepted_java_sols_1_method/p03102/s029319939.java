import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int C = scanner.nextInt();
            int[][] feature = new int[N][M];
            int[] B = new int[M];
            for (int i = 0; i < M; i++) {
                B[i] = scanner.nextInt();
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    feature[i][j] = scanner.nextInt();
                }
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                long sum = C;
                for (int j = 0; j < M; j++) {
                    sum += feature[i][j] * B[j];
                }
                if (sum > 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
