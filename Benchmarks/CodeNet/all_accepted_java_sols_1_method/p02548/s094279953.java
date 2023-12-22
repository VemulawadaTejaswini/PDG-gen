import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long count = 0;
    for (long i = 1, len = (long) Math.floor(Math.sqrt(n)); i <= len; i++) {
      for (long j = i, lenj = n / i; j <= lenj; j++) {
        if (i * j == n) {
          continue;
        }
        if (i == j) {
          count++;
        } else {
          count += 2;
        }
      }
    }
    System.out.println(count);
  }
}
