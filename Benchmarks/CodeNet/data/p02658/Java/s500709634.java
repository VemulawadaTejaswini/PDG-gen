import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());

        BigInteger ans = BigInteger.ONE;
        for (int i = 0; i < N; i++) {
            ans = ans.multiply(BigInteger.valueOf(Long.parseLong(scanner.next())));
        }
        scanner.close();
        if (ans.compareTo(BigInteger.valueOf(1000000000000000000L)) > 0) {
            System.out.println("-1");
        } else {
            System.out.println(ans.toString());
        }
    }
}
