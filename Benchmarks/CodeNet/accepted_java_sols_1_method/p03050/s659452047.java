import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long N = scan.nextLong();
        BigInteger answer = BigInteger.ZERO;
        long temp = (long) Math.sqrt(N);
        temp += 10;
        BigInteger x = new BigInteger(Long.toString(temp));
        BigInteger y = BigInteger.ZERO;
        do {
            x = x.subtract(BigInteger.ONE);
            y = (x.add(BigInteger.ONE)).multiply(x);
        }
        while ((new BigInteger(Long.toString(N)).compareTo(y)) < 1);
        for (int i = 1; i < x.longValue()+1; i++) {
            if (N % i != 0) {
                continue;
            }
            answer = answer.add(new BigInteger(Long.toString(N / i - 1)));
        }
        System.out.println(answer);
    }
}
