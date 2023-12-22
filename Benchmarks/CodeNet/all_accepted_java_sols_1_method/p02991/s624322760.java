import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer>[] g = new ArrayList[n];
		for(int i = 0; i < n; i++) g[i] = new ArrayList<>();
		for(int i = 0; i < m; i++){
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			g[u].add(v);
		}
		int s = sc.nextInt()-1, t = sc.nextInt()-1;
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
