import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int k = K;
    Set<Integer> map = new HashSet<>();

    //System.out.println(String.format("N %d  K %d ", N, K));
    while (K-- > 0) {
      int i = sc.nextInt();

      while (i-- > 0) {
        int x = sc.nextInt();
        map.add(x);
      }
    }

    //System.out.println(String.format("S = %s", map.toString()));
    Set<Integer> x = IntStream.rangeClosed(1, N).boxed().collect(Collectors.toSet());
    //System.out.println(String.format("X = %s", x.toString()));

    x.removeAll(map);
    System.out.println(x.size());
  }
}