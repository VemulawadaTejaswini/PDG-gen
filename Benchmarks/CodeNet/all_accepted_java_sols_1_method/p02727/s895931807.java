import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    List<Integer> p = new ArrayList<>(A);
    List<Integer> q = new ArrayList<>(B);
    List<Integer> r = new ArrayList<>(C);
    for (int i = 0; i < A; i++) p.add(sc.nextInt());
    for (int i = 0; i < B; i++) q.add(sc.nextInt());
    for (int i = 0; i < C; i++) r.add(sc.nextInt());
    sc.close();

    long ans = Stream.concat(Stream.concat(
        p.stream().sorted(Comparator.reverseOrder()).limit(X),
        q.stream().sorted(Comparator.reverseOrder()).limit(Y)),
        r.stream())
      .sorted(Comparator.reverseOrder()).limit(X + Y)
      .mapToLong(Long::valueOf)
      .reduce(Long::sum)
      .getAsLong();

    System.out.println(ans);
  }
}