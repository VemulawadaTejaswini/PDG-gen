import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    long sum = 0;
    PriorityQueue<Integer> q = new PriorityQueue(Comparator.reverseOrder());
    for (int i = 0; i < N; i++) {
      int A = sc.nextInt();
      q.offer(A);
      sum += A;
    }

    for (int i = 1; i <= M; i++) {
      int maxPrice = q.poll();
      int newPrice = maxPrice / 2;
      sum -= maxPrice - newPrice;

      q.offer(newPrice);
    }
    
    System.out.println(sum < 0 ? 0 : sum);
  }
}