import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    Queue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());
    for (int i = 0; i < n; i++) queue.add(sc.nextLong());
    for (int i = 0; i < m; i++) queue.add(queue.poll() / 2);
    long result = queue.stream().reduce((a, b) -> a + b).get();
    System.out.println(result);
  }
}