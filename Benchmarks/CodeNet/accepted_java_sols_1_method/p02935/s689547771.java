import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    PriorityQueue<Double> pq = new PriorityQueue<>();
    for (int i = 0; i < N; i++) {
      double v = scanner.nextInt();
      pq.add(v);
    }

    while (pq.size() > 1) {
      double a = pq.poll();
      double b = pq.poll();
      pq.add((a + b) * 0.5d);
    }

    System.out.println(pq.poll());
  }
}
