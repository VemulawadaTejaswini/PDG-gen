import java.util.*;

class Main{
    public static void main(String[] args){
        PriorityQueue<DVertex> pq = new PriorityQueue(100);
        ////
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        AdjList[] adjlists = new AdjList[n];
        boolean isBlack[] = new boolean[n];
        for(int i=0;i<n;i++) isBlack[i] = false;
        
        for(int i=0;i<n;i++){
            int u = sc.nextInt();
            int k = sc.nextInt();
            adjlists[u] = new AdjList();
            for(int j=0;j<k;j++){
                int t = sc.nextInt();
                int c = sc.nextInt();
                adjlists[u].add(new Edge(t,c));
            }
        }

        //Distance table
        int d[] = new int[n];
        int inf = 1000000;
        for (int i=0;i<n;i++){
            d[i] = inf;
        }
        d[0] = 0;
        pq.add(new DVertex(0,0));

        while (!pq.isEmpty()) {
            DVertex v = pq.poll();
            if (isBlack[v.id]) continue;
            isBlack[v.id] = true;
            AdjList al = adjlists[v.id];
            for(Edge e: al.adj)  {
                int w = e.term;
                int cost = e.cost;
                if (v.distance + cost < d[w]) {
                    d[w] = v.distance + cost;
                    pq.add(new DVertex(w,d[w]));
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(i);
            System.out.print(" ");
            System.out.println(d[i]);
        }
    }

}

class AdjList {
    ArrayList<Edge> adj;
    public AdjList() {
        this.adj = new ArrayList<Edge>();
    }
    public void add(Edge e){
        this.adj.add(e);
    }
}

class Edge {
    int term;
    int cost;
    public Edge(int t,int c){
        this.term = t;
        this.cost = c;
    }
}
class DVertex implements Comparable<DVertex> {
    int distance;
    int id;

    public DVertex(int id, int distance){
        this.id = id;
        this.distance = distance;
    }

    
    public int compareTo(DVertex that){
        return(this.distance - that.distance);
    }
}
