import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
    for (int i = 0; i < N; i++) {
      queue.add(sc.nextInt());
    }
    while (M-- > 0) {
      Integer v = queue.poll();
      queue.add(v / 2);
    }
    long ans = 0;
    while (!queue.isEmpty()) {
      ans += queue.poll();
    }
    System.out.println(ans);
  }
}
