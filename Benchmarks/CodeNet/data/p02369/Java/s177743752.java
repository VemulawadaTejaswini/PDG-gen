import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static int UNDISCOVERED = 0;
	public static int DISCOVERED = 1;
	public static int COMPLETED = 2;
	private ArrayList<Node> nodes = new ArrayList<Node>();
	private int nodesNum = 0;
	private int edgesNum = 0;
	private ArrayList<Node> roots = new ArrayList<Node>();
	
	/* Main Method */
	public static void main(String[] args) {
		Main graph = new Main();
		graph.initialize();
		boolean flag = false;
		for(int i = 0; i < graph.nodesNum; i++) {
			Node target = graph.nodes.get(i);
			if(target.getStatus() > UNDISCOVERED) continue;
			else if(graph.dfs(target)) flag = true;
		}
		if(flag) System.out.println("1");
		else System.out.println("0");
	}

	/* Read the input, generate nodes and initialize with edges */
	private void initialize() {
		Scanner scanner = new Scanner(System.in);
		this.nodesNum = scanner.nextInt();
		this.edgesNum = scanner.nextInt();
		this.generateNodes(nodesNum);
		for(int i = 0; i < edgesNum; i++) {
			int origin = scanner.nextInt();
			int destination = scanner.nextInt();
			Node originNode = this.nodes.get(origin);
			Node destinationNode = this.nodes.get(destination);
			originNode.edges.add(new Edge(originNode, destinationNode));
		}
	}	
	
	/* Depth first search function */
	private boolean dfs(Node u) {
		u.discover();
		boolean detection = false;
		for(int i = 0; i < u.edges.size(); i++) {
			Node destination = u.edges.get(i).getDestination();
			if(destination.getStatus() == DISCOVERED) return true;
			if(destination.getStatus() == UNDISCOVERED) if(dfs(destination)) return true;;
		}
		u.complete();
		return false;
	}
	
	/* Generate the given number of Nodes */
	private void generateNodes(int num) {
		for(int i = 0; i < num; i++) nodes.add(new Node(Integer.toString(i)));
	}
	
	/* Node class */
	private class Node {
		private String name = "";
		private boolean marked = false;
		public ArrayList<Edge> edges = new ArrayList<Edge>();
		private int status = UNDISCOVERED;
		
		public Node(String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
		public void discover() {
			this.status = DISCOVERED;
		}
		public void complete() {
			this.status = COMPLETED;
		}
		public int getStatus() {
			return this.status;
		}
	}
	
	/* Edge class */
	private class Edge {
		private Node origin;
		private Node destination;
		public Edge(Node ori, Node dest) {
			this.origin = ori;
			this.destination = dest;
		}
		public Node getDestination() {
			return this.destination;
		}
		public Node getOrigin() {
			return this.origin;
		}
	}
}

