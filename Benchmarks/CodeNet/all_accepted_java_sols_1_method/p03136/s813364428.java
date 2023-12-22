import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    Integer max = Collections.max(list);

    list.remove(list.indexOf(max));

    int sum = list.stream()
      .mapToInt(v -> v)
      .sum();

    if(max < sum) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
