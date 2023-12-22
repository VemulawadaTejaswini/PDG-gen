import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Long> l = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      l.add(sc.nextLong());
    }
    long count = 0;
    for (int i = 0; i < n; i++) {
      long li = l.get(i);
      for (int j = i + 1; j < n; j++) {
        long lj = l.get(j);
        for (int k = j + 1; k < n; k++) {
          long lk = l.get(k);
          if (li != lj && li != lk && lj != lk && li < lj + lk && lj < li + lk && lk < lj + li) {
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}
