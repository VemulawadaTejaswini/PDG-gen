import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    sc.close();
    if (A - C >= 0) {
      // Aが0以上の場合
      A = A - C;
      System.out.println(A + " " + B);
    } else {
      // Bが0以上の場合
      long D = C - A;
      if (B - D >= 0) {
        B = B - D;
        System.out.println(0 + " " + B);
      } else {
        System.out.println(0 + " " + 0);
      }
    }
  }
}
