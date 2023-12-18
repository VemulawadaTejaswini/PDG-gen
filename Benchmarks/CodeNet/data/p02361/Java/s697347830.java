import java.util.*;

class Pair{
    public int vertex, dist;
    public Pair(int v, int d){
        vertex = v; dist = d;
    }
}

class Graph{
    private int V; 
    private List<List<Pair>> adjLists;
    private int[] minDist;
    public Graph(int v){
        this.V = v;
        adjLists = new ArrayList<>();
        for(int i = 0; i < v; i++){
            adjLists.add(new ArrayList<>());
        }
        minDist = new int[v];
        Arrays.fill(minDist, Integer.MAX_VALUE);
    }
    public void addEdge(int s, int t, int d){
        adjLists.get(s).add(new Pair(t, d));
    }
    public void djkstra(int r){
        PriorityQueue<Pair> pq = new PriorityQueue<>(1000000, new Comparator<Pair>(){public int compare(Pair p1, Pair p2){
                                                                                            return p1.dist - p2.dist;
                                                                                    }});
        minDist[r] = 0;
        pq.add(new Pair(r, 0));
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            List<Pair> adjList = adjLists.get(p.vertex);
            for(int i = 0; i < adjList.size(); i++){
                Pair c = adjList.get(i);
                if(minDist[c.vertex] > minDist[p.vertex] + c.dist){
                    minDist[c.vertex] = minDist[p.vertex] + c.dist;
                    pq.add(new Pair(c.vertex, c.dist));
                }
            }
        }
        for(int i = 0; i < this.V; i++){
            System.out.println(minDist[i] == Integer.MAX_VALUE? "INF": minDist[i]);
        }
    }
}

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int V, E, r;
        V = sc.nextInt(); E = sc.nextInt(); r = sc.nextInt();
        Graph g = new Graph(V);
        for(int i = 0; i < E; i++){
            int s, t, d;
            s = sc.nextInt(); t = sc.nextInt(); d = sc.nextInt();
            g.addEdge(s, t, d);
        }
        g.djkstra(r);
    }
}

