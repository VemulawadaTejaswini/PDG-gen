import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    double x1 = reader.nextDouble();
    double y1 = reader.nextDouble();
    double x2 = reader.nextDouble();
    double y2 = reader.nextDouble();

    System.out.println(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
  }
}