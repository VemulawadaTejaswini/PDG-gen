import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int res = 0;
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    list.sort(Comparator.naturalOrder());
    for (int i = 0; i < k; i++) {
      res += list.get(i);
    }
    System.out.println(res);
    sc.close();
  }
}