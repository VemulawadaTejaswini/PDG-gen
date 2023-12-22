import java.util.*;
import java.math.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out ="";
    int sumPrice = 0;
    double sumNum = 0;
    int n = 0;
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      String[] p = line.split(",");
      sumPrice += Integer.parseInt(p[0]) * Integer.parseInt(p[1]);
      sumNum += Double.parseDouble(p[1]);
      n++;
    }
    BigDecimal avgNumWork = new BigDecimal(sumNum / n);
    BigDecimal avgNum = avgNumWork.setScale(0, BigDecimal.ROUND_HALF_UP);
    System.out.println(sumPrice);
    System.out.println(avgNum.intValue());
  }
}