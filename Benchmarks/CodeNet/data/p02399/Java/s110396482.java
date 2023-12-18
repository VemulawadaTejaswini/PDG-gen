import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double devided = a / b;
    double leftVal = a % b;

    System.out.println(String.format("%.0f %.0f %f", devided, leftVal, devided));
  }
}