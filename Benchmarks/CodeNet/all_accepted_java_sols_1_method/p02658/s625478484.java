import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long MAX = 1000000000000000000L;
        final int N = sc.nextInt();


        BigInteger[] A = new BigInteger[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextBigInteger();
            if (A[i].compareTo(BigInteger.ZERO) == 0) {
                System.out.println(0);
                return;
            }
        }

        Arrays.sort(A, Comparator.reverseOrder());

        BigInteger ans = BigInteger.ONE;
        for (int i = 0; i < N; i++) {
            if (ans.multiply(A[i]).compareTo(BigInteger.valueOf(MAX)) > 0) {
                System.out.println(-1);
                return;
            }
            ans = ans.multiply(A[i]);
        }

        System.out.println(ans.compareTo(BigInteger.valueOf(MAX)) > 0 ? -1 : ans);
    }
}
