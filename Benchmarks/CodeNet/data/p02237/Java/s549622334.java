
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	private boolean adjMatrix[][];
    private int numVertices;

    public Main(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
  }

    public void addEdge(int i, int j) {
              adjMatrix[i][j] = true;
  }

  public String toString() {
      StringBuilder s = new StringBuilder();
      for (int i = 0; i < numVertices; i++) {
          //s.append((i) + ": ");
    	  int k = 0;
          for (boolean j : adjMatrix[i]) {
        	  
        	  if( k == adjMatrix[i].length-1 )
        		  s.append((j?1:0) + "\n");
        	  else
        		  s.append((j?1:0) + " ");
        	  k++;
          }
          //s.append("\n");
      }
      return s.toString();
  }
  public static void main(String args[]) {
      
    //              ArrayList<Integer> kValues = new ArrayList<>();
  	// input:
  	Scanner in = new Scanner(System.in);
  	String input = in.nextLine();
  	String[] nVals = input.split("\\s");
  	int n = Integer.parseInt(nVals[0]);
  	Main graph = new Main(n);
  	// var n to give number of following lines
  	for(int i = 0; i < n; i++) {
  		// each line has:
  		String line = in.nextLine();
  		String[] info = line.split("\\s");
  		// var u to tell vertex ID
  		int u = Integer.parseInt(info[0]);
  		// var k to tell how many values follow to place
  		int k = Integer.parseInt(info[1]);
  		// take in k number of values
  		for(int j = 0; j < k; j++) {
  			// mess with the k values
  			int kVal = Integer.parseInt(info[j+2]);
  			graph.addEdge(u - 1, kVal - 1);
  		}
  	}
  	System.out.print(graph.toString());
  	
  	
  }
}
