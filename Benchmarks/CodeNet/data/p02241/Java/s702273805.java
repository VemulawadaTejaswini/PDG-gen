import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[][] matrix = new int[n][n];
        //Vertex[] v = new Vertex[n];
        for(int i = 0; i < n; i++){
        	String[] tmp = br.readLine().split(" ");
        	for(int j = 0;j < n; j++){
        		matrix[i][j] = Integer.parseInt(tmp[j]);
        	}
        	
        }
        
        System.out.println(donYoku(matrix));
        
	}
	
	static int donYoku(int[][] matrix){
		int n = matrix[0].length;
		
		int result = 0;
		int[][] matrix2 = new int[n][n];
		int[] visited = new int[n];
		for(int i = 0; i < n ; i++){
			Arrays.fill(matrix2[i], 0);
		}
		Arrays.fill(visited, 0);
		
		while(true){
			int minI = 0;
			int minJ = 0;
			int minimum = Integer.MAX_VALUE;
			for(int i = 0; i < n ; i++ ){
				for(int j = 0; j < n ; j++){
					if(matrix[i][j] > 0 && matrix[i][j] < minimum && matrix2[i][j] != 1){
						minI = i;
						minJ = j;
						minimum = matrix[i][j];
					}
				}	
			}
			
			matrix2[minI][minJ] = 1;
			matrix2[minJ][minI] = 1;
			result += minimum;
			//System.out.println("("+minI+","+minJ+") added distance"+minimum);
			
			if(visited[minI] == 1 && visited[minJ] == 1){
				break;
			}
			
			visited[minI] = 1;
			visited[minJ] = 1;
			
			int unchecked = 0;
			for(int i = 0; i < n ; i++){
				if(visited[i] == 0){
					unchecked++;
					break;
				}
			}
			if(unchecked == 0){
				break;
			}
		}
		
		return result;
	}
	/*
	static int[] MST (int[][] matrix){

		int n = matrix[0].length;
		Vertex[] V = new Vertex[n];
		int id = 0;
		Arrays.fill(V, new Vertex(id++, Integer.MAX_VALUE));
		int[] pred = new int[n];
		//Arrays.fill(key, Integer.MAX_VALUE);
		Arrays.fill(pred, -1);
		
		V[0].key = 0;
		PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>(new MyComparetor());
		for(int i = 0; i < n; i++){
			pq.add(V[i]);
		}
		
		while(!pq.isEmpty()){
			Vertex u = pq.poll();
			for(int i = 0; i < n; i++){
				if()
			}
		}
		
		return pred;
	}*/
	
	static class MyComparetor implements Comparator<Vertex>{

		@Override
		public int compare(Vertex o1, Vertex o2) {
			// TODO ?????????????????????????????????????????????
			if(o1.key > o2.key){
				return 1;
			}
			else if(o1.key < o2.key){
				return -1;
			}
			else {
				return 0;
			}
		}
		
	}

}

class Vertex {
	int id;
	int key;
	
	public Vertex (int id, int key){
		this.id = id;
		this.key = key;
	}
}