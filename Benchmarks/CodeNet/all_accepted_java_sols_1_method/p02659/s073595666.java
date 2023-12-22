import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                String A = scan.next();
                String B = scan.next();
                
                BigDecimal bigA = new BigDecimal(A);
                BigDecimal bigB = new BigDecimal(B);
                
                BigDecimal seki = bigA.multiply(bigB);
                BigDecimal outputmoto = seki.setScale(0, BigDecimal.ROUND_DOWN);
                long output = outputmoto.longValue()
;
                System.out.println(output);

        }

}