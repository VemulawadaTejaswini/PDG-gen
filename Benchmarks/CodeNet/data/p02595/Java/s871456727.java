import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long d = sc.nextLong();
    long result = 0;
    for (long i = 0; i < n; i++) {
      long x = sc.nextLong();
      long y = sc.nextLong();
      if (Math.sqrt(x * x + y * y) <= d) {
        result++;
      }
    }
    System.out.println(result);
  }
}
