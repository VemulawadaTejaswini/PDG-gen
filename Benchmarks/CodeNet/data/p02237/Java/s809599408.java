import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
	
	static class Vertex {
		int id;
		int deg;
		int[] neighbors;
		
		public Vertex(int id, int[] neighbors) {
			this.id = id;
			this.deg = neighbors.length;
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
	}
	
	HashMap<Integer, Vertex> vertices;
	
	public Main() {
		vertices = new HashMap<>();
	}
	
	public Main(Vertex[] v) {
		this();
		for (Vertex vertex : v) {
			this.vertices.put(vertex.id, vertex);
		}
	}
	
	public void addVertex(Vertex v) {
		vertices.put(v.id, v);
	}
	
	public Vertex get(int id) {
		return this.vertices.get(id);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dim = Integer.parseInt(in.nextLine());
		int[][] adjM = new int[dim][dim];
		Main g = new Main();
		
		String[] info;
		int id;
		for (int i = 0; i < dim; i++) {
			info = in.nextLine().split(" ");
			id = Integer.parseInt(info[0]);
			int[] neighbors = new int[Integer.parseInt(info[1])];
			for (int j = 0; j < neighbors.length; j++) {
				neighbors[j] = Integer.parseInt(info[j + 2]);
			}
			g.addVertex(new Vertex(id, neighbors));
		}
		
		for (int row = 0; row < dim; row++) {
			String buffer = "";
			for (int col = 0; col < dim; col++) {
				adjM[row][col] = 0; // default
				
				if (g.get(row + 1).hasNeighbor(col + 1)) { // if there is an adjacency
					adjM[row][col] = 1;
				}
				buffer += adjM[row][col];
				if (col != dim - 1) {
					buffer += " ";
				}
			}
			System.out.println(buffer);
		}
	}
}
