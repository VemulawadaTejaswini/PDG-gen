import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    while (true) {
      if (BigInteger.valueOf(x).isProbablePrime(100)) {
        System.out.println(x);
        return;
      }
      x++;
    }
  }
}