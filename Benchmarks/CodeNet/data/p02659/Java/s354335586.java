import java.util.*;
import java.util.stream.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigDecimal A = BigDecimal.valueOf(sc.next());
    BigDecimal B = BigDecimal.valueOf(sc.next());
    System.out.println(A.multiply(B).setScale(0, RoundingMode.DOWN));
  }
}