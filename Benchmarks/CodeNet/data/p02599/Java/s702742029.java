import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    List<Integer> c = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      c.add(sc.nextInt());
    }
    for (int i = 0; i < q; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      Set<Integer> set = new HashSet<>();
      int result = 0;
      for (int j = l - 1; j < r; j++) {
        int newC = c.get(j);
        if (!set.contains(newC)) {
          result++;
          set.add(newC);
        }
      }
      System.out.println(result);
    }
  }
}
