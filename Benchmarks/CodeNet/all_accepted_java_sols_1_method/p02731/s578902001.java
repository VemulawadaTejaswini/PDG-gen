import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double d = (double)sc.nextInt();

    BigDecimal bd = BigDecimal.valueOf(d / 3.0);

    System.out.println(bd.multiply(bd).multiply(bd).toPlainString());

  }

}