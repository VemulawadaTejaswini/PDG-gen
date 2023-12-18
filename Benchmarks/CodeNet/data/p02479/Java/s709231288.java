import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double pi = Math.PI;

    System.out.println("Input a radius");

    int r = scanner.nextInt();

    double area = r * pi * pi;
    double circum = 2 * pi * r;

    System.out.printf("%.6f %.6f%n",area,circum);

  }
}