import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	static int n;

	static int[] v;

	static int[][] graph;

	static int[] d;
	static int[] f;

	static int time;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		graph = new int[n][n];

		v = new int[n];

		d = new int[n];

		f = new int[n];

		for (int i = 0; i < n; i++) {
			String[] u_k_v = br.readLine().split(" ");

			int u = Integer.parseInt(u_k_v[0]);

			for (int k = 0; k < Integer.parseInt(u_k_v[1]); k++) {

				graph[u-1][Integer.parseInt(u_k_v[2+k]) - 1] = 1;

			}
		}
		time =1;
		for(int i=0; i<n-1;i++){
		     time = depth_search(i,time);
		}

/*
		  for(int i=0; i<n; i++){ for(int k=0; k <n; k++){
		  System.out.print(graph[i][k]);

		  } System.out.println(""); }
*/
	       for (int i=0; i<n; i++) {
	            StringBuilder sb = new StringBuilder();
	            sb.append((i+1)).append(" ").append(d[i]).append(" ").append(f[i]);
	            System.out.println(sb);
	        }
	}


	static int depth_search(int sx, int count){

        if (d[sx] != 0)
            return time;

		int j ;

		v[sx] =1;

		time = count;

		d[sx] = time++;

		for(j=0; j<n; j++){

			if(graph[sx][j] ==1 && v[j] !=1){
				depth_search(j, time);
			}

		}
		f[sx] = time++;

		return time;
	}

}