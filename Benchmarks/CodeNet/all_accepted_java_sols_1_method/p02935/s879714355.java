import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Double> list = new ArrayList<Double>();
    for (int i = 0, n = sc.nextInt(); i < n; i++)
      list.add(sc.nextDouble());
    Collections.sort(list);
    while (list.size() > 1) {
      list.set(0, (list.get(0) + list.get(1)) / 2);
      list.remove(1);
    }
    System.out.println(list.get(0));
  }
}