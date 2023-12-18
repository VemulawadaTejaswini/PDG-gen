import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	static class Vertex {
		int id;
		int deg;
		int[] neighbors;
		
		public Vertex(int id, int[] neighbors) {
			this.id = id;
			this.deg = 0;
			this.neighbors = neighbors;
		}
		
		public boolean hasNeighbor(int id) {
			for (int n : neighbors) {
				if (n == id) {
					return true;
				}
			}
			return false;
		}
		
		public String toString() {
			return "" + this.id + ": " + Arrays.toString(this.neighbors);
		}
		
		public void addNeighbor(int n) {
			this.neighbors = Arrays.copyOf(neighbors, neighbors.length + 1);
			this.neighbors[this.neighbors.length-1] = n;
		}
	}
	
	static class Edge {
		Vertex s;
		Vertex e;
		
		public Edge(Vertex source, Vertex dest) {
			this.s = source;
			this.e = dest;
			dest.deg += 1; // Adds one to the indegree of a Vertex when an edge is created
		}
	}
	
	HashMap<Integer, Vertex> vertices;
	ArrayList<Edge> edges;
	ArrayList<Integer> components;
	
	public Main() {
		vertices = new HashMap<>();
		edges = new ArrayList<>();
		components = new ArrayList<>();
	}
	
	public Main(Vertex[] v) {
		this();
		for (Vertex vertex : v) {
			this.vertices.put(vertex.id, vertex);
			components.add(-1);
		}
		for (Vertex vertex : v) {
			for (int n : vertex.neighbors) {
				this.addEdge(new Edge(vertex, this.get(n)));
			}
		}
		this.getComponents();
	}
	
	public void addVertex(Vertex v) {
		vertices.put(v.id, v);
	}
	
	public void addEdge(Edge e) {
		edges.add(e);
	}
	
	public Vertex get(int id) {
		return this.vertices.get(id);
	}
	
	public ArrayList<Vertex> topoSorted() {
		ArrayList<Vertex> sorted = new ArrayList<>();
		
		// List of possible starting places (Vertices of indegree 0)
		LinkedList<Vertex> candidates = new LinkedList<>();
		for (Vertex v : vertices.values()) {
			if (v.deg == 0) candidates.add(v);
		}
		
		while (!candidates.isEmpty()) {
			
			// Array containing degree of every vertex
			int[] indeg = new int[vertices.keySet().size()];
			for (int v : vertices.keySet()) {
				indeg[v-1] = vertices.get(v).deg;
			}
			
			LinkedList<Vertex> q = new LinkedList<>();
			q.add(candidates.poll());
			
			Vertex curr;
			while (!q.isEmpty()) {
				
				curr = q.poll();
				sorted.add(curr);
				for (int v : curr.neighbors) {
					indeg[v-1]--;
					if (indeg[v-1] == 0) {
						q.push(vertices.get(v));
					}
				}
			}
			if (sorted.size() == vertices.keySet().size()) {
				return sorted; // Found a solution!
			} else {
				sorted = new ArrayList<>(); // Clear sorted and try again from a different start point
			}
		}
		return null; // There is no solution
	}
	
	public boolean reachable(int start, int end) {
		// Checks if node start can reach node end using BFS
		LinkedList<Vertex> q = new LinkedList<>();
		LinkedList<Integer> visited = new LinkedList<>();
		
		Vertex n;
		Vertex curr;
		
		q.push(this.get(start));
		
		while (!q.isEmpty()) {
			curr = q.poll();
			visited.add(curr.id);
			
			if (curr.id == end) {
				return true;
			}
			
			for (int v : curr.neighbors) {
				if (!visited.contains(v)) {
					n = this.get(v);
					q.push(this.get(v));
				}
			}
		}
		return false;
	}
	
	public void getComponents() {
		// Groups all Vertices by how they're connected
		LinkedList<Vertex> s = new LinkedList<>();
		LinkedList<Integer> visited = new LinkedList<>();
		
		Vertex n;
		Vertex curr;
		int group = 0;
		
		while (min(this.components) != 0) {
			s.push(this.get(this.components.indexOf(min(this.components))));
			
			while (!s.isEmpty()) {
				curr = s.pop();
				visited.add(curr.id);
				this.components.set(curr.id, group);
				
				for (int v : curr.neighbors) {
					if (!visited.contains(v)) {
						n = this.get(v);
						s.push(this.get(v));
					}
				}
			}
			
			group++;
		}
	}
	
	public static int min(ArrayList<Integer> a) {
		int m = a.get(0);
		for (Integer i : a) {
			if ( i < m) {
				m = i;
			}
		}
		return m;
	}
	
	public static int[] parse(String[] n) {
		int[] r = new int[n.length];
		for (int i = 0; i < r.length; i++) {
			r[i] = Integer.valueOf(n[i]);
		}
		return r;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] counts = parse(in.nextLine().split(" "));
		Vertex[] v = new Vertex[counts[0]];
		
		int[] c = parse(in.nextLine().split(" "));
		while (c.length > 1) {
			if (v[c[0]] == null) { v[c[0]] = new Vertex(c[0], new int[] {}); }
			if (v[c[1]] == null) { v[c[1]] = new Vertex(c[1], new int[] {}); }
			v[c[0]].addNeighbor(c[1]);
			v[c[1]].addNeighbor(c[0]);
			
			c = parse(in.nextLine().split(" "));
		}
		
		Main g = new Main(v);

		int queries = c[0];
		for (int i = 0; i < queries; i++) {
			c = parse(in.nextLine().split(" "));
			if (g.components.get(c[0]) == g.components.get(c[1])) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
