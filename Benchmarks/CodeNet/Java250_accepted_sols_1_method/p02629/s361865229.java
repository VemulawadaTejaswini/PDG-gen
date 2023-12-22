import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        BigInteger inu = new BigInteger(sc.next());
        BigInteger t = new BigInteger("26");

        StringBuilder sb = new StringBuilder();
        while (inu.compareTo(BigInteger.ZERO) > 0) {
            inu = inu.subtract(BigInteger.ONE);
            BigInteger[] big = inu.divideAndRemainder(t);
            inu = big[0];
            char c = (char)(big[1].intValue() + 'a');
            sb.insert(0, c);
        }

        System.out.println(sb.toString());
    }
}
