import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();
        int[][] X = new int[N][D];
        int cnt = 0;

        for (int i = 0; i < N; i++)
            for (int j = 0; j < D; j++)
                X[i][j] = sc.nextInt();

        for (int i = 0; i < N - 1; i++)
            for (int j = i + 1; j < N; j++)
                if (calcD(X[i], X[j], D) % 1 == 0)
                    cnt++;

        System.out.println(cnt);

    }

    static double calcD(int[] Y, int[] Z, int D) {
        int squared = 0;
        for (int i = 0; i < D; i++)
            squared += Math.pow(Math.abs(Y[i] - Z[i]), 2);

        return Math.sqrt(squared);
    }
}
