import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long left = 2 * (a * b + b * c + c * a);
    long right = a * a + b * b + c * c;
    if (c - a - b > 0 && left < right) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
