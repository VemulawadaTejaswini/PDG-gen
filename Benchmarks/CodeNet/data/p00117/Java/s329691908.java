import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	int[][] cost;
	boolean[] visit;
	int[] dist;
	int n;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(true){
			n = scan.nextInt();
			int m = scan.nextInt();
			cost = new int[n][n];
			for(int i = 0;i < n;i++){
				Arrays.fill(cost[i], 1000000);
			}
			for(int i = 0;i < m;i++){
				String[] str = scan.next().split(",");
				int a = Integer.parseInt(str[0])-1;
				int b = Integer.parseInt(str[1])-1;
				cost[a][b] = Integer.parseInt(str[2]);
				cost[b][a] = Integer.parseInt(str[3]);
			}
			String[] str = scan.next().split(",");
			int[] x = {Integer.parseInt(str[0])-1,Integer.parseInt(str[1])-1};
			int reward = Integer.parseInt(str[2]) - Integer.parseInt(str[3]);
			for(int i = 0;i < 2;i++){
				visit = new boolean[n];
				dist = new int[n];
				Arrays.fill(dist,1000000);
				Arrays.fill(visit,false);
				dijkstra(x[i]);
				reward -= dist[x[(i+1)%2]];
			}
			System.out.println(reward);
		}
	}
	public void dijkstra(int start){
		dist[start] = 0;
		while(true){
			int min = 1000000;
			int next = -1;
			for(int u = 0;u < n;u++){
				if(visit[u]){
					continue;
				}
				dist[u] = Math.min(dist[u],dist[start] + cost[start][u]);
				if(dist[u] < min){
					min = dist[u];
					next = u;
				}
			}
			visit[start] = true;
			start = next;
			if(start == -1){
				break;
			}
		}
	}