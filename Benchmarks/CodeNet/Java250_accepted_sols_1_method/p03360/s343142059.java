import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i <= 2; i++) {
      list.add(sc.nextInt());
    }
    int K = sc.nextInt();
    Collections.sort(list, Collections.reverseOrder());
    for (int i = 0; i < K; i++) {
      list.set(0, list.get(0) * 2);
    }
    System.out.println(list.get(0) + list.get(1) + list.get(2));
  }
}
