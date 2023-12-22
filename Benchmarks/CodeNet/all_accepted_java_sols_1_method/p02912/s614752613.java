import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
      for(int i = 0; i < n; i++)
        pq.offer(sc.nextInt());
      for(int i = 1; i <= m; i++) {
        int price = pq.poll();
        price = price / 2;
        pq.offer(price);
      }
      long sum = 0;
      while(!pq.isEmpty()) {
        sum += pq.poll();
      }
      System.out.println(sum);
  }
}