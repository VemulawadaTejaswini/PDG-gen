import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            Arrays.sort(A);

            long count = 0;
            for (int i = N / 2 + 1; i < N; i++) {
                count += A[i];
            }
            for (int i = N / 2; i < N - 1; i++) {
                count += A[i];
            }
            if (N % 2 == 0) {
                count += A[N / 2];
            }
            System.out.println(count);
        }
    }
}
