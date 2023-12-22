import java.util.*;
import java.math.BigInteger;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //与えられた整数N
    long n = sc.nextLong();
    
    long a = 0;
    long b = 0;
    for (long i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        a = i;
        b = n / i;
      }
    }
    System.out.println(a + b - 2);
  }
}