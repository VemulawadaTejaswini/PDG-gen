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

        for (int i = K+1; i <= N; i++) {
            if ( A[i-K] < A[i]){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }

    public static void main(String[] args) {
        new Main();
    }
}
