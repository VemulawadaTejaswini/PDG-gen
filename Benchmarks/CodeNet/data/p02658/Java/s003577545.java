import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private static BigInteger THRESHOLD_VALUE = BigInteger.valueOf(1000000000000000000L);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());

        BigInteger ans = BigInteger.ONE;
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(scanner.next());

            // 途中で閾値を超えたけど、0があるケースの対処
            if (num == 0) {
                System.out.println("0");
                return;
            }

            ans = ans.multiply(BigInteger.valueOf(num));

            if (ans.compareTo(THRESHOLD_VALUE) > 0) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(ans.toString());
    }
}
