
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Main{
	
	public static int minSpanningTreeWeight(Graph g) {
		HashMap<Integer, ArrayList<DistanceTo>> graph = g.getGraph();
		ArrayList<Integer> visitedNodes = new ArrayList<Integer>();
		int weight = 0;
		
		int v = 0;
		while(!graph.containsKey(v))
			v++;
		
		visitedNodes.add(v);
		int shortestDistanceNode, shortestDistance;
		ArrayList<DistanceTo> neighbors;
		DistanceTo currentNeighbor;
		while(!visitedAll(graph, visitedNodes)) {
			shortestDistanceNode = -1;
			shortestDistance = Integer.MAX_VALUE;
			for(int i = 0; i < visitedNodes.size(); i++) {
				neighbors = graph.get(visitedNodes.get(i));
				for(int j = 0; j < neighbors.size(); j++) {
					currentNeighbor = neighbors.get(j);
					if(!visitedNodes.contains(currentNeighbor.getID()) && currentNeighbor.getDistance() < shortestDistance){
						shortestDistanceNode = currentNeighbor.getID();
						shortestDistance = currentNeighbor.getDistance();
					}
				}
			}
			visitedNodes.add(shortestDistanceNode);
			weight += shortestDistance;
		}
		
		return weight;
	}
	
	public static boolean visitedAll(HashMap<Integer, ArrayList<DistanceTo>> graph, ArrayList<Integer> visitedNodes) {
		for(Integer i: graph.keySet()) {
			if(!visitedNodes.contains(i))
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Graph g;
		ArrayList<Vertex> vertices = new ArrayList<Vertex>();
		int numVertices = scan.nextInt();
		
		ArrayList<DistanceTo> connections;
		int current;
		for(int i = 0; i < numVertices; i++) {
			connections = new ArrayList<DistanceTo>();
			for(int j = 0; j < numVertices; j++) {
				current = scan.nextInt();
				if(current != -1)
					connections.add(new DistanceTo(j + 1, current));
			}
			vertices.add(new Vertex(i + 1, connections));
		}
		
		g = new Graph(vertices);
		System.out.println(minSpanningTreeWeight(g));
	}
}

class Graph {
	private HashMap<Integer, ArrayList<DistanceTo>> graph;
	
	public Graph(ArrayList<Vertex> vertices) {
		graph = new HashMap<Integer, ArrayList<DistanceTo>>();
		
		for(int i = 0; i < vertices.size(); i++) 
			addConnection(vertices.get(i));
	}
	public Graph() {
		graph = new HashMap<Integer, ArrayList<DistanceTo>>();
	}
	
	public void addConnection(Vertex v) {
		ArrayList<DistanceTo> currentConnections = graph.containsKey(v.getValue()) ? graph.get(v.getValue()) : new ArrayList<DistanceTo>();
		DistanceTo currentConnection = null;
		for(int i = 0; i < v.getConnections().size(); i++) {
			currentConnection = v.getConnections().get(i);
			if(!currentConnections.contains(currentConnection))
				currentConnections.add(currentConnection);
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
	public HashMap<Integer, ArrayList<DistanceTo>> getGraph(){
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
	ArrayList<DistanceTo> connections;
	
	public Vertex(int v, ArrayList<DistanceTo> cs) {
		value = v;
		connections = cs;
	}
	public Vertex(int v, DistanceTo[] cs) {
		value = v;
		connections = new ArrayList<DistanceTo>();
		for(int i = 0; i < cs.length; i++)
			connections.add(cs[i]);
	}
	
	public int getValue() {
		return value;
	}
	public ArrayList<DistanceTo> getConnections(){
		return connections;
	}
	
	public String toString() {
		return value + " -> " + connections;
	}
}

class DistanceTo implements Comparable<DistanceTo>{
	int id, distance;
	
	public DistanceTo(int id, int distance) {
		this.id = id;
		this.distance = distance;
	}
	
	public int getID() {
		return id;
	}
	public int getDistance() {
		return distance;
	}
	
	public String toString() {
		return distance + " units from vertex " + id;
	}
	public int compareTo(DistanceTo other) {
		return this.id - other.getID();
	}
}
