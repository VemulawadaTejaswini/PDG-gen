import java.util.*;
import java.util.stream.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigDecimal A = new BigDecimal(sc.next());
    BigDecimal B = new BigDecimal(sc.next());
    System.out.println(A.multiply(B).setScale(0, RoundingMode.DOWN));
  }
}
