import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;

class Edge {
    private int srcVertex;
    private int destVertex;

    public Edge (int src, int dest) {
        srcVertex = src;
        destVertex = dest;
    }

    public boolean equals(Object other) {
        return (other instanceof Edge) && (((Edge) other).srcVertex == srcVertex) && (((Edge) other).destVertex == destVertex);
    }

    public int hashCode() {
        return srcVertex + destVertex * destVertex;
    }
}

class Graph {
	private int totalVertex;
    private LinkedList<LinkedList<Integer>> adjList;
    private HashMap<Edge, Integer> edgeMap;

    public Graph() {
        adjList = new LinkedList<>();
        edgeMap = new HashMap<>();
    }

    public void initialize() {
        Scanner input = new Scanner(System.in);
        totalVertex = input.nextInt();

        for (int i = 0; i < totalVertex; i++) {
            LinkedList<Integer> neighborList = new LinkedList<>();
            input.nextInt();
            int numNeighbors = input.nextInt();
            for (int j = 0; j < numNeighbors; j++) {
                int neighbor = input.nextInt();
                neighborList.add(neighbor);
                edgeMap.put(new Edge(i, neighbor), input.nextInt());
            }
            adjList.add(neighborList);
        }

        input.close();
    }

    public void Dijkstra() {
        int[] distances = new int[totalVertex];
        boolean[] visited = new boolean[totalVertex];

        for (int i = 1; i < distances.length; i++) {
            distances[i] = Integer.MAX_VALUE;
        }

        int currVertex = 0;
        for (int i = 0; i < totalVertex && distances[currVertex] < Integer.MAX_VALUE; i++) {
            currVertex = findMinVertex(distances, visited);
            visited[currVertex] = true;
            LinkedList<Integer> neighborList = adjList.get(currVertex);

            for (Integer neighbor : neighborList) {
                if (!visited[neighbor]) {
                    relax(currVertex, neighbor, distances, edgeMap.get(new Edge(currVertex, neighbor)));
                }
            }
        }

        for (int i = 0; i < totalVertex; i++) {
            System.out.println(i + " " + distances[i]);
        }
    }

    public int findMinVertex(int[] distances, boolean[] visited) {
        int minIndex = 0;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                minIndex = i;
                break;
            }
        }

        for (int i = 1; i < distances.length; i++) {
            if (!visited[i] && distances[i] < distances[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public void relax(int src, int dest, int[] distances, int weight) {
        int newDistance = distances[src] + weight;
        if (newDistance < distances[dest]) {
            distances[dest] = newDistance;
        }
    }
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
	Graph g = new Graph();
        g.initialize();
        g.Dijkstra();
	}
}
