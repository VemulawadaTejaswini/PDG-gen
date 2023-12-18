import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    List<Long> enemy = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      enemy.add(Long.valueOf(sc.next()));
    }

    Long ans = enemy.stream()
                    .sorted((x, y) -> y.compareTo(x))
                    .skip(k)
                    .reduce(0L, Long::sum);

    System.out.println(ans);

  }

}
