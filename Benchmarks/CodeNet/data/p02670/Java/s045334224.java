import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] P = new int[N * N];
        int[][] M = new int[N][N];
        for (int i = 0; i < P.length; i++) {
            P[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                M[i][j] = (i * N + j + 1);
            }
        }


        int sum = 0;
        for (int item : P) {
            int row = (item - 1) / N;
            int col = (item - 1) % N;

            int left = 0, right = 0, down = 0, up = 0;
            for (int i = col - 1; i >= 0; i--) {
                if (M[row][i] != -1) {
                    left++;
                }
            }

            for (int i = col + 1; i < N; i++) {
                if (M[row][i] != -1) {
                    right++;
                }
            }

            for (int i = row - 1; i >= 0; i--) {
                if (M[i][col] != -1) {
                    up++;
                }
            }

            for (int i = row + 1; i < N; i++) {
                if (M[i][col] != -1) {
                    down++;
                }
            }
            M[row][col] = -1;
            sum += Math.min(left, Math.min(right, Math.min(up, down)));
        }
        System.out.println(sum);
    }
}
