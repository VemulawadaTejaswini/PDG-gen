import java.util.*; 
class Main { 
    // A user define class to represent a graph. 
    // A graph is an array of adjacency lists. 
    // Size of array will be V (number of vertices 
    // in graph) 
    int V; 
    LinkedList<Integer>[] adjListArray; 
      
    // constructor 
    Graph(int V) { 
        this.V = V; 
        // define the size of array as 
        // number of vertices 
        adjListArray = new LinkedList[V]; 
  
        // Create a new list for each vertex 
        // such that adjacent nodes can be stored 
  
        for(int i = 0; i < V ; i++){ 
            adjListArray[i] = new LinkedList<Integer>(); 
        } 
    } 
      
    // Adds an edge to an undirected graph 
    void addEdge( int src, int dest) { 
        // Add an edge from src to dest. 
        adjListArray[src].add(dest); 
  
        // Since graph is undirected, add an edge from dest 
        // to src also 
        adjListArray[dest].add(src); 
    } 
      
    int DFSUtil(int v, boolean[] visited) { 
        // Mark the current node as visited and print it 
        visited[v] = true; 
        System.out.print(v+" "); 
        int m = 1;
        // Recur for all the vertices 
        // adjacent to this vertex 
        for (int x : adjListArray[v]) { 
            if(!visited[x]) m = DFSUtil(x,visited); 
        } 
        return m + 1;
    } 
    void connectedComponents() { 
        // Mark all the vertices as not visited 
        boolean[] visited = new boolean[V]; 
        int max = 0;
        for(int v = 0; v < V; ++v) { 
            if(!visited[v]) { 
                // print all reachable vertices 
                // from v 
                max = Math.max(max, DFSUtil(v,visited)); 
            } 
        } 
        System.out.println(max);
    } 
      
      
    // Driver program to test above 
    public static void main(String[] args){ 
        // Create a graph given in the above diagram 
        HashSet<ArrayList<Integer>> check = new HashSet(); 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Graph g = new Graph(n); // 5 vertices numbered from 0 to 4  
        int m = in.nextInt();

        while(m-- > 0){
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            ArrayList<Integer> temp = new ArrayList();
            if(a > b){
                int k = a; 
                a = b;
                b = k;
            }
            temp.add(a); temp.add(b);
            if(!check.contains(temp))
                g.addEdge(a, b);
        }
        g.connectedComponents(); 
    } 
}     