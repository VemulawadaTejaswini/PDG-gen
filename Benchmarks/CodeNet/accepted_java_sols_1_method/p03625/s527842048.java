import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            Arrays.sort(A);

            long a = 0;
            long b = 0;
            for (int i = N - 2; i >= 0; i--) {
                if (A[i] == A[i + 1]) {
                    if (a == 0) {
                        a = A[i];
                    } else if (b == 0) {
                        b = A[i];
                    } else {
                    }
                    A[i] = -1;
                    A[i + 1] = -1;
                }
            }

            System.out.println(a * b);
        }
    }
}
