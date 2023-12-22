import java.util.Scanner;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        int[] X = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }


        int x = A[N - 1];
        int i;

        for (i = 0; i < N / 2; i++) {
            x = A[i] + A[N - 2 - i] - x;
        }
        X[N / 2] = x / 2;

        for (int j = N / 2; j < N - 1; j++) {
            X[j + 1] = A[j] - X[j];
        }
        for (int j = N / 2; j > 0; j--) {
            X[j - 1] = A[j - 1] - X[j];
        }

        for (int j = 0; j < N; j++) {
            System.out.print((X[j] * 2) + " ");
        }
    }
}
