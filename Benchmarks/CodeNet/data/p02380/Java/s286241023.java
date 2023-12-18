import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();
    int C = scan.nextInt();

    double S = a * b * Math.sin(Math.toRadians(C)) / 2;
    System.out.println(S);
    double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(C)));
    System.out.println(a + b + c);
    System.out.println(2 * S / a);

  }

}

