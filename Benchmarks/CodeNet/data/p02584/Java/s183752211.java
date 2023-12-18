import java.util.*;
import java.io.*;
// import lib.util.*;
// import lib.graph.*;
// import lib.io.*;
// import lib.math.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger X = new BigInteger(sc.next());
        BigInteger K = new BigInteger(sc.next());
        BigInteger D = new BigInteger(sc.next());
        // X - KD, X - (K - 2)D, ... , X + (K - 2)D, X + KDの中の最小

        // X < 0 -> X + KD, X + (K - 2)D, ... , (X + D or X)
        // X >= 0 -> X - KD, X - (K - 2)D, ... , (X - D or X)

        // X - KD, X + KD, X - K'D, X + K'D
        BigInteger q = X.divide(D).abs();
        if (X.abs().compareTo(K.multiply(D)) < 0) {
            if (K.subtract(q).mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                System.out.println(X.mod(D));
            } else {
                BigInteger res = X.mod(D).abs().add(D);
                res = res.min(res.subtract(D).subtract(D)).abs();
                System.out.println(res);
            }
        } else {
            BigInteger res = X.abs().subtract(D.multiply(K));
            System.out.println(res);
        }
    }
}