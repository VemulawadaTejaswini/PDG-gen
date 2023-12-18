import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigDecimal B = sc.nextBigDecimal();
        BigDecimal tmp = new BigDecimal(A);
        tmp = tmp.multiply(B);
        double res = tmp.doubleValue();

        int value = (int) res;
        System.out.print(value);
    }
}
