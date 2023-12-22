import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int inf = (int) 1e9;
            int N = sc.nextInt();
            int[] B = new int[N - 1];
            for (int i = 0; i < N - 1; i++) {
                B[i] = sc.nextInt();
            }
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = inf;
            }
            for (int i = 0; i < N - 1; i++) {
                A[i] = Math.min(A[i], B[i]);
                A[i + 1] = Math.min(A[i + 1], B[i]);
            }
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += A[i];
            }
            System.out.println(sum);
        }
    }
}
