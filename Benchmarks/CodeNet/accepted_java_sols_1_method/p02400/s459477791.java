import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    double r = stdin.nextDouble();
    System.out.printf("%f %f%n", Math.pow(r, 2) * Math.PI, 2 * r * Math.PI);
  }

}