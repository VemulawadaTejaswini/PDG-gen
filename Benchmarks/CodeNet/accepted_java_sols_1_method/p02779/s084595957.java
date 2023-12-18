import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    HashSet<Integer> list = new HashSet<Integer>();
    for (int i = 0; i < A; i++) {
      list.add(sc.nextInt());
    }
    sc.close();
    if (list.size() == A) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
