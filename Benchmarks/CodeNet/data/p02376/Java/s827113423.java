import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt(), e=sc.nextInt();
        Node[] nodes=new Node[v];
        for(int i=0;i<v;i++) nodes[i]=new Node(i);
        for(int i=0;i<e;i++){
            addEdge(sc.nextInt(), sc.nextInt(), sc.nextLong(), nodes);
        }
        sc.close();
        long ans=fordFulkerson(0, v-1, v, nodes);
        System.out.println(ans); 
    }

    static void addEdge(int fr, int to, long cap, Node[] nodes) {
        nodes[fr].edges.add(new Edge(to, cap, nodes[to].edges.size()));
        nodes[to].edges.add(new Edge(fr, 0, nodes[fr].edges.size() - 1));
    }

    static long fordFulkerson(int s, int t, int n, Node[] nodes) {
        long flow = 0;
        boolean[] used;
        while (true) {
            used = new boolean[n];
            long f = dfs(s, t, nodes, Long.MAX_VALUE, used);
            flow+=f;
            if(f<=0) break;
        }
        return flow;
    }

    private static long dfs(int now, int t, Node[] nodes, long f, boolean[] used) {
        if (now == t) return f;
        used[now]=true;
        for (int i = 0; i < nodes[now].edges.size(); i++) {
            Edge e = nodes[now].edges.get(i);
            if (!used[e.to] && e.cap > 0) {
                long d = dfs(e.to, t, nodes, Math.min(f, e.cap), used);
                if (d > 0) {
                    e.cap -= d;
                    nodes[e.to].edges.get(e.rev).cap += d;
                    return d;
                }
            }
        }
        return 0;
    }

    static class Node {
        int id;
        ArrayList<Edge> edges;

        Node(int id) {
            this.id = id;
            edges = new ArrayList<>();
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Node))
                return false;
            Node n = (Node) o;
            if (n.id == id)
                return true;
            else
                return false;
        }

        @Override
        public int hashCode() {
            return id;
        }
    }

    static class Edge {
        int to;
        long cap;
        int rev;

        Edge(int to, long cap, int rev) {
            this.to = to;
            this.cap = cap;
            this.rev = rev;
        }
    }
}


