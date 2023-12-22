import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<Integer, Integer> list = new TreeMap<Integer, Integer>();
    for (int i = 1; i <= N; i++) {
      list.put(sc.nextInt(), i);
    }
    for (Integer key : list.keySet()) {
      System.out.print(list.get(key) + " ");
    }
  }
}
