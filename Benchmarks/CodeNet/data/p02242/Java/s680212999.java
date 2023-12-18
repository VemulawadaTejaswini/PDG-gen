import java.util.Scanner;
import java.util.HashMap;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main{

	public static void shortestPath(Graph g, int start, int end) {
		HashMap<Integer, ArrayList<DistanceTo>> graph = g.getGraph();
		
		int bestSolution = Integer.MAX_VALUE;
		Queue<TraveledRoute> toExplore = new ArrayDeque<TraveledRoute>();
		toExplore.add(new TraveledRoute(new DistanceTo(start, 0), new ArrayList<Integer>()));
		TraveledRoute current = new TraveledRoute(new DistanceTo(start, 0), new ArrayList<Integer>());
		ArrayList<DistanceTo> neighbors;
		while(!toExplore.isEmpty()) {
			current = toExplore.remove();
			if(current.getProgress().getID() != end) {
				neighbors = graph.get(current.getProgress().getID());
				for(int i = 0; i < neighbors.size(); i++) {
					if(current.getProgress().getDistance() + neighbors.get(i).getDistance() < bestSolution && notVisited(current.getVisitedNodes(), neighbors.get(i).getID()))
						toExplore.add(new TraveledRoute(new DistanceTo(neighbors.get(i).getID(), current.getProgress().getDistance() + neighbors.get(i).getDistance()), appendTo(current.getVisitedNodes(), neighbors.get(i).getID())));
				}
			}
			else
				bestSolution = bestSolution < current.getProgress().getDistance() ? bestSolution: current.getProgress().getDistance();
		}
		
		
		System.out.println(end + " " + bestSolution);
	}
	
	public static boolean notVisited(ArrayList<Integer> path, int nextNode) {
		return !path.contains(nextNode);
	}
	
	public static ArrayList<Integer> appendTo(ArrayList<Integer> path, int newNode){
		ArrayList<Integer> copy = new ArrayList<Integer>();
		for(int i = 0; i < path.size(); i++)
			copy.add(path.get(i));
		
		copy.add(newNode);
		
		return copy;
	}
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		Graph graph = new Graph();
		int numVertices = Integer.parseInt(scan.nextLine());
		String nextLine = "";
		String[] pieces;
		int vertexValue, degrees;
		ArrayList<DistanceTo> connections;
		for(int i = 0; i < numVertices; i++) {
			connections = new ArrayList<DistanceTo>();
			nextLine = scan.nextLine();
			pieces = nextLine.split(" ");
			vertexValue = Integer.parseInt(pieces[0]);
			degrees = Integer.parseInt(pieces[1]);
			
			for(int j = 0; j < degrees; j++) 
				connections.add(new DistanceTo(Integer.parseInt(pieces[2 + 2 * j]), Integer.parseInt(pieces[2 + 2 * j + 1])));
			
			graph.addConnection(new Vertex(vertexValue, connections));
		}
		
		for(int i = 0; i < numVertices; i++)
			shortestPath(graph, 0, i);
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
			
			ArrayList<DistanceTo> backwardsAddition = graph.containsKey(currentConnection.getID()) ? graph.get(currentConnection.getID()) : new ArrayList<DistanceTo>();
			if(!backwardsAddition.contains(v.getValue()))
				backwardsAddition.add(new DistanceTo(v.getValue(), currentConnection.getDistance()));
			graph.put(currentConnection.getID(),  backwardsAddition);
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

class TraveledRoute{
	DistanceTo progress;
	ArrayList<Integer> visitedNodes;
	
	public TraveledRoute(DistanceTo p, ArrayList<Integer> path) {
		progress = p;
		visitedNodes = path;
	}
	
	public DistanceTo getProgress() {
		return progress;
	}
	public ArrayList<Integer> getVisitedNodes(){
		return visitedNodes;
	}
}
