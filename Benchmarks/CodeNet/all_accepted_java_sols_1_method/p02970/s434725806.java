import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double N = sc.nextDouble();
    double D = sc.nextDouble();
    double x = N / (2 * D + 1);
    System.out.println((int)Math.ceil(x));
  }
}