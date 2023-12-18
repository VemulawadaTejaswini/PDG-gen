import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      Graph graph = new Graph(n);
      String[] vInfo;
      int[][] weight = new int[n][n];

      for(int i=0, j=0; i<n; i++, j=0) {
        vInfo = br.readLine().split(" ");
        for (String var : vInfo) {
          if(var.equals("")) continue;
          else weight[i][j++] = Integer.parseInt(var);
        }
        graph.setVertex(i, weight[i]);
      }

      System.out.println( graph.calcMSTWeightSum() );
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }


  class Graph {

    Vertex[] vertices;

    public Graph(int size ) {
      vertices  = new Vertex[size];
    }

    public void setVertex(int id) {
      vertices[id] = new Vertex(id);
    }
    public void setVertex(int id, int[] distance) {
      setVertex(id);
      setAjacent(id, distance);
    }
    public void setAjacent(int id, int[] distance) {
      vertices[id].distance = distance;
    }

    public int calcMSTWeightSum() {
      return  prim();
    }

    private int prim() {
      int minCost;
      int minV;
      vertices[0].minAjacent = 0;
      vertices[0].parent = Vertex.NILL;

      while( true ) {
        minCost = Integer.MAX_VALUE;
        minV = Vertex.NILL;

        for (Vertex v : vertices) {
          if( (v.state != Vertex.BLACK) && (v.minAjacent < minCost) ) {
            minV = v.id;
            minCost = v.minAjacent;
          }
        }

        if(minV == Vertex.NILL) break;

        vertices[minV].state = Vertex.BLACK;

        for (Vertex v : vertices) {
          if((v.state != Vertex.BLACK) && (v.distance[minV] != Vertex.NILL)) {
            if( v.distance[minV] < v.minAjacent ) {
              v.minAjacent = v.distance[minV];
              v.parent = minV;
              v.state = Vertex.GRAY;
            }
          }
        }
        continue;
      }

      minCost = 0;
      for (Vertex v: vertices) {
        if( v.parent != Vertex.NILL )
          minCost += v.minAjacent;
      }

      return minCost;
    }

    class Vertex {

      static final int NILL  =-1;
      static final int WHITE = 0;
      static final int GRAY  = 1;
      static final int BLACK = 2;
      int id;
      int state;
      int minAjacent;
      int parent;
      int[] distance;

      public Vertex(int id) {
        this.id = id;
        state = WHITE;
        minAjacent = Integer.MAX_VALUE;
      }
    }
  }
}
