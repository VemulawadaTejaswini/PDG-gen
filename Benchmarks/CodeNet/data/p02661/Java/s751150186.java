import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long[] A = new long[N], B = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
            B[i] = scanner.nextLong();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        long medianA, medianB;
        if(N % 2 == 0){
            medianA = A[N/2-1] + A[N/2];
            medianB = B[N/2-1] + B[N/2];
        } else {
            medianA = A[(N+1)/2-1];
            medianB = B[(N+1)/2-1];
        }

        System.out.println(medianB-medianA+1);
    }

    public static void main(String[] args) {
        new Main();
    }
}
