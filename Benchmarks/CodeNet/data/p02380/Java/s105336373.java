import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    double C = Math.toRadians(sc.nextInt());
    double c = Math.sqrt((a*a) + (b*b) - 2 * a * b * Math.cos(C));

    double L = a + b + c;
    double h = b * Math.sin(C);
    double S = a * h / 2;

    System.out.format("%f\n%f\n%f\n", S, L, h);
  }
}
