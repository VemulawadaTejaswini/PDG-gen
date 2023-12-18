import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] P = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
            }

            long max = 0;
            long sum = 0;

            for (int i = 0; i < K; i++) {
                sum += P[i];
            }
            max = sum;

            for (int i = 1; i < N - K + 1; i++) {
                sum = sum + P[K + i - 1] - P[i - 1];
                if (max < sum) {
                    max = sum;
                }
            }

            System.out.println((max + K) / 2.0);
        }
    }

}
