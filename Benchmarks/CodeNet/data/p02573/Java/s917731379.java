import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    int m = input.nextInt();
    
    Map<Integer, Set<Integer>> g = new HashMap<>();
    for (int i = 0; i < m; i++) {
      int a = input.nextInt() - 1;
      int b = input.nextInt() - 1;
      
      g.computeIfAbsent(a, k -> new HashSet<>()).add(b);
      g.computeIfAbsent(b, k -> new HashSet<>()).add(a);
    }
    
    int ans = 0;
    boolean[] v = new boolean[n];
	for (int i = 0; i < n; i++) {
      if (!v[i]) {
        ans = Math.max(ans, dfs(i, v, g));
      }
    }
    
    System.out.println(ans);
  }
  
  private static int dfs(int root, boolean[] v, Map<Integer, Set<Integer>> g) {
    v[root] = true;
    
    int cnt = 1;
    for (int n : g.getOrDefault(root, new HashSet<>())) {
      if (!v[n]) {
        cnt += dfs(n, v, g);
      }
    }
    
    return cnt;
  }
}