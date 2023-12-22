import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int k = -1;
    for (int i = 2; i * (i - 1) <= 2 * N; i++) {
      if (i * (i - 1) == 2 * N) {
        k = i;
        break;
      }
    }
    if (k < 0) {
      System.out.println("No");
      return;
    }

    System.out.println("Yes");
    System.out.println(k);
    List<Integer>[] edges = new List[k];
    for (int i = 0; i < k; i++) edges[i] = new ArrayList<>();

    int e = 1;
    for (int offset = 1; offset <= (k - 1) / 2; offset++) {
      for (int i = 0; i < k; i++) {
        edges[i].add(e);
        edges[(i + offset) % k].add(e);
        e++;
      }
    }

    if (k % 2 == 0) {
      for (int i = 0; i < k / 2; i++) {
        edges[i].add(e);
        edges[i + k / 2].add(e);
        e++;
      }
    }

    StringBuilder sb = new StringBuilder();
    for(List<Integer> ed : edges) {
      sb.append(ed.size()).append(" ");
      for(int i : ed) sb.append(i).append(" ");
      sb.append("\n");
    }
    System.out.println(sb.toString());
  }
}
