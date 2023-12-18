import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < A.length; i++) {
                A[i] = in.nextInt();
            }

            int max = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    max = Math.max(max, Math.abs(A[i] - A[j]));
                }
            }
            System.out.println(max);
        }
    }
}
