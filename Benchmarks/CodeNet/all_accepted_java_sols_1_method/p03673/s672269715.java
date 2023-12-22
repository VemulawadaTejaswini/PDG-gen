import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    LinkedList<Integer> list = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      int a = scanner.nextInt();
      if (i % 2 == 0) list.addFirst(a);
      else list.addLast(a);
    }
    if (n % 2 == 0) Collections.reverse(list);
    StringBuilder sb = new StringBuilder();
    for (int b : list) sb.append(b).append(" ");
    System.out.println(sb.toString());
  }
}
