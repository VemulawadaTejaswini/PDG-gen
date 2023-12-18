import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    List<Integer> ds = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int d = sc.nextInt();
      ds.add(d);
    }

    int heal = 0;
    for (int i = 0; i < ds.size() - 1; i++) {
      for (int j = i + 1; j < ds.size(); j++) {
        heal += ds.get(i) * ds.get(j);
      }
    }

    System.out.println(heal);
  }
}
