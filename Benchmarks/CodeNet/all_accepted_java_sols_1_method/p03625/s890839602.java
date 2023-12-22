import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      map.put(a, map.getOrDefault(a, 0) + 1);
    }
    
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() >= 4) {
        pq.offer(entry.getKey());
        pq.offer(entry.getKey());
      } else if (entry.getValue() >= 2) {
        pq.offer(entry.getKey());
      }
    }
    
    if (pq.size() >= 2) {
      int a = pq.poll();
      int b = pq.poll();
      System.out.println((long)a*b);
    } else {
      System.out.println(0);
    }
  }
}