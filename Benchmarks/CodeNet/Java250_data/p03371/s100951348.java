import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();

    if (a + b < c * 2) {
      System.out.println(a * x + b * y);
    } else {
      if (x < y) {
        System.out.println(Math.min((c * 2) * x + (y - x) * b, c * 2 * y));
      } else {
        System.out.println(Math.min((c * 2) * y + (x - y) * a, c * 2 * x));
      }
    }
  }
}
