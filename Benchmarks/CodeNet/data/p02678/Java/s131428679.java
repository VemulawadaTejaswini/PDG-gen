import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{ 
    public static class Graph{ 
        private int V;   // No. of vertices 
        private LinkedList<Integer> adj[]; // Array  of lists for Adjacency List Representation  
        public Graph(int v){ 
            V = v; 
            adj = new LinkedList[v+1]; 
            for (int i=0; i<=v; ++i) adj[i] = new LinkedList(); 
        } 
        //Function to add an edge into the graph 
        public void addEdge(int v, int w) { 
            adj[v].add(w);  // Add w to v's list. 
            adj[w].add(v);
        } 

        public int[] BFS(int s){ 
            // Mark all the vertices as not visited
            boolean visited[] = new boolean[V+1];
            int[] parent=new int[V+1];
            // Create a queue for BFS 
            LinkedList<Integer> queue = new LinkedList<Integer>(); 
            // Mark the current node as visited and enqueue it 
            visited[s]=true; 
            parent[s]=-1;
            queue.add(s); 
            while (queue.size() != 0){ 
                // Dequeue a vertex from queue and print it 
                s = queue.poll(); 
                // Get all adjacent vertices of the dequeued vertex s 
                // If a adjacent has not been visited, then mark it 
                // visited and enqueue it 
                Iterator<Integer> i = adj[s].listIterator(); 
                while (i.hasNext()){ 
                    int n = i.next(); 
                    if (!visited[n]){ 
                        visited[n] = true; 
                        parent[n]=s;
                        queue.add(n); 
                    } 
                } 
            }
            return parent;
        } 
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb=new StringBuffer();
        String[] str=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        Graph g=new Graph(n);
        for(int i=0;i<m;i++){
            str=br.readLine().split(" ");
            int a=Integer.parseInt(str[0]);
            int b=Integer.parseInt(str[1]);
            g.addEdge(a,b);
        }
        int[] p=g.BFS(1);
        for(int i=2;i<=n;i++){
            if(p[i]==0){
                System.out.println("No");
                return;
            }
            else sb.append(p[i]+"\n");
        }
        System.out.print("Yes\n"+sb);
    }
}
