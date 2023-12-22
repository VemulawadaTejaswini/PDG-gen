import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> list = new ArrayList<Integer>();
    List<Integer> list1 = new ArrayList<Integer>();
    int total = 0;
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }
    for (int i = 0; i < N; i++) {
      int K = sc.nextInt();
      if (list.get(i) > K) {
        total += list.get(i) - K;
      }
    }
    System.out.println(total);
  }
}
