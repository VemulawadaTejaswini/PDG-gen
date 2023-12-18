import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    double a = stdin.nextDouble();
    double b = stdin.nextDouble();
    double rad = Math.toRadians(stdin.nextInt());
    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(rad));
    double S = a * b / 2 * Math.sin(rad);
    double L = a + b + c;
    double h = 2 * S / a;
    System.out.printf("%f%n%f%n%f%n", S, L, h);
  }

}