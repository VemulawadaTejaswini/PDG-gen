import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long[] A = new long[N+1];
        for (int i = 1; i <= N; i++) {
            A[i] = scanner.nextLong();
        }

        long[] DP = new long[N+1];

        DP[0] = 1000;
        DP[1] = 1000;

        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                DP[i] = Math.max(DP[j], A[i] * (DP[j]/A[j]) + DP[j]%A[j]);
            }
        }

        System.out.println(DP[N]);
    }

    public static void main(String[] args) {
        new Main();
    }
}
