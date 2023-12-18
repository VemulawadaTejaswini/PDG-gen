/*
    Arnab Chanda 
*/

// All imports here

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

// Template code starts here //

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Debugger debug = new Debugger(out);
        Objectify objectify = new Objectify(debug);
        Task solver = new Task();
        int test = 1;
        while(test-->0){
            solver.solve(1, in, out, debug, objectify);
        }
		out.close();
	}
}

class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;
 
    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }
 
    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }
 
    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public Double nextDouble() {
        return Double.parseDouble(next());
    }

    public float nextFloat() {
        return Float.parseFloat(next());
    }
 
}

class Debugger{
    PrintWriter out;

    Debugger(PrintWriter out){    
        this.out = out;
    }

    public <T> void printList(List<T> arrayList){
        for( Object ob: arrayList){
            out.print(ob+" ");
        }
        out.println();
    }

    public <T> void printSet(Set<T> set){
        for(Object ob: set){
            out.print(ob+" ");
        }
        out.println();
    }

    public <T> void printMap(Map<?,?> map){
        for(Object ob: map.keySet()){
            System.out.println(ob+" : "+map.get(ob));
        }
    }
}

class Objectify{
    
    Debugger debug;

    Objectify(Debugger ob){ debug = ob; }

    public void printArr(int[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(double[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(long[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(char[] arr){ debug.printList( String.valueOf(arr).chars().mapToObj(c -> (char) c).collect(Collectors.toList())); }
    public void printArr(String[] arr){ debug.printList(Arrays.asList(arr)); }

    public void printMatrix(int[][] arr){ for(int a[]:arr) printArr(a); }
    public void printMatrix(double[][] arr){ for(double a[]:arr) printArr(a); }
    public void printMatrix(long[][] arr){ for(long a[]:arr) printArr(a); }
    public void printMatrix(char[][] arr){ for(char a[]:arr) printArr(a); }
    public void printMatrix(String[][] arr){ for(String a[]:arr) printArr(a); }

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Template code ends here


class Task {

    final long MOD = (int)Math.pow(10,9)+7;
    int arr[];
    int mini[];

    public void solve(int testNumber, InputReader sc, PrintWriter out, Debugger debug, Objectify objectify) {
        
        // write your code here
        int V = sc.nextInt();
        int m = sc.nextInt();


        int source = 1; 
  
        // Adjacency list representation of the  
        // connected edges 
        List<List<Node> > adj = new ArrayList<List<Node> >(); 
  
        // Initialize list for every node 
        for (int i = 0; i <= V; i++) { 
            List<Node> item = new ArrayList<Node>(); 
            adj.add(item); 
        } 
  
        // Inputs for the DPQ graph 
        for(int i = 0; i < m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(new Node(v, 1)); 
            adj.get(v).add(new Node(u, 1));
        }
  
        // Calculate the single source shortest path 
        DPQ dpq = new DPQ(V); 
        dpq.dijkstra(adj, source); 
  
        // Print the shortest path to all the nodes 
        // from the source node
        boolean flag = true; 
        for(int i = 2; i <= V; i++ ){
            if (dpq.dist[i][1] == Integer.MAX_VALUE){
                flag = false;
                break;
            }
        }

        if (flag == false){
            out.println("No");
        }else{
            out.println("Yes");
            for(int i = 2; i <= V; i++ ){
                out.println(dpq.dist[i][0]);
            }
        }
    }
    

    public class DPQ { 
        private int dist[][]; 
        private Set<Integer> settled; 
        private PriorityQueue<Node> pq; 
        private int V; // Number of vertices 
        List<List<Node> > adj; 
    
        public DPQ(int V) 
        { 
            this.V = V; 
            dist = new int[V+1][2]; 
            settled = new HashSet<Integer>(); 
            pq = new PriorityQueue<Node>(V, new Node()); 
        } 
    
        // Function for Dijkstra's Algorithm 
        public void dijkstra(List<List<Node> > adj, int src) 
        { 
            this.adj = adj; 
    
            for (int i = 0; i <= V; i++) {
                dist[i][1] = Integer.MAX_VALUE;
                dist[i][0] = -1;
            } 
    
            // Add source node to the priority queue 
            pq.add(new Node(src, 0)); 
    
            // Distance to the source is 0 
            dist[src][1] = 0; 
            while (settled.size() != V && !pq.isEmpty()) { 
    
                // remove the minimum distance node  
                // from the priority queue  
                int u = pq.remove().node; 
    
                // adding the node whose distance is 
                // finalized 
                settled.add(u); 
    
                e_Neighbours(u); 
            } 
        } 
    
        // Function to process all the neighbours  
        // of the passed node 
        private void e_Neighbours(int u) 
        { 
            int edgeDistance = -1; 
            int newDistance = -1; 
    
            // All the neighbors of v 
            for (int i = 0; i < adj.get(u).size(); i++) { 
                Node v = adj.get(u).get(i); 
    
                // If current node hasn't already been processed 
                if (!settled.contains(v.node)) { 
                    edgeDistance = v.cost; 
                    newDistance = dist[u][1] + edgeDistance; 
    
                    // If new distance is cheaper in cost 
                    if (newDistance < dist[v.node][1]) {
                        dist[v.node][1] = newDistance; 
                        dist[v.node][0] = u;
                    }
    
                    // Add the current node to the queue 
                    pq.add(new Node(v.node, dist[v.node][1])); 
                } 
            } 
        } 
    
    } 
  
    // Class to represent a node in the graph 
    class Node implements Comparator<Node> { 
        public int node; 
        public int cost; 
    
        public Node() 
        { 
        } 
    
        public Node(int node, int cost) 
        { 
            this.node = node; 
            this.cost = cost; 
        } 
    
        @Override
        public int compare(Node node1, Node node2) 
        { 
            if (node1.cost < node2.cost) 
                return -1; 
            if (node1.cost > node2.cost) 
                return 1; 
            return 0; 
        } 
    }
}