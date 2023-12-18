
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long K = scanner.nextLong();
        long[] A = new long[N + 1];
        long[] B = new long[M + 1];

        long[] sumA = new long[N + 1];
        long[] sumB = new long[M + 1];

        for (int i = 1 ; i <= N ; i++) {
            A[i] = scanner.nextLong();
            sumA[i] = sumA[i - 1] + A[i];
        }

        for (int i = 1 ; i <= M ; i++) {
            B[i] = scanner.nextLong();
            sumB[i] = sumB[i - 1] + B[i];
        }

        long maxCont = 0;
        int cj = M;
        for (int i = 0 ; i <= N ; i++) {
            for (int j = cj ; j >= 0 ; j--) {
                cj--;
                if (sumA[i] + sumB[j] <= K) {
                    maxCont = Math.max(maxCont, i + j);
                    break;
                }
            }
        }

        System.out.println(maxCont);

    }

}
