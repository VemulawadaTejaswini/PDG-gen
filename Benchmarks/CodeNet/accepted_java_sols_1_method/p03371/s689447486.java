import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int price = Integer.MAX_VALUE;
    for (int i = 0; i <= 100000; i++) {
      int tmp = 2 * C * i;
      if (X > i) {
        tmp += A * (X - i);
      }
      if (Y > i) {
        tmp += B * (Y - i);
      }
      if (tmp < price) {
        price = tmp;
      }
    }
    System.out.println(price);
  }
}