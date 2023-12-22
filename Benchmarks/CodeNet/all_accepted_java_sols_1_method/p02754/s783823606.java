import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long times = n / (a + b);
    long rest = n % (a + b);
    System.out.println(a * times + Math.min(rest, a));
  }
}