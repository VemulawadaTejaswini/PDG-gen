import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    sc.close();

    long diff = Math.abs(a - b);
    if (diff % 2 == 0) {
      System.out.println(diff / 2);
    } else {
      long max = Math.max(a, b);
      long min = Math.min(a, b);
      long ans = 0;
      if (n - max <= min - 1) {
        ans = Math.min((n + n - max + 1 - min) / 2, n - min);
      } else {
        ans = Math.min((min - 1 + max) / 2, max - 1);
      }
      System.out.println(ans);
    }
  }
}