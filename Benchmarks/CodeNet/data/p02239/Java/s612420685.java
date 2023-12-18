import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] matrix = new int[n+1][n+1];
		Vertex[] v = new Vertex[n + 1];
		
		for(int i = 0; i <= n; i++){
			Arrays.fill(matrix[i], 0);
		}
		for(int i = 1 ; i <= n; i++){
			String[] tmpArray = br.readLine().split(" ");
			
			for(int j = 2 ; j < tmpArray.length ; j++){
				int tmp = Integer.parseInt(tmpArray[j]);
				matrix[i][tmp] = 1;
			}
			
			v[i] = new Vertex(i);
		}
		
		/*
		for(int i = 1; i <= n; i++){
			for(int j = 1 ; j <= n ; j++){
				if(j == 1){
					System.out.print(matrix[i][j]);
				}
				else {
					System.out.print(" "+matrix[i][j]);
				}
			}
			System.out.println();
		}*/
		
		bfs(matrix, v, 1);
		
		for(int i = 1; i <= n; i++){
			if(v[i].distance != Integer.MAX_VALUE){
				System.out.println(i + " " + v[i].distance);
			}
			else {
				System.out.println(i + " -1");
			}
		}
	}
	
	static void bfs (int[][] matrix, Vertex[] v, int start){
		v[start].color = Vertex.WHITE;
		v[start].distance = 0;
		
		Queue<Vertex> queue = new LinkedList<Vertex>();
		queue.add(v[start]);
		
		while(queue.size() != 0){
			Vertex u = queue.poll();
			for(int i = 1; i < v.length ; i++){
				if(matrix[u.id][i] == 0){
					continue;
				}
				
				Vertex tmpV = v[i];
				
				if(tmpV.color == Vertex.WHITE){
					tmpV.color = Vertex.GRAY;
					tmpV.distance = u.distance + 1;
					tmpV.parent = u;
					queue.add(tmpV);
				}
			}
			u.color = Vertex.BLACK;
		}
		
	}
}

class Vertex {
	static final int WHITE = 0;
	static final int GRAY = 1;
	static final int BLACK = 2;
	int color;
	int distance;
	Vertex parent;
	int id;
	
	public Vertex (int id){
		this.id = id;
		color = WHITE;
		distance = Integer.MAX_VALUE;
		parent = null;
	}
}