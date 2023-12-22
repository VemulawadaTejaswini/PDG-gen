import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int alice = 0;
    int bob = 0;
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }
    Collections.sort(list, Collections.reverseOrder());
    for (int i = 0; i < N; i++) {
      if (i % 2 == 0) {
        alice += list.get(i);
      } else {
        bob += list.get(i);
      }
    }
    System.out.println(alice - bob);
  }
}
