
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] A = new long[N + 1];
        long[] B = new long[N];

        for (int i = 0 ; i < N + 1 ; i++) {
            A[i] = scanner.nextLong();
        }

        for (int i = 0 ; i < N ; i++) {
            B[i] = scanner.nextLong();
        }

        long answer = 0;
        for (int i = 0 ; i < N ; i++) {
            answer += Math.min(A[i], B[i]);
            B[i] = B[i] - Math.min(A[i], B[i]);
            answer += Math.min(A[i + 1], B[i]);
            A[i + 1] -= Math.min(A[i + 1], B[i]);
        }

        System.out.println(answer);
      }
}
