import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double L = sc.nextDouble();
        sc.close();
        double a = L / 3;
        double b = a;
        double c = b;
        double remain = L - (a + b + c);
        a += remain;
        double res = a * b * c;
        System.out.println(BigDecimal.valueOf(res).toPlainString());
    }

}
