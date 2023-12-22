import java.math.*;
import java.util.*;

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

    p.sort(Comparator.reverseOrder());
    q.sort(Comparator.reverseOrder());

    List<Integer> xyc = new ArrayList<>(X + Y + C);
    xyc.addAll(p.subList(0, X));
    xyc.addAll(q.subList(0, Y));
    xyc.addAll(r);
    xyc.sort(Comparator.reverseOrder());

    long ans = 0;
    for (int i : xyc.subList(0, X + Y)) ans += i;

    System.out.println(ans);
  }
}