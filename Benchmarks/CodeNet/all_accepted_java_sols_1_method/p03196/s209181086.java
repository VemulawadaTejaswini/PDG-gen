import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long P = sc.nextLong();
    
    PriorityQueue<Long> q = new PriorityQueue<>();
    for (long i = 1; i*i <= P; i++) {
      if (P%i == 0) {
        if (i != 1) {
          q.offer(i);
        }
        if (P/i != 1) {
          q.offer(P/i);
        }
      }
    }
    
    Map<Long, Integer> map = new HashMap<>();
    while (!q.isEmpty()) {
      long d = q.poll();
      while (P%d == 0) {
        map.put(d, map.getOrDefault(d, 0)+1);
        P /= d;
      }
      d++;
    }
    
    long ans = 1;
    for (Map.Entry<Long, Integer> entry : map.entrySet()) {
      long prime = entry.getKey();
      int count = entry.getValue();
      for (int i = 0; i < count/N; i++) {
        ans *= prime;
      }
    }

    System.out.println(ans);
  }
}