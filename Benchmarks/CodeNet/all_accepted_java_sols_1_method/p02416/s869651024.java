import java.util.*;
import java.math.BigDecimal;

public class Main{
    static BigDecimal b = new BigDecimal("10");
    static BigDecimal c = new BigDecimal("0");
	
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
        BigDecimal a = sc.nextBigDecimal();
        BigDecimal total = new BigDecimal("0");
        if (a.equals(c)) {
          break;
        }
          while(!a.equals(c)) {
            total = total.add(a.remainder(b));
            a = a.divide(b,0,BigDecimal.ROUND_DOWN);
          }
          System.out.println(total);
          }
	}
}
