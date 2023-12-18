import java.util.*;
  public class Main {
  
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < m; i++) {
          int u = sc.nextInt();
          int v = sc.nextInt();
          if(!graph.containsKey(u))
            graph.put(u, new ArrayList<>());
          graph.get(u).add(v);
          if(!graph.containsKey(v))
            graph.put(v, new ArrayList<>());
          graph.get(v).add(u);
        }
        Map<Integer, Integer> memo = new HashMap<>(); 
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        Set<Integer> visited = new HashSet<>();
        visited.add(1);
        while(!queue.isEmpty()) {
          int node = queue.poll();
          List<Integer> children = graph.get(node);
          for(int child : children) {
            if(visited.contains(child)) continue;
            visited.add(child);
            memo.put(child, node);
            queue.offer(child);
          }
        }
        if(memo.size() != n - 1)
          System.out.println("No");
        else {
          System.out.println("Yes");
          for(int i = 2; i <= n; i++)
            System.out.println(memo.get(i));
        }
    }
  }  