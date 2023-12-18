import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        Arrays.sort(A);

        long ans = 1;

        for (int i = 0; i < N; i++) {
            if (ans * A[i] > 1000000000000000000L) {
                System.out.println(-1);
                return;
            }

            ans *= A[i];
        }

        if (ans > 1000000000000000000L) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
