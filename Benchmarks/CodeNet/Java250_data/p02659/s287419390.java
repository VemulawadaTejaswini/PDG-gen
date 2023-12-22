import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        sc.close();

        BigDecimal res = BigDecimal.valueOf(A).multiply(BigDecimal.valueOf(B));
        String val = res.toPlainString();
        int index = val.indexOf(".");
        if (index >= 0) {
            val = val.substring(0, index);
        }

        System.out.println(val);

    }
}