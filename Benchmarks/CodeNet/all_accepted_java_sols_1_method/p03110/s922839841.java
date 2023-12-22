import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws ParseException {
    try (Scanner sc = new Scanner(System.in);) {
      int targetCounter = Integer.parseInt(sc.nextLine());

      BigDecimal sum = BigDecimal.ZERO;
      for (int i = 0; i < targetCounter; i++) {
        String target = sc.nextLine();
        String[] money = target.split(" ");
        if ("JPY".equals(money[1])) {
          BigDecimal yenPrice = new BigDecimal(money[0]);
          sum = sum.add(yenPrice);
        } else {
          BigDecimal bitPrice = new BigDecimal("380000");
          bitPrice = bitPrice.multiply(new BigDecimal(money[0]));
          sum = sum.add(bitPrice);
        }
      }
      System.out.println(sum);
    }
  }
}