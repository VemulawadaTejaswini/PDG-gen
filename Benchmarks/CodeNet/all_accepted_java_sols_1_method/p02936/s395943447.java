import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int q = sc.nextInt();
      Map<Integer, List<Integer>> tree = new HashMap<>();
      for(int i = 1; i <= n; i++)
        tree.put(i, new ArrayList<>());

      for(int i = 1; i < n; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        tree.get(a).add(b);
        tree.get(b).add(a);
      }
      
      long[] arr = new long[1+n];
      for(int i = 0; i < q; i++)
        arr[sc.nextInt()] += sc.nextLong();

      Set<Integer> visited = new HashSet<>();
      visited.add(1);
      Queue<Integer> queue = new LinkedList<>();
      queue.offer(1);
      while(!queue.isEmpty()) {
        int node = queue.poll();
        for(int adj : tree.get(node)) {
          if(visited.contains(adj)) continue;
          arr[adj] += arr[node];
          visited.add(adj);
          queue.offer(adj);
        }
      }
      for(int i = 1; i <= n; i++) {
        if(i == n)
          System.out.println(arr[i]);
        else
          System.out.print(arr[i] + " ");
      }
  }
}