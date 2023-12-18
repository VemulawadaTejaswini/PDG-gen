import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        Map<Integer, List<Integer>> graph = new TreeMap<>();
        for(int i = 0; i < n; i++){
            int u = Integer.parseInt(sc.next());
            graph.put(u, new ArrayList<>());
            int k = Integer.parseInt(sc.next());
            for(int j = 0; j < k; j++){
                graph.get(u).add(Integer.parseInt(sc.next()));
            }
        }
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] d = new int[n+1];
        int[] f = new int[n+1];
        int time = 0;
        stack.push(1);
        d[1] = ++time;
        while(!stack.isEmpty()){
            int u = stack.peek();
            int v = -1;
            for(Integer i : graph.get(u)){
                if(d[i] == 0){
                    v = i;
                    break;
                }
            }
            if(v != -1){
                stack.push(v);
                d[v] = ++time;
            }else{
                stack.pop();
                f[u] = ++time;
            }
            if(stack.isEmpty()){
                for(int i = 1; i <= n; i++){
                    if(d[i] == 0){
                        stack.push(i);
                        d[i] = ++time;
                        break;
                    }
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            sb.append(i).append(" ");
            sb.append(d[i]).append(" ");
            sb.append(f[i]).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}
