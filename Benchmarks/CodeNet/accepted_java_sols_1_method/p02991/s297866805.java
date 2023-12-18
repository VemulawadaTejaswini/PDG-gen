import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer>[] g = new ArrayList[n];
		for(int i = 0; i < n; i++) g[i] = new ArrayList<>();
		for(int i = 0; i < m; i++){
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken())-1;
			int v = Integer.parseInt(st.nextToken())-1;
			g[u].add(v);
		}
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken())-1;
		int t = Integer.parseInt(st.nextToken())-1;
		int[][] dist = new int[3][n];
		for(int i = 0; i < 3; i++) Arrays.fill(dist[i], -1);
		dist[0][s] = 0;
		LinkedList<Integer> q = new LinkedList<>();
		q.add(s);
		while(!q.isEmpty()){
			int u = q.removeFirst();
			for(int v: g[u]){
				boolean yes = false;
				for(int d = 0; d < 3; d++){
					if(dist[d][u] >= 0 && dist[(d+1)%3][v] < 0){
						dist[(d+1)%3][v] = dist[d][u] + 1;
						yes = true;
					}
				}
				if(yes) q.add(v);
			}
		}
		System.out.println(dist[0][t] >= 0 ? dist[0][t] / 3 : dist[0][t]);
	}
}
