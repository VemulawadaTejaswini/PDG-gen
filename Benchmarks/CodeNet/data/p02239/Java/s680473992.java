//template code, C343, 2019
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
    private int totalVertex;
    Queue<Integer> toVisit;
    private LinkedList<LinkedList<Integer>> adjList;
    int[] distance;
    //adjacency list of edges
    public Graph() { totalVertex = 0; }
    public void loadAdjList() {
        Scanner in = new Scanner(System.in);
        totalVertex = in.nextInt();
        toVisit = new LinkedList<Integer>();
        distance = new int[totalVertex];
        adjList = new LinkedList<LinkedList<Integer>>();
        for(int i = 0; i < totalVertex; i ++) {
            LinkedList<Integer> tmp = new LinkedList<Integer>();
            int idx1 = in.nextInt() - 1;
            int degree = in.nextInt();
            //System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
            for(int j = 0; j < degree; j ++) {
                int idx2 = in.nextInt() - 1;
                tmp.add(idx2);
            }
            adjList.add(tmp);
        }

        for(int i = 1; i < totalVertex; i++)
            distance[i] = Integer.MAX_VALUE;

        in.close();
    }

    public void BFS(int v){
        toVisit.add(v);
        while(!toVisit.isEmpty()){
            int next = toVisit.remove();
            for(int neighbor : adjList.get(next)){
                if(!toVisit.contains(neighbor)){
                    if(distance[neighbor] > distance[next] + 1){
                        toVisit.add(neighbor);
                        distance[neighbor] = distance[next] + 1;
                    }
                }
            }
        }
    }
    public void search(){
        BFS(0);
        for(int i = 0; i < totalVertex; i++){
            if(distance[i] == Integer.MAX_VALUE)
                distance[i] = -1;
            System.out.println(i + 1 + " " + distance[i]);
        }
    }
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main{
    public static void main(String argv[]) {
        Graph g = new Graph();
        g.loadAdjList();
        g.search();
    }
}
