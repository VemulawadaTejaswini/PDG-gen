import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> ls = new ArrayList<Integer>(n);
    for (int i = 0; i < n; i++) {
      ls.add(0);
    }
    for (int i = 0; i < n - 1; i++) {
      int boss = sc.nextInt();
      ls.set(boss - 1, ls.get(boss - 1) + 1);
    }
    sc.close();
    for (int i = 0; i < n; i++) {
      System.out.println(ls.get(i));
    }
  }
}