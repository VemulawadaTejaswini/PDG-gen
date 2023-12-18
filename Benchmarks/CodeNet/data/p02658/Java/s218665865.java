import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger result = BigInteger.ONE;
        BigInteger max = BigInteger.valueOf(10);
        for(int i = 1; i < 18; i++) {
            max = max.multiply(BigInteger.valueOf(10));
        }
        while(sc.hasNext()) {
            result = result.multiply(sc.nextBigInteger());
        }
        if (result.compareTo(max) == 1) {
            result = BigInteger.valueOf(-1);
        }
        System.out.println(result);
    }

}