import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger X = s.nextBigInteger().abs();
        BigInteger K = s.nextBigInteger();
        BigInteger D = s.nextBigInteger();

        if (X.subtract(K.multiply(D)).signum() >= 0) {
            System.out.println(X.subtract(K.multiply(D)).toString());
        } else {
            if(!(X.remainder(K).remainder(BigInteger.valueOf(2)).equals(D.remainder(BigInteger.valueOf(2))))) {
                System.out.println(X.remainder(K).toString());
            } else System.out.println(X.remainder(K).subtract(K).abs().toString());
        }
    }
}