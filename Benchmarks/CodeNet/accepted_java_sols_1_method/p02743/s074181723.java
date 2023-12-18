import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    long c = sc.nextInt();
    // sqrt(a) + sqrt(b) < sqrt(c)
    // a + 2 * sqrt(a*b) + b < c
    // 2 * sqrt(a * b) < c - a - b ...(1) d = c - a - b [d > 0]
    // 4 * (a * b) < d * d ...(2)
    long d = (c - a -b);

    if (d <= 0) {
      System.out.println("No");
      return;
    }

    if (4 * a * b < d * d) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}