import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigDecimal bd = new BigDecimal(a);
        BigDecimal bdb = new BigDecimal(b);
         BigDecimal ans = bd.multiply(bdb);
         BigDecimal anss = ans.setScale(0,BigDecimal.ROUND_DOWN);
        System.out.println(anss);
    }
}
