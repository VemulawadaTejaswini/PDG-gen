import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//First number given is |V| = n
		int size = in.nextInt();
		
		//initialize the graph matrix
		int[][] graph = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				graph[i][j] = 0;
			}
		}
				// note that graph[0] is for vertex 1
		
		for(int i = 0; i < size; i++) {
			int pos = in.nextInt() - 1; // the next number is the vertex we are on
			// next number given is number of relations for that particular vertex
			int numOfEdges = in.nextInt();
			for(int edge = 1; edge <= numOfEdges; edge++) {
				int col = in.nextInt() - 1;
				graph[pos][col] = 1;
			}
		}
		
		in.close();
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(j == size - 1)
					System.out.print(graph[i][j]);
				else
					System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}

	}

}

