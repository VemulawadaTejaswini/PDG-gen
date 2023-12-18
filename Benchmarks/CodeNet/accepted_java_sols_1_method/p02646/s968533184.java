import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long v = sc.nextLong();
    long b = sc.nextLong();
    long w = sc.nextLong();
    long t = sc.nextLong();
    long d = Math.abs(a - b);
    long d2 = (v - w) * t;
    System.out.println(d2 >= d ? "YES" : "NO");
  }
}
