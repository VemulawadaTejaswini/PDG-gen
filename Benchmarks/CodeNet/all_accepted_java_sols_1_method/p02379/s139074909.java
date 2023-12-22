import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        double d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        BigDecimal bd = new BigDecimal(d);
        BigDecimal ans = bd.setScale(5,BigDecimal.ROUND_DOWN);
        System.out.println(ans);
    }
}
