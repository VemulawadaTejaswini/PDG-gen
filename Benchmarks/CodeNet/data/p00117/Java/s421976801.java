import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int[][] matrix = new int[n][n];
		for(int i = 0; i < n; i++){
			Arrays.fill(matrix[i], Integer.MAX_VALUE);
		}

		for(int i = 0; i < m; i++){
			String[] tmpArray = br.readLine().split(",");
			int a = Integer.parseInt(tmpArray[0])-1;
			int b = Integer.parseInt(tmpArray[1])-1;
			int c = Integer.parseInt(tmpArray[2]);
			int d = Integer.parseInt(tmpArray[3]);

			matrix[a][b] = c;
			matrix[b][a] = d;
			//System.out.println(i);
		}
//
//		for(int i = 0; i < n ; i++){
//			for(int j = 0; j < n; j++){
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}

		//System.out.println("read");
		//System.out.println(br.readLine());
		String[] tmpArray = br.readLine().split(",");
		int start = Integer.parseInt(tmpArray[0])-1;
		int goal = Integer.parseInt(tmpArray[1])-1;
		int reward = Integer.parseInt(tmpArray[2]);
		int pay = Integer.parseInt(tmpArray[3]);

		//System.out.println("test");
		int[] go = singleSourceShortestDense(matrix, start);
		int[] back = singleSourceShortestDense(matrix, goal);
		//System.out.printf("%d %d %d %d\n", start, goal, reward, pay);
//
//		for(int i = 0; i < n ; i++){
//			System.out.println("go["+i+"] = " +go[i] + " back["+i+"] = "+ back[i]);
//		}

		System.out.println(reward - go[goal] - back[start] - pay);

	}

	static int[] singleSourceShortestDense(int[][] matrix, int s){
        int n = matrix[0].length;
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        dist[s] = 0;

        while(true){
        	//System.out.println("IN SSD");
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
            	//System.out.println("v = "+v);
                int w = matrix[u][v];
                if(v == u) continue;

                long newLen = dist[u];
                newLen += w;
                //System.out.println("NEWLEN "+newLen);
                if(newLen < dist[v]){
                    dist[v] = (int)newLen;
                }
            }

        }

        return dist;
    }

}