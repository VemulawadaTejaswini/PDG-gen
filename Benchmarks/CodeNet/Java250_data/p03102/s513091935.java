import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            long sum = C;
            for (int j = 0; j < M; j++) {
                sum += A[i][j] * B[j];
            }
            if (sum > 0) cnt++;
        }

        System.out.println(cnt);

        return;
    }

}