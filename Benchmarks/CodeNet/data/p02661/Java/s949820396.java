import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Long> a = new ArrayList<>();
    ArrayList<Long> b = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      a.add(sc.nextLong());
      b.add(sc.nextLong());
    }
    List<Long> sortedA = a.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    List<Long> sortedB = b.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    if (n % 2 == 0) {
      double minD = ((double) (sortedA.get(n / 2 - 1) + sortedA.get(n / 2))) / 2;
      double maxD = ((double) (sortedB.get(n / 2 - 1) + sortedB.get(n / 2))) / 2;
      System.out.println((long) (2 * (maxD - minD) + 1));
    } else {
      long minD = sortedA.get((n + 1) / 2 - 1);
      long maxD = sortedB.get((n + 1) / 2 - 1);
      System.out.println(maxD - minD + 1);
    }
  }
}
