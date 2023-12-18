import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
    
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 1; i <= m; i++){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
    
        int[] parent = new int[n+1];
        Arrays.fill(parent, -1);
        parent[1] = 0;
    
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(1);
    
        while(!queue.isEmpty()){
            int u = queue.poll();
        
            graph.get(u).forEach((v) -> {
                if(parent[v] == -1){
                    parent[v] = u;
                    queue.add(v);
                }
            });
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("Yes").append(System.lineSeparator());
        for(int i = 2; i <= n; i++){
            sb.append(parent[i]).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}