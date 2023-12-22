import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<Integer> A = new HashSet<Integer>();
    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      A.add(sc.nextInt());
    }
    if (A.size() == N) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
