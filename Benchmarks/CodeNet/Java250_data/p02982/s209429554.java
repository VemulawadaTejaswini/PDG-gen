import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private boolean check(int k) {
        for (int i = 1; i * i <= k; i++) {
            if (i * i == k) {
                return true;
            }
        }
        return false;
    }

    private int dist2(int[][] X, int N, int D, int i, int j) {
        int sum = 0;
        for (int k = 0; k < D; k++) {
            int v = X[i][k] - X[j][k];
            sum += v * v;
        }
        return sum;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();

        int[][] X = new int[N][D];
        int[][] M = new int[N][D];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                X[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (i != j) {
                    // comapring i with j.
                    int s = dist2(X, N, D, i, j);
                    if (check(s)) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);

        return;
    }

}