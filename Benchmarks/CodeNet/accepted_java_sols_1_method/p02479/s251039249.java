import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double r = Double.parseDouble(sc.next());
      System.out.printf("%.6f %.6f\n", r * r * Math.PI, 2.0 * Math.PI * r);
  }
}