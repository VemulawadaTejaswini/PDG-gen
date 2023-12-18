
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        int[][] A = new int[N][M];
        int[] B = new int[M];
        for(int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < N; i++) {
            int score = 0;
            for(int j = 0; j < M; j++) {
                score += A[i][j] * B[j];
            }
            if(score + C > 0) ans++;
        }
        System.out.println(ans);
    }
}