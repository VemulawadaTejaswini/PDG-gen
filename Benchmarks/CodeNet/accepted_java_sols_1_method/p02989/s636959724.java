import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int halfN = n / 2;

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    Collections.sort(list);

    int result = list.get(halfN) - list.get(halfN - 1);

    System.out.println(result);
  }
}
