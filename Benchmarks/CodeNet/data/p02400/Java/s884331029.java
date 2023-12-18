import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double r = scanner.nextDouble();
    double pi = Math.PI;
    System.out.printf(pi * r * r + " " + 2 * pi * r);
  }
}
