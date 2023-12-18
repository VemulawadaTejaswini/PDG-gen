import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }
    ArrayList<Integer> list1 = new ArrayList<>(list);
    Collections.sort(list1, Collections.reverseOrder());
    int first = list1.get(0);
    int second = list1.get(1);
    for (int i = 0; i < N; i++) {
      if (list.get(i) < first) {
        System.out.println(first);
      } else {
        System.out.println(second);
      }
    }
  }
}
