import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    double c = Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
    System.out.println(c);
  }
}

