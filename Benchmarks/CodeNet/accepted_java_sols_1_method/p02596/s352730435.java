import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    if (k % 2 == 0 || k % 5 == 0) {
      System.out.println("-1");
      return;
    }
    long count = 1;
    long rem = 0;
    long tmp = 7;
    while (true) {
      rem = (rem + tmp) % k;
      if (rem == 0) {
        System.out.println(count);
        return;
      }
      tmp = (tmp * 10) % k;
      count++;
    }
  }
}
