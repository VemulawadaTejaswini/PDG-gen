import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Map<Integer, Integer> count = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int D = scanner.nextInt();
      count.put(D, count.getOrDefault(D, 0) + 1);
    }
    int M = scanner.nextInt();
    int[] T = new int[M];
    for (int i = 0; i < M; i++) T[i] = scanner.nextInt();
    for (int i = 0; i < M; i++) {
      if (count.getOrDefault(T[i], 0) == 0) {
        System.out.println("NO");
        return;
      }
      count.put(T[i], count.get(T[i]) - 1);
    }
    System.out.println("YES");
  }
}
