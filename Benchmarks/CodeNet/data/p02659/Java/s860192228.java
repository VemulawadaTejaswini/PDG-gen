import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigDecimal aActual = new BigDecimal(sc.next());
    BigDecimal bActual = new BigDecimal(sc.next());
    BigDecimal ansActual = aActual.multiply(bActual);
    System.out.println(ansActual.longValueExact());
  }
}
