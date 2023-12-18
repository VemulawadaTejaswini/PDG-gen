import java.util.*;
import java.math.BigDecimal;

class Main{
  static double r;
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    r = sc.nextDouble();
    BigDecimal rb = BigDecimal.valueOf(r);
    BigDecimal b2 = new BigDecimal(2);
    BigDecimal pye = new BigDecimal("3.14159265358979323846");
    BigDecimal rr = rb.multiply(rb);
    BigDecimal rrpye = pye.multiply(rr);
    BigDecimal rpye = pye.multiply(rb);
    BigDecimal r2pye = rpye.multiply(b2);
    System.out.println(rrpye + " " + r2pye);
  }
}


