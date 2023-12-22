import java.util.Scanner;

class Problem {
    private int N;
    private int M;
    private int C;
    private int[] B;
    private int[][] A;

    Problem() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        C = sc.nextInt();

        B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
        A = new int[N][M];
        for (int n = 0; n < N; n++) {
            for (int i = 0; i < M; i++) {
                A[n][i] = sc.nextInt();
            }
        }
    }

    int solve() {
        int ans = 0;
        for (int n = 0; n < N; n++) {
            int sum = C;
            for (int i = 0; i < M; i++) {
                sum += A[n][i] * B[i];
            }
            if (sum > 0) {
                ans++;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
