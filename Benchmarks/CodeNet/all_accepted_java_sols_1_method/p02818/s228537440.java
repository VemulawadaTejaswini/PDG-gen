import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long k = sc.nextLong();
    sc.close();

    if (a > k) {
      System.out.println(String.format("%d %d", a - k, b));
    } else {
      long nokori = k - a;
      System.out.println(String.format("%d %d", 0, Math.max(b - nokori, 0)));
    }
  }
}