import java.util.*;

class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int n = sc.nextInt();
    int x = n % 1000;
    if (x > 0) {
      int y = 1000 - x;
      System.out.println(y);
    } else {
      System.out.println(x);
    }
  }
}