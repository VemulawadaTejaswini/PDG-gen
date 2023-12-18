import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final int K = Integer.parseInt(sc.next());
        final int P[] = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += P[i];
        }
        int max = sum;
        if (N > K) {
            for (int i = 0; i < N - K; i++) {
                sum = sum - P[i] + P[i + K];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        double d = (max + K) / 2.0;

        System.out.println(d);
    }
}