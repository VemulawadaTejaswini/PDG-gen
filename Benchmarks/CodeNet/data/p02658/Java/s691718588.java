import java.math.BigInteger;
import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        BigInteger a = sc.nextBigInteger();

        for (int i = 1; i < n; i++) {
            BigInteger m = sc.nextBigInteger();
            if (m.compareTo(BigInteger.ZERO) == 0) {
                System.out.println(0);
                return;
            }
            a = a.multiply(m);
        }
        if (a.compareTo(BigInteger.valueOf(1000000000000000000L)) > 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(a);
    }
}
