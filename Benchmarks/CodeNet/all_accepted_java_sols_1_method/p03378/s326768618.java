import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    List<Integer> ls = new ArrayList<>();
    for (int i = 0; i < m; i++) {
      ls.add(sc.nextInt());
    }
    sc.close();
    List<Integer> prev = new ArrayList<>();
    List<Integer> next = new ArrayList<>();
    for (int i = 0; i < m; i++) {
      if (ls.get(i) > x) {
        next.add(ls.get(i));
      } else {
        prev.add(ls.get(i));
      }
    }
    if (next.size() >= prev.size()) {
      System.out.println(prev.size());
    } else {
      System.out.println(next.size());
    }
  }
}
