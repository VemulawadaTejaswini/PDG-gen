
import java.util.*;

public class Main{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int nodesCount = sc.nextInt();;
        int edgeCount = 0;
        
        int[][] edgeArray = new int[nodesCount][nodesCount];
        
        Vertex[] nodes = new Vertex[nodesCount];
        
        //populate the graph
        for(int i = 0; i < nodesCount; i++){ //each node will have its own row
            int vertex = sc.nextInt();//first number on the row
            nodes[i] = new Vertex(vertex); //the index and the id will be shifted off by one, so be careful
            edgeCount = sc.nextInt();//second number on the row, also called degree
            for(int j = 0; j < edgeCount; j++){
                edgeArray[i][sc.nextInt() - 1] = 1;
            }
        }
        
        int time = 1;
        int j = 0;
        for(int i = 0; i < nodesCount; i++) {
        	//dfs, keep track of Vertex.d and Vertex.f
        	if(nodes[i].visited == false)
        		time = 1+ dfs(time,i,nodes,edgeArray);
        }
        
        //print time!
        for(int i = 0; i < nodesCount; i++) {
        	System.out.println(nodes[i].id + " " + nodes[i].d + " " + nodes[i].f);
        }
        sc.close();
    }
    
    public static int dfs(int time, int row, Vertex[] nodes, int[][]edgeArray) {
    	if(nodes[row].visited) {
    		return time-1;
    	}
    	else {
    		nodes[row].d = time;
    		nodes[row].visited = true;

    		//for(int i = nodes.length-1; i >= 0; i--) {
    		for(int i = 0; i < nodes.length; i++) {
    			if(edgeArray[row][i] > 0) {
    				time =  dfs(time+1, i, nodes, edgeArray);
    			}
    		}
    		nodes[row].f = time +1;
    		return time+1;
    	}
    }
}

class Vertex{
    int id;
    int d; //discover time
    int f; //finish time
    boolean visited;
    
    public Vertex(int id){
        this.id = id;
        visited = false;
    }
}
