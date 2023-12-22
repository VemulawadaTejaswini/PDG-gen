import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      map.put(a, map.getOrDefault(a, 0) + 1);
    }
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      pq.add(entry.getValue());
    }
    int ans = 0;
    while (pq.size() > K) {
      ans += pq.poll();
    }
    
    System.out.println(ans);
  }
}