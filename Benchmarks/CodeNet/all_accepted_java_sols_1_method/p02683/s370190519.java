import java.util.*;

public class Main {

    private static final int INF = 1_000_000_000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();

        int[] C = new int[N];
        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int min = INF;
        int bit = 1 << N;
        for (int b = 0; b < bit; b++) {
            int price = 0;
            int i = 0;
            int[] sum = new int[M];
            while (i < N) {
                int mask = 1 << i;
                if ((b&mask) > 0) {
                    price += C[i];
                    for (int j = 0; j < M; j++) {
                        sum[j] += A[i][j];
                    }
                }
                i++;
            }
            boolean ok = true;
            for (int j = 0; j < M; j++) {
                if (sum[j] < X) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                min = Math.min(min, price);
            }
        }

        System.out.println(min == INF ? -1 : min);
    }
}

