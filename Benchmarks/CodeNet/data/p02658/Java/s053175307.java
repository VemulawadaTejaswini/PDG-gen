import java.math.BigInteger;
import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        BigInteger a = BigInteger.valueOf(sc.nextLong());

        for (int i = 1; i < n; i++) {
            a = a.multiply(BigInteger.valueOf(sc.nextLong()));
        }
        if (a.compareTo(BigInteger.valueOf(1000000000000000000L)) > 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(a);
    }
}
