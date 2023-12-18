import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int V = Integer.parseInt(sc.next());
        int E = Integer.parseInt(sc.next());
        
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < V; i++){
            graph.put(i, new ArrayList<>());
        }
        int[] indeg = new int[V];
        for(int i = 0; i < E; i++){
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            graph.get(s).add(t);
            indeg[t]++;
        }
        
        List<Integer> list = new ArrayList<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < V; i++){
            if(indeg[i] == 0) queue.add(i);
        }
        while(!queue.isEmpty()){
            int u = queue.poll();
            list.add(u);
            for (Integer v : graph.get(u)) {
                indeg[v]--;
                if(indeg[v] == 0) queue.add(v);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < V; i++){
            sb.append(list.get(i)).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}
