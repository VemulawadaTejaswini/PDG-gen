import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();
    sc.close();

    BigDecimal bigA = BigDecimal.valueOf(a);
    BigDecimal bigB = BigDecimal.valueOf(b);
    BigDecimal bigX = BigDecimal.valueOf(x);
    BigDecimal result = bigB.divide(bigX, 0, RoundingMode.FLOOR).subtract(bigA.divide(bigX, 0, RoundingMode.CEILING))
        .add(BigDecimal.ONE);
    System.out.println(result.longValue());
  }
}