import java.util.*;


/**
 * https://onlinejudge.u-aizu.ac.jp/beta/room.html#CSC11F_2019_Week_01/problems/C
 */

public class Main {

    static public class Vertex implements Comparable<Vertex> {
    
        public ArrayList<Edge> neighbours;
        public int minDistance = Integer.MAX_VALUE;
        public Vertex previous;
        public int compareTo(Vertex other){
            return Double.compare(minDistance,other.minDistance);
        }
        public Vertex() {
            neighbours = new ArrayList<Edge>();
        }
    }
    
    static public class Graph {
        private ArrayList<Vertex> vertices;
        public Graph(int numberVertices){
            vertices = new ArrayList<Vertex>(numberVertices);
            for(int i=0;i<numberVertices;i++){
                vertices.add(new Vertex());
            }
        }
    
        public void addEdge(int src, int dest, int weight){
            Vertex s = vertices.get(src);
            Edge new_edge = new Edge(vertices.get(dest),weight);
            s.neighbours.add(new_edge);
        }
    
        public ArrayList<Vertex> getVertices() {
            return vertices;
        }
    
        public Vertex getVertex(int vert){
            return vertices.get(vert);
        }
    }
    
    static public class Edge{
        public final Vertex target;
        public final int weight;
        public Edge(Vertex target, int weight){
            this.target = target;
            this.weight = weight;
        }
    }

    static public void calculate(Vertex source){
        // Algo:
        // 1. Take the unvisited node with minimum weight.
        // 2. Visit all its neighbours.
        // 3. Update the distances for all the neighbours (In the Priority Queue).
        // Repeat the process till all the connected nodes are visited.

        source.minDistance = 0;
        PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
        queue.add(source);

        while(!queue.isEmpty()){
            Vertex u = queue.poll();

            for(Edge neighbour:u.neighbours){
                int newDist = u.minDistance+neighbour.weight;

                if(neighbour.target.minDistance>newDist){
                    // Remove the node from the queue to update the distance value.
                    queue.remove(neighbour.target);
                    neighbour.target.minDistance = newDist;

                    //Reenter the node with new distance.
                    queue.add(neighbour.target);
                }
            }
        }
    }

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            // source edge
            int source = sc.nextInt();

            // Create a new graph.
            Graph g = new Graph(V);

            // Add the required edges.
            for (int i = 0; i < E; i++) {
                int src = sc.nextInt();
                int dest = sc.nextInt();
                int weight = sc.nextInt();
                g.addEdge(src, dest, weight);
            }

            // Calculate Dijkstra.
            calculate(g.getVertex(source));

            // Print the minimum Distance.
            for (Vertex v : g.getVertices()) {
                if(v.minDistance == Integer.MAX_VALUE)
                    System.out.println("INF");
                else
                    System.out.println(v.minDistance);
            }
        }
    }

}

