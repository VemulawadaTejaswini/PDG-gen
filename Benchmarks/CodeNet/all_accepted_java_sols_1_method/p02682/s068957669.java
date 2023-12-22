import java.util.*;
import java.math.BigInteger;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    if (k <= a) {
      System.out.println(k);
    } else if (a < k && k <= a+b) {
      System.out.println(a);
    } else {
      System.out.println(2*a + b - k);
    }
  }
}
