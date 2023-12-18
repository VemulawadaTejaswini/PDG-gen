import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigDecimal ans = BigDecimal.ONE;

    BigDecimal top = new BigDecimal(10).pow(18);

    BigDecimal num[] = new BigDecimal[n];

    for (int  i = 0; i < n; i++) {
      num[i] = new BigDecimal(sc.next());
      if (num[i].compareTo(BigDecimal.ZERO) == 0) {
        System.out.println("0");
        return;
      }
    }

    for (int  i = 0; i < n; i++) {
      ans = ans.multiply(num[i]);
      if (ans.compareTo(top) > 0) {
        System.out.println("-1");
        return;
      }
    }

    System.out.println(ans.setScale(0, RoundingMode.FLOOR).toPlainString());


  }

}