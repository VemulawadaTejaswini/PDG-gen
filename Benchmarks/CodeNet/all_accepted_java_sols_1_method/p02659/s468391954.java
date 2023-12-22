import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
      
        BigDecimal a1 = new BigDecimal(a);
        BigDecimal b1 = new BigDecimal(b);
        BigDecimal res= a1.multiply(b1);
      
        System.out.println(res.setScale(0, RoundingMode.DOWN));
    }
}