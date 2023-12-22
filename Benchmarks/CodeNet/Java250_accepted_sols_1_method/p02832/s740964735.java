import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) list.add(sc.nextInt());
    sc.close();

    List<Integer> bloks = new ArrayList<>();
    int target = Collections.min(list);
    for (int idx = list.indexOf(target); idx <= n; idx++) {
      int index = list.subList(idx, n).indexOf(target);
      if (index == -1) break;

      bloks.add(target);
      target += 1;
    }

    if (bloks.size() == 0) {
      System.out.println(0);
    } else if (bloks.get(0) != 1) {
      System.out.println(-1);
    } else {
      System.out.println(n - bloks.size());
    }
  }
}