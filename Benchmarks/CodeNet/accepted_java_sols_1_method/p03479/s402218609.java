import java.math.BigInteger;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long x = scanner.nextLong(), y = scanner.nextLong();
        System.out.println(BigInteger.valueOf(Long.highestOneBit(y / x)).bitLength());
    }
}