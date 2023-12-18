import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

/*
(x+y+z)^2 - (xy + yz + zx)
x=y=z => 6x^2
6x^2 <= 10^4
x^2 <= 10^4/6
x <= 10^2 / sqrt(6)
 */
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      map.put(i, 0);
    }
    int limit = (int) Math.ceil(Math.sqrt(n));
    for (int i = 1; i <= limit; i++) {
      int t1 = i * i;
      for (int j = 1; j <= limit; j++) {
        int t2 = j * j;
        int t3 = i * j;
        for (int k = 1; k <= limit; k++) {
          int r = t1 + t2 + k * k + t3 + j * k + k * i;
          if (r <= n) {
            map.put(r, map.get(r) + 1);
          }
        }
      }
    }
    for (int i = 1; i <= n; i++) {
      System.out.println(map.get(i));
    }
  }
}
