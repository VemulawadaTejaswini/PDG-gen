import java.util.*;
import java.math.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigDecimal X = new BigDecimal(sc.next());
    int ans = 0;
    BigDecimal RATE = BigDecimal.valueOf(1.01);
    BigDecimal deposit = BigDecimal.valueOf(100);
    while (deposit.compareTo(X) < 0) {
      deposit = deposit.multiply(RATE).setScale(0, RoundingMode.DOWN);
      ans++;
    }
    System.out.println(ans);
  }
}