import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int H = Integer.parseInt(sc.next());
        final int W = Integer.parseInt(sc.next());
        sc.close();

        BigInteger ans0 = BigInteger.ZERO;
        long ans1 = 0;
        long ans2 = 0;
        if (W % 2 == 0) {
            ans1 = W / 2;
            ans2 = W / 2;
        } else {
            ans1 = W / 2 + 1;
            ans2 = W / 2;
        }
        if (H % 2 == 0) {
            ans0 = ans0.add(BigInteger.valueOf(ans1)).add(BigInteger.valueOf(ans2)).multiply(BigInteger.valueOf(H))
                    .divide(BigInteger.valueOf(2));
        } else {
            ans0 = ans0.add(BigInteger.valueOf(H).divide(BigInteger.valueOf(2)).add(BigInteger.valueOf(1))
                    .multiply(BigInteger.valueOf(ans1)));
            ans0 = ans0.add(BigInteger.valueOf(H).divide(BigInteger.valueOf(2)).multiply(BigInteger.valueOf(ans2)));
        }

        if (H == 1 || W == 1) {
            System.out.println(1);
        } else {
            System.out.println(ans0);
        }
    }
}