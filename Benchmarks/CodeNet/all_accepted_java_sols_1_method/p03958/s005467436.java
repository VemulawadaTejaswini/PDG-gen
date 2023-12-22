import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      int t = sc.nextInt();

      PriorityQueue<Integer> pq = new PriorityQueue((a, b) -> (int)b - (int)a);
      for(int i = 0; i < t; i++)
        pq.offer(sc.nextInt());
      while(pq.size() > 1) {
        int a = pq.poll();
        int b = pq.poll();
        a -= 1;
        b -= 1;
        if(a > 0) pq.offer(a);
        if(b > 0) pq.offer(b);
      }
      System.out.println(pq.size() == 0 ? 0 : pq.peek() - 1);
  }
}