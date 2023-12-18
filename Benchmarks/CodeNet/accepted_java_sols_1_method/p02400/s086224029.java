import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    sc.close();

    // r * r * 3.14
    double area = r * r * Math.PI;
    DecimalFormat f = new DecimalFormat("0.00000");
    System.out.print(f.format(area) + " ");
    // 2 * r * 3.14
    double circleLength = 2 * r * Math.PI;

    System.out.print(circleLength);
  }
}
