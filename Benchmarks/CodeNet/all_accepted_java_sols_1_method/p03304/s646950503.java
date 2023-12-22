import java.util.*;
import java.math.BigDecimal;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double m = sc.nextInt();
        double d = sc.nextInt();
        double g = n - d;
        double ans = 0;
        if (g < 1) {
            ans = 0;
        } else if (g == n) {
            ans = ((m - 1) / n);
        } else {
            ans = (2 * g * (m - 1)) / (n * n);
        }
        System.out.println(BigDecimal.valueOf(ans).toPlainString());
    }    
}
