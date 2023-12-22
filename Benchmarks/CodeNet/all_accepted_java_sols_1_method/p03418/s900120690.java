import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = Long.parseLong(sc.next());
        long K = Long.parseLong(sc.next());

        if (K == 0) {
            System.out.println(N * N);
            return;
        }

        long count = 0;
        for (long i = K + 1; i <= N; i++) {
            long p = N / i;
            long r = N % i;
            count += (i - K) * p + Math.max(r - K + 1, 0);
        }

        System.out.println(count);
    }
}