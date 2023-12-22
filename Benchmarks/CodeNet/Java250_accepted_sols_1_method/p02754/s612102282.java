import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();

        if (A <= 0) {
            System.out.println(0);
            return;
        }

        // 0 < A

        if (B <= 0) {
            System.out.println(N);
            return;
        }

        // 0 < A
        // 0 < B

        if (A >= N) {
            System.out.println(N);
            return;
        }

        // 0 < A < N
        // 0 < B

        if (B >= N) {
            System.out.println(A);
            return;
        }

        // 0 < A < N
        // 0 < B < N

        if (A + B >= N) {
            // 0 < A < N
            // 0 < B < N
            // 0 < N <= A + B
            System.out.println(A);
            return;
        }

        // 0 < A < N
        // 0 < B < N
        // 0 < A + B < N

        long sho = N / (A + B);
        long jouyo = N % (A + B);
        System.out.println(sho * A + Math.min(jouyo, A));
    }
}