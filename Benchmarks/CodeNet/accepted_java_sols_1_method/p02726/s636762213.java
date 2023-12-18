import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next())-1;
        int y = Integer.parseInt(sc.next())-1;
        
        ArrayList<Integer>[] g = new ArrayList[n];
        for(int i=0; i<n; i++){
            g[i] = new ArrayList<>();
        }
        for(int i=0; i<n-1; i++){
            g[i].add(i+1);
            g[i+1].add(i);
        }
        g[x].add(y);
        g[y].add(x);
        int[] dist = new int[n];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            q.addLast(i);
            Arrays.fill(dist, (int)1e9);
            dist[i] = 0;
            while(q.size()!=0){
                int now = q.pollFirst();
                for(int next : g[now]){
                    if(dist[now]+1 < dist[next]){
                        dist[next] = dist[now]+1;
                        map.put(dist[next], map.getOrDefault(dist[next], 0)+1);
                        q.addLast(next);
                    }
                }
            }
        }
        
        for(int i=1; i<n; i++){
            System.out.println(map.getOrDefault(i, 0)/2);
        }
    }
}
