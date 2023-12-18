
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
		if(components.get(node1) == components.get(node2))
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
			graph.put(vertices.get(i).getValue(), vertices.get(i).getConnections());
	}
	public Graph() {
		graph = new HashMap<Integer, ArrayList<Integer>>();
	}
	
	public void addConnection(Vertex v) {
		if(graph.containsKey(v.getValue())) {
			ArrayList<Integer> currentConnections = graph.get(v.getValue());
			for(int i = 0; i < v.getConnections().size(); i++) {
				if(!currentConnections.contains(v.getConnections().get(i)))
					currentConnections.add(v.getConnections().get(i));
			}
			Collections.sort(currentConnections);
		}
		else
			graph.put(v.getValue(), v.getConnections());
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
	
	public static void main(String [] args) {
		ArrayList<Vertex> vertices = new ArrayList<Vertex>(Arrays.asList(new Vertex[] {new Vertex(1, new int[] {2, 5}),
																					   new Vertex(2, new int[] {3}),
										 											   new Vertex(3, new int[] {4}),
										 											   new Vertex(4, new int[] {5}),
																					   new Vertex(5, new int[] {2, 6}),
																					   new Vertex(6, new int[] {7}),
																					   new Vertex(7, new int[] {4})}));
		Graph g = new Graph(vertices);
		System.out.println(g);
		g.addConnection(new Vertex(4, new int[] {5, 6, 7}));
		System.out.println(g);
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
