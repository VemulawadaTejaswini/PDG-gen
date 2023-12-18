import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    final List<Integer> a = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      a.add(scanner.nextInt());
    }
    if(a.stream().distinct().count() == a.size()) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
