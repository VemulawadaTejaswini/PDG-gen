import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int[] X = new int[K + 1];

            for (int i = 0; i < A[0]; i++) {
                X[i] = -1;
            }

            for (int i = 0; i <= K - A[0]; i++) {
                for (int j = 0; j < N; j++) {
                    if (i + A[j] > K) {
                        break;
                    }

                    if (X[i + A[j]] < 1) {
                        X[i + A[j]] = X[i] * -1;
                    }
                }
            }

            String ans = (X[K] == 1) ? "First" : "Second";

            System.out.println(ans);
        }
    }

}
