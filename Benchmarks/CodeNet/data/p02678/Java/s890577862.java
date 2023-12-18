import java.util.*;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        Dijkstra dks = new Dijkstra(n);
        ArrayList<Integer>[] graph = new ArrayList[n];
        
        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i=0; i<m; i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            graph[a].add(b);
            graph[b].add(a);
            dks.addEdge(a, b, 1);
        }
        
        long[] dist = dks.build(0);
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.addLast(0);
        boolean[] used = new boolean[n];
        used[0] = true;
        int[] ans = new int[n];
        while(q.size()!=0){
            int now = q.pollFirst();
            for(int next : graph[now]){
                if(dist[now]+1 == dist[next]){
                    q.add(next);
                    used[next] = true;
                    ans[next] = now+1;
                }
            }
        }
        
        System.out.println("Yes");
        for(int i=1; i<n; i++){
            System.out.println(ans[i]);
        }
        
    }
    
}

class Dijkstra{
    
    public final long INF = (long)1e18;
    private int n;
    private List<Edge>[] edge;
    
    
    public Dijkstra(int n){
        this.n = n;
        edge = new List[n];
        for(int i=0; i<n; i++){
            edge[i] = new ArrayList<>();
        }
    }
    
    public void addEdge(int from, int to, int cost){
        edge[from].add(new Edge(from, to, cost));
        edge[to].add(new Edge(to, from, cost));
    }
    
    public long[] build(int from){
        long[] dist = new long[n];
        Arrays.fill(dist, INF);
        dist[from] = 0;
        
        PriorityQueue<Vertex> q = new PriorityQueue<>();
        q.add(new Vertex(from, 0));
        while(q.size() != 0){
            int u = q.poll().ver;
            
            for(Edge ne : edge[u]){
                int v = ne.to;
                long weight = ne.cost;
                if(dist[v] > dist[u]+weight){
                    dist[v] = dist[u]+weight;
                    q.add(new Vertex(v, dist[v]));
                }
            }
        }
        
        return dist;
    }
}

class Edge implements Comparable<Edge>{
    public int from = 0;
    public int to = 0;
    public int cost = 0;
    
    public Edge(int from, int to, int cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
    
    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

class Vertex implements Comparable<Vertex>{
    public int ver = 0;
    public long cost = 0;
    
    public Vertex(int ver, long cost) {
        this.ver = ver;
        this.cost = cost;
    }
    
    @Override
    public int compareTo(Vertex o) {
        long tmp = this.cost - o.cost;
        if(tmp == 0) return 0;
        return (int)(tmp/Math.abs(tmp));
    }
}