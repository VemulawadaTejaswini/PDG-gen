import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
        	Arrays.fill(matrix[i], Integer.MAX_VALUE);
        }
        //Vertex[] v = new Vertex[n];
        for(int i = 0; i < n; i++){
        	String tmpStr = br.readLine();
        	
        	String[] tmp = tmpStr.split(" ");
        	for(int j = 0;j < Integer.parseInt(tmp[1]); j++){
        		matrix[i][Integer.parseInt(tmp[ 2*(j + 1)])] = Integer.parseInt(tmp[2*(j + 1) + 1]);
        	}

        }
        /*
        for(int i = 0; i < n; i++){
        	for(int j = 0; j < n; j++){
        		System.out.print(matrix[i][j]+ " ");
        	}
        	System.out.println();
        }
        */
        int[] dist = singleSourceShortestDense(matrix, 0);
        
        for(int i = 0; i < n ; i++){
        	System.out.println(i + " " + dist[i]);
        }
	}

	static int[] singleSourceShortestDense(int[][] matrix, int s){
		int n = matrix[0].length;
		int[] dist = new int[n];
		Arrays.fill(dist, Integer.MAX_VALUE);
		boolean[] visited = new boolean[n];
		Arrays.fill(visited, false);

		dist[s] = 0;
		
		while(true){
		
			int u = -1;
			int sd = Integer.MAX_VALUE;
			
			for(int i = 0; i < n ; i++){
				if(!visited[i] && dist[i] < sd){
					sd = dist[i];
					u = i;
				}
			}
			
			if(u == -1){
				break;
			}
			
			visited[u] = true;
			for(int v = 0; v < n ; v++){
				int w = matrix[u][v];
				if(v == u) continue;
				
				long newLen = dist[u];
				newLen += w;
				if(newLen < dist[v]){
					dist[v] = (int)newLen;
				}
			}

		}
		
		return dist;
	}

}