import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            long sum = 0;
            for (int i = 1; i < N; i++) {
                int diff = A[i] - A[i - 1];
                sum += diff < 0 ? -diff : 0;
                A[i] = Math.max(A[i] + (diff < 0 ? -diff : 0), A[i - 1]);
            }
            System.out.println(sum);
        }
    }
}
