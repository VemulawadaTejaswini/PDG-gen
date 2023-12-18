import java.util.*;
class CostEdge{
    int to;
    int distance;
    int cost;
    public CostEdge(int t, int d, int c){
        this.to = t;
        this.distance = d;
        this.cost = c;
    }
}
class Node{
    int d;
    int p;
    public Node(int d, int p){
        this.d = d;
        this.p = p;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n==0&&m==0)return;
            List<List<CostEdge>> g = new ArrayList<List<CostEdge>>();
            for(int i=0; i<n; i++)
                g.add(new ArrayList<CostEdge>());
            for (int i = 0; i < m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int d = sc.nextInt();
                int c = sc.nextInt();
                CostEdge e1 = new CostEdge(v-1, d, c);
                CostEdge e2 = new CostEdge(u-1, d, c);
                g.get(u-1).add(e1);
                g.get(v-1).add(e2);
            }
            int[] d = new int[n];
            Arrays.fill(d, Integer.MAX_VALUE);
            d[0] = 0;
            int[] ans = new int[n];
            Arrays.fill(ans, Integer.MAX_VALUE);
            ans[0] = 0;
            dijkstra(0, d, g, ans);
            int res = 0;
            for(int i=0; i<n; i++)
                res += ans[i];
            System.out.println(res);
        }
    }
    public static void dijkstra(int s, int[] d, List<List<CostEdge>> graph, int[] ans){
        PriorityQueue<Node> pq = new PriorityQueue<>(10, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.d - o2.d;
            }
        });
        pq.offer(new Node(0, s));
        while(!pq.isEmpty()){
            Node nd = pq.poll();
            if(d[nd.p] < nd.d) continue;
            for(int i=0; i<graph.get(nd.p).size(); i++){
                CostEdge e = graph.get(nd.p).get(i);
                if(d[e.to] > d[nd.p] + e.distance){
                    d[e.to] = d[nd.p] + e.distance;
                    ans[e.to] = e.cost;
                    pq.offer(new Node(d[e.to], e.to));
                }
                else if(d[e.to] == d[nd.p] + e.distance)
                    ans[e.to] = Math.min(ans[e.to], e.cost);
            }
        }
    }
}
