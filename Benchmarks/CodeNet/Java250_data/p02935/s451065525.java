import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    // double A[] = new double[N];
    double ans = 0;
    ArrayList<Double> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      list.add(sc.nextDouble());
    }
    while (!(list.size() == 1)) {
      Collections.sort(list);
      double total = 0;
      total = (list.get(0) + list.get(1)) / 2;
      list.remove(0);
      list.remove(0);
      list.add(total);
    }
    System.out.println(list.get(0));
  }
}
