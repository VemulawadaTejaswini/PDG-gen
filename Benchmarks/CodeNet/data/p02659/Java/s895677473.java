import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double ans = A * B;
        ans= Math.floor(ans);
        String result = BigDecimal.valueOf(ans).toPlainString();
                
        System.out.println(result.replaceAll("\\.0", ""));
    }
}
