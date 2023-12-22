
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // スペース区切りの整数の入力
    BigDecimal R = new BigDecimal(sc.nextInt());
    BigDecimal S = R.multiply(new BigDecimal(2)).setScale(100, RoundingMode.HALF_UP);

    System.out.println(S.multiply(new BigDecimal("3.1415")).setScale(100, RoundingMode.HALF_UP));
  }
}
