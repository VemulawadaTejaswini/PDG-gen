import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      list.add(a);
    }
    int q = sc.nextInt();
    for (int i = 0; i < q; i++) {
      int b = sc.nextInt();
      int c = sc.nextInt();
      for (int j = 0; j < list.size(); j++) {
        if (list.get(j) == b) {
          list.set(j,c);
        }
      }
      System.out.println(list.stream().mapToInt(v -> v).sum());
    }
  }
}
