import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.next();
        }

        BigInteger fraction = new BigInteger("1");
        for (int i = 0; i < N; i++) {
            fraction = fraction.multiply(new BigInteger(array[i]));
        }

        BigInteger denominator = new BigInteger("0");
        for (int i = 0; i < N; i++) {
            BigInteger tmp = new BigInteger("1");
            for (int j = 0; j < N; j++) {
                if (j != i) {
                    tmp = tmp.multiply(new BigInteger(array[j]));
                }
            }
            denominator = denominator.add(tmp);
        }

        BigDecimal fracDecimal = new BigDecimal(fraction);
        BigDecimal denomDecimal = new BigDecimal(denominator);
        double ans = fracDecimal.divide(denomDecimal, 10, BigDecimal.ROUND_HALF_EVEN).doubleValue();
        System.out.println(ans);

    }

}
