import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        BigInteger[] A = new BigInteger[N];

        for (int i = 0; i < N; i++) {
            A[i] = BigInteger.valueOf(sc.nextLong());

            if (A[i].equals(BigInteger.ZERO)) {
                System.out.println(0);
                return;
            }
        }

        BigInteger max = BigInteger.valueOf((long) Math.pow(10, 18));
        BigInteger res = BigInteger.ONE;

        for (int i = 0; i < N; i++) {
            if (res.multiply(A[i]).compareTo(max) == 1){
                System.out.println(-1);
                return;
            }

            res = res.multiply(A[i]);
        }

        System.out.println(res);

    }
}
