import java.util.Scanner;

/**
 * Walk on Multiplication Table
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();

            long ans = Long.MAX_VALUE;
            for (long n = 1; n <= Math.sqrt(N); n++) {
                if (N % n != 0) {
                    continue;
                }

                ans = Math.min(ans, n + N / n - 2);
            }

            System.out.println(ans);
        }
    }

}
