    import java.util.*;
    import java.math.BigDecimal;
     
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            String b = sc.next();
            BigDecimal b1 = new BigDecimal(a);
            BigDecimal b2  = new BigDecimal(b);
             BigDecimal c = b1.multiply(b2);
             BigDecimal d = c.setScale(0,BigDecimal.ROUND_DOWN);
            System.out.println(d);
        }
    }