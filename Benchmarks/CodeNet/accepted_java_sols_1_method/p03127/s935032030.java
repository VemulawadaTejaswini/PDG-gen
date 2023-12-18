import java.math.BigInteger;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        BigInteger j = BigInteger.valueOf(scanner.nextInt());
        for (int i = 1; i < n; i++)
            j = j.gcd(BigInteger.valueOf(scanner.nextInt()));
        System.out.println(j.intValue());
    }
}