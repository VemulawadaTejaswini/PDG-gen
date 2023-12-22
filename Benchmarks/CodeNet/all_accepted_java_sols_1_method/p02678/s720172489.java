import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    int m = input.nextInt();
    
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int i = 0; i < m; i++) {
      int a = input.nextInt();
      int b = input.nextInt();
     
      map.computeIfAbsent(a, key -> new ArrayList<>()).add(b);
      map.computeIfAbsent(b, key -> new ArrayList<>()).add(a);
    }
    
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(1);

    int[] dist = new int[n + 1];
    dist[0] = 0;
    Arrays.fill(dist, -1);
    int[] parent = new int[n + 1];
    
    while (!queue.isEmpty()) {
      int cur = queue.poll();
      
      for (int next : map.get(cur)) {
        if (dist[next] == -1) {
          dist[next] = dist[cur] + 1;
          parent[next] = cur;
          queue.offer(next);
        }
      }
    }
    
    boolean good = true;
    for (int i = 1; i <= n && good; i++) {
      good = (dist[i] != -1);
    }
    
    if (good) {
      System.out.println("Yes");
      for (int i = 2; i <= n; i++) {
        System.out.println(parent[i]);
      }
    } else {
      System.out.println("No");
    }
  }
}