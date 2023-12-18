import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextInt();
    double b = scanner.nextInt();
    double tubo = 3.305785;
    System.out.println((a * b) / tubo);
  }
}