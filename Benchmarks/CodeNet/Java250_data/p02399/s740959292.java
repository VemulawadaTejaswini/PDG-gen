import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        final String SPACE = " ";
        Scanner sc = new Scanner(System.in);

        final int a1 = sc.nextInt();
        final int b1 = sc.nextInt();

        final BigDecimal a2 = new BigDecimal(a1);
        final BigDecimal b2 = new BigDecimal(b1);

        final long d = a1 / b1;
        final long r = a1 % b1;
        final BigDecimal f = a2.divide(b2, 5, RoundingMode.HALF_UP);

        StringBuilder sb = new StringBuilder();
        sb.append(d).append(SPACE).append(r).append(SPACE).append(f);

        System.out.println(sb);
    }
}