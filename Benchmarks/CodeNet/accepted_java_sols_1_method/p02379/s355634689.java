import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    double x1 = stdin.nextDouble();
    double y1 = stdin.nextDouble();
    double x2 = stdin.nextDouble();
    double y2 = stdin.nextDouble();
    double x = Math.abs(x1 - x2);
    double y = Math.abs(y1 - y2);
    System.out.printf("%f%n", Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
  }

}