import java.util.*;
import java.math.BigDecimal;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      double a = scanner.nextDouble();
      double b = scanner.nextDouble();
      double c = scanner.nextDouble();
      double d = scanner.nextDouble();
      double e = scanner.nextDouble();
      double f = scanner.nextDouble();
      double x, y;
      x = (b * f - e * c) / (b * d - e * a);
      y = (c - a * x) / b;
      BigDecimal xbd = new BigDecimal(x);
      BigDecimal ybd = new BigDecimal(y);
      xbd = xbd.setScale(4, BigDecimal.ROUND_HALF_UP);
      ybd = ybd.setScale(4, BigDecimal.ROUND_HALF_UP);

      out += String.format("%.3f", xbd.doubleValue()) + " " + String.format("%.3f", ybd.doubleValue()) + "\n";
    }
    System.out.print(out);
  }
}