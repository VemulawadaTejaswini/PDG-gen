
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final int C = sc.nextInt();

        final int[] B = new int[M];
        for (int i = 0; i < M; ++i) {
            B[i] = sc.nextInt();
        }

        final int[][] A = new int[N][M];

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                A[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        for (int i = 0; i < N; ++i) {
            int sum = C;
            for (int j = 0; j < M; ++j) {
                sum += A[i][j]*B[j];
            }
            if (sum > 0) {
                answer++;
            }
        }

        System.out.println(answer);
        System.out.flush();
        sc.close();
    }
}
