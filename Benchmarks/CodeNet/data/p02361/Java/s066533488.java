import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by huzhejie on 2016/10/10.
 */
public class Main {
    @SuppressWarnings("unchecked")
    private static void dijkstra(Vertex source){
        source.minDistance = 0;
        PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
        queue.add(source);
        while(!queue.isEmpty()){
            Vertex v = queue.poll();

            for(Edge edge:v.nighbors){
                int newDist = v.minDistance +edge.weight;
                if(edge.target.minDistance>newDist){
                    queue.remove(edge.target);
                    edge.target.minDistance = newDist;

                    queue.add(edge.target);
                }
            }
        }
    }

    public static void main(String args[]){
//        long startTime = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = 1;
        String str=null;
        try {
            str = br.readLine();
            Graph g = new Graph(Integer.parseInt(str.split(" ")[0]));
            int source  = Integer.parseInt(str.split(" ")[2]);
            int edge = Integer.parseInt(str.split(" ")[1]);
            while ((str = br.readLine()) != null&&l<=edge){
                String record[] = str.split(" ");
                g.addEdge(Integer.parseInt(record[0]),Integer.parseInt(record[1]),Integer.parseInt(record[2]));
                l++;
            }
            br.close();
            dijkstra(g.vertices.get(source));
            for(Vertex v:g.vertices.values()){
                if(v.minDistance == Integer.MAX_VALUE)
                    System.out.println("INF");
                else
                System.out.println(v.minDistance);
            }
//            System.out.println((System.currentTimeMillis()-startTime)/1000);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
class Edge{
    public final Vertex target;
    public final int weight;
    public Edge(Vertex target,int weight){
        this.target = target;
        this.weight = weight;
    }
}
class Graph{
    Map<Integer,Vertex> vertices;
    public Graph(int vertexNumber){
        vertices = new LinkedHashMap<Integer, Vertex>();
        for(int i = 0;i<vertexNumber;i++){
            vertices.put(i,new Vertex(i));
        }
    }
    public void addEdge(int source,int target,int weight){
        Vertex v = vertices.get(source);
        Edge edge = new Edge(vertices.get(target),weight);
        v.nighbors.add(edge);
    }
}
@SuppressWarnings("unchecked")
class Vertex implements Comparable<Vertex>{
    int id;
    int minDistance = Integer.MAX_VALUE;
    ArrayList<Edge> nighbors;
    public Vertex(int id){
        this.id = id;
        this.nighbors = new ArrayList<Edge>();
    }
    public int compareTo(Vertex o) {
        return Integer.compare(minDistance,o.minDistance);
    }
}