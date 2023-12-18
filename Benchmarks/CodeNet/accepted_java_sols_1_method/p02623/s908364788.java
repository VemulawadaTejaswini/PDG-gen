
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
        int j = M;
        for (int i = 0 ; i <= N ; i++) {
            if (sumA[i] > K) {
                break;
            }
            while (sumB[j] > K - sumA[i]) {
                j--;
            }
            maxCont = Math.max(maxCont, i + j);
        }

        System.out.println(maxCont);

    }

}
