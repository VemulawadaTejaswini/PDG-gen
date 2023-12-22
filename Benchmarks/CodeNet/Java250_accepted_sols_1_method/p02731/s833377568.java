import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double l = sc.nextDouble();
    sc.close();

    double a = l / 3.0;
    double answer = a * a * a;
    System.out.println(answer);
  }
}