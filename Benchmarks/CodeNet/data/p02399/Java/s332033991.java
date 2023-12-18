import java.util.*;
import java.math.BigDecimal;

class Main{
  static int a,b,d,r;
  static BigDecimal aa,bb,f;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    d = a / b;
    r = a % b;
    aa = new BigDecimal(a);
    bb = new BigDecimal(b);
    f = aa.divide(bb, 5, BigDecimal.ROUND_HALF_UP);
    System.out.println(d + " " + r + " " + f);
  }
}

