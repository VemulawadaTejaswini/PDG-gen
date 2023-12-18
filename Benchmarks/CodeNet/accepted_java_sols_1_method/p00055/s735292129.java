import java.util.*;

class Main {
  static Scanner cin = new Scanner(System.in);
  public static void main(String[] args) {
    while (cin.hasNext()) {
      double n = cin.nextDouble(), ans = n;
      for (int i = 2; i <= 10; i++) {
        if (i % 2 == 0) {
          n *= 2;
          ans += n;
        } else {
          n /= 3;
          ans += n;
        }
      }
      System.out.println(ans);
    }
  }
}