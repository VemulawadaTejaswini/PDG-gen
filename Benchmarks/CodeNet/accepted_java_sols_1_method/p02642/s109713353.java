import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            Arrays.sort(A);

            int count = 0;
            boolean[] used = new boolean[(int) (1e6 + 1)];
            for (int i = 0; i < N; i++) {
                if (i + 1 < N && A[i] == A[i + 1]) {
                } else if (i - 1 >= 0 && A[i] == A[i - 1]) {
                } else if (used[A[i]]) {
                } else {
                    count++;
                }
                if (!used[A[i]]) {
                    for (int j = A[i]; j < used.length; j += A[i]) {
                        used[j] = true;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
