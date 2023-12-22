import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        int[] b = new int[M];
        for (int i = 0; i < M; i++) {
            b[i] = sc.nextInt();
        }
        int[][] values = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                values[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum += values[i][j] * b[j];
            }
            if (sum + C > 0) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
