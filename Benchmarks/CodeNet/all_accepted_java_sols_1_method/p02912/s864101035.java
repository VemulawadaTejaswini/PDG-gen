import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    long[] price = new long[n];
    for(int i = 0; i < n; i++) {
      price[i] = Long.parseLong(sc.next());
    }
    PriorityQueue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());
    for(int i = 0; i < n; i++) {
      queue.offer(price[i]);
    }
    long temp;
    for(int i = 0; i < m; i++) {
      temp = queue.poll() / 2;
      queue.offer(temp);
    }
    long sum = 0;
    for(int i = 0; i < n; i++) {
      sum += queue.poll();
    }
    System.out.println(sum);
  }
}
