import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            int min = Math.min(A[0], A[1]);

            int[] X = new int[N];
            int l = 0;
            int r = min + 1;
            for (; l < r;) {
                int xper2 = (l + r) / 2;

                for (int i = 0; i < N; i++) {
                    int j = (i + 1) % N;
                    if (j == 1) {
                        X[j] = xper2;
                        continue;
                    }
                    X[j] = A[i] - X[i];
                }

                if (X[0] + X[1] == A[0]) {
                    break;
                } else if (X[0] + X[1] < A[0]) {
                    l = xper2;
                } else {
                    r = xper2;
                }

            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                if (i > 0) {
                    sb.append(" ");
                }
                sb.append(2 * X[i]);
            }
            System.out.println(sb.toString());
        }
    }
}
