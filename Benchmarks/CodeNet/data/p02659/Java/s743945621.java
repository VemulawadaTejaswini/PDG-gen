import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    float b = sc.nextFloat();
    double b2 = b * 100;

    double total = a * b2 / 100;


    System.out.println(total);
  }
}
