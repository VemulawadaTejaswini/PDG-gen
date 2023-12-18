import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        long[] A = new long[N+1];
        for (int i = 1; i <= N; i++) {
            A[i] = scanner.nextLong();
        }

        long test = 1;
        for (int i = 1; i <= K; i++) {
            test *= A[i];
        }

        for (int i = K+1; i <= N; i++) {
            long temp = test*A[i]/A[i-K];
            if (test < temp){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            test = temp;
        }

    }

    public static void main(String[] args) {
        new Main();
    }
}
