import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            char[] s = sc.next().toCharArray();
            BigDecimal decimal = sc.nextBigDecimal();

            long i = 0L;
            for (; i < s.length; i++) {
                if (s[(int) i] != '1') {
                    break;
                }
            }
            // if(s.length == i && k > i) {
            // System.out.println();
            // return;
            // }

            if (decimal.compareTo(BigDecimal.valueOf(i)) > 0) {
                System.out.println(s[(int) i]);
                return;
            }
            System.out.println(1);
        }
    }
}
