
import java.util.Scanner;
import java.util.HashMap;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// AIZU friendly file, just remove first line
public class Main {
	static HashMap<Integer, Integer> components;
	static ArrayList<Integer> vertexToIndex;
	static Graph g;
	
	public static void buildComponents(Graph gr) {
		components = new HashMap<Integer, Integer>();
		g = gr;
		HashMap<Integer, ArrayList<Integer>> graph = g.getGraph();
		vertexToIndex = new ArrayList<Integer>();
		for(int i: graph.keySet()) {
			vertexToIndex.add(i);
		}
		
		int currentComponent = 0;
		int currentManualInsertion = 0;
		ArrayList<Integer> neighbors;
		Queue<Integer> toExplore = new ArrayDeque<Integer>();
		ArrayList<Integer> explored = new ArrayList<Integer>();
		
		while(explored.size() < g.getNumVertices()) {
			toExplore.add(vertexToIndex.get(currentManualInsertion));
			while(!toExplore.isEmpty()) {
				int currentVertexValue = toExplore.remove();
				explored.add(currentVertexValue);
				components.put(currentVertexValue, currentComponent);
				
				neighbors = graph.get(currentVertexValue);
				for(int i = 0; neighbors != null && i < neighbors.size(); i++) {
					if(!explored.contains(neighbors.get(i)))
						toExplore.add(neighbors.get(i));
				}
			}
			currentComponent++;
			while(currentManualInsertion < g.getNumVertices() && components.containsKey(vertexToIndex.get(currentManualInsertion)))
				currentManualInsertion++;
		}
	}
	
	public static String hasConnection(int node1, int node2) {
		String str = "no";
		if(components.get(node1) == components.get(node2) && components.get(node1) != null)
			str = "yes";
		return str;
	}
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		Graph graph = new Graph();
		
		int users = scan.nextInt();
		int relations = scan.nextInt();
		
		for(int i = 0; i < relations; i++)
			graph.addConnection(new Vertex(scan.nextInt(), new int[] {scan.nextInt()}));
		
		buildComponents(graph);
		
		int queries = scan.nextInt();
		
		for(int i = 0; i < queries; i++)
			System.out.println(hasConnection(scan.nextInt(), scan.nextInt()));
		
		scan.close();
	}
}

class Graph {
	private HashMap<Integer, ArrayList<Integer>> graph;
	
	public Graph(ArrayList<Vertex> vertices) {
		graph = new HashMap<Integer, ArrayList<Integer>>();
		
		for(int i = 0; i < vertices.size(); i++) 
			addConnection(vertices.get(i));
	}
	public Graph() {
		graph = new HashMap<Integer, ArrayList<Integer>>();
	}
	
	public void addConnection(Vertex v) {
		ArrayList<Integer> currentConnections = graph.containsKey(v.getValue()) ? graph.get(v.getValue()) : new ArrayList<Integer>();
		int currentConnection = -1;
		for(int i = 0; i < v.getConnections().size(); i++) {
			currentConnection = v.getConnections().get(i);
			if(!currentConnections.contains(currentConnection))
				currentConnections.add(currentConnection);
			if(!graph.containsKey(currentConnection)) {
				ArrayList<Integer> backwardsAddition = new ArrayList<Integer>();
				backwardsAddition.add(v.getValue());
				graph.put(currentConnection,  backwardsAddition);
			}
		}
		Collections.sort(currentConnections);
		graph.put(v.getValue(), currentConnections);
	}
	
	public Vertex getVertex(int value) {
		if(graph.containsKey(value))
			return new Vertex(value, graph.get(value));
		else
			return null;
	}
	public HashMap<Integer, ArrayList<Integer>> getGraph(){
		return graph;
	}
	public int getNumVertices() {
		return graph.size();
	}
	
	public String toString() {
		return graph.toString();
	}
}


class Vertex {
	int value;
	ArrayList<Integer> connections;
	
	public Vertex(int v, ArrayList<Integer> cs) {
		value = v;
		connections = cs;
	}
	public Vertex(int v, int[] cs) {
		value = v;
		connections = new ArrayList<Integer>();
		for(int i = 0; i < cs.length; i++)
			connections.add(cs[i]);
	}
	
	public int getValue() {
		return value;
	}
	public ArrayList<Integer> getConnections(){
		return connections;
	}
	
	public String toString() {
		return value + " -> " + connections;
	}
}
