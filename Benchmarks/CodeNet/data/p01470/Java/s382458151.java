import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal x = BigDecimal.ZERO;
        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();
            BigDecimal y = sc.nextBigDecimal();
            switch (op) {
            case 1:
                x = x.add(y);
                break;
            case 2:
                x = x.subtract(y);
                break;
            case 3:
                x = x.multiply(y);
                break;
            case 4:
                x = x.divide(y);
                break;

            default:
                break;
            }
        }
        System.out.println(x.intValue());
    }

}