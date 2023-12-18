import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long k = sc.nextLong();
    long ans1 = a;
    long ans2 = b;
    ans1 -= Math.min(a, k);
    ans2 -= Math.min(b, k - Math.min(a, k));
    System.out.println(ans1 + " " + ans2);
  }
}