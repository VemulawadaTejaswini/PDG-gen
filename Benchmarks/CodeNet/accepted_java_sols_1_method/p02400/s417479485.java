import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double r = s.nextDouble();
    s.close();
    double a = Math.PI * (r * r);
    double c = 2 * Math.PI * r;
    DecimalFormat df = new DecimalFormat("#.00000");
    df.setRoundingMode(RoundingMode.HALF_UP);
    System.out.println(df.format(a) + " " + df.format(c));
  }
}

