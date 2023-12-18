import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    PriorityQueue<Integer> pq = new PriorityQueue<>((t0, t1) -> t1 - t0);
    for (int i = 0; i < N; i++) pq.add(scanner.nextInt());
    for (int i = 0; i < M; i++) {
      int a = pq.poll();
      a /= 2;
      pq.add(a);
    }
    long sum = 0;
    for (int a : pq) sum += a;
    System.out.println(sum);
  }
}
