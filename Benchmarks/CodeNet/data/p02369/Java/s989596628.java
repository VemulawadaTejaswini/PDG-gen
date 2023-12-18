import java.util.*;

class Graph{
    private int V, E;
    private LinkedList<LinkedList<Integer>> adjLists; 
    private int[] status;
    public Graph(int v, int e){
        V = v; E = e;
        status = new int[v];
        adjLists = new LinkedList<>();
        for(int i = 0; i < V; i++){
            adjLists.add(new LinkedList<>());
        }
        for(int i = 0; i < V; i++){
            status[i] = 0;
        }
    }
    public void addEdge(int s, int t){
        adjLists.get(s).add(t);
    }
    public void print(){
        for(int i = 0; i < V; i++){
            for(int j = 0; j < adjLists.get(i).size(); j++){
                System.out.print(adjLists.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    private boolean dfsUtil(int u){
        if(status[u] == 1)
            return false;
        LinkedList<Integer> adjList = adjLists.get(u);
        status[u] = 1;
        for(int i = 0; i < adjList.size(); i++){
            int v = adjList.get(i);
            if(status[v] != 2 && dfsUtil(v) == false)
                return false;
        }
        status[u] = 2;
        return true;
    }
    public boolean dfs(){
        for(int i = 0; i < V; i++){
            if(status[i] == 0 && dfsUtil(i) == false)
                return false;
        }
        return true;
    }
}

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int V, E;
        V = sc.nextInt(); E = sc.nextInt();
        Graph g = new Graph(V, E);
        for(int i = 0; i < E; i++){
            int s, t;
            s = sc.nextInt(); t = sc.nextInt();
            g.addEdge(s, t);
        }
        System.out.println(g.dfs()? 0: 1);
    }
}

