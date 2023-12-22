import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        BigDecimal A = sc.nextBigDecimal();
        BigDecimal B = sc.nextBigDecimal();
        BigDecimal C = A.multiply(B);

 
        BigInteger D = C.toBigInteger();

        System.out.print(D);
    }
}
