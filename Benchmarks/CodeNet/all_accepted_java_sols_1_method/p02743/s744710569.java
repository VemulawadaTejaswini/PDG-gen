import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    String ans = "No";
    if(c > (a + b)) {
      long d = c - (a + b);
      d = d * d;
      long e = a * b;
      e = 4 * e;
      if(e < d) ans = "Yes";
    }
    System.out.println(ans);
  }
}
