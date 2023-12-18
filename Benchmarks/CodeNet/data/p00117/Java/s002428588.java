import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		doIt();
	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int[][] d = new int[n][n]; 
		int m = sc.nextInt();
		int[][] road = new int[m][4];
		for(int i = 0; i < m; i++){
			String s = sc.next();
			String[] ss = s.split(",");
			for(int j = 0; j < 4; j++){
				road[i][j] = Integer.parseInt(ss[j]);
			}
		}
		int[] input = new int[4];
		String s = sc.next();
		String[] ss = s.split(",");
		for(int j = 0; j < 4; j++){
			input[j] = Integer.parseInt(ss[j]);
		}
		int start = input[0];
		int goal = input[1];
		//startからgoalの最短距離を求める
		//startからの距離
		int[] d = new int[n];
		Arrays.fill(d, INF);
		d[start - 1] = 0;
		while(true){
			boolean bChange = false;
			//道を見ていく
			for(int i = 0; i < m; i++){
				int from = road[i][0];
				int to = road[i][1];
				int cost = road[i][2];
				if(d[from - 1] != INF && d[from - 1] + cost < d[to - 1]){
					d[to - 1] = d[from - 1] + cost;
					bChange = true;
				}
				
				
				from = road[i][1];
				to = road[i][0];
				cost = road[i][3];
				if(d[from - 1] != INF && d[from - 1] + cost < d[to - 1]){
					d[to - 1] = d[from - 1] + cost;
					bChange = true;
				}
			}
			//print(d);
			if(bChange == false) break;
		}
		int sum = d[goal - 1];
		
		//今度はゴールからスタートまでの最短距離
		start = input[1];
		goal = input[0];
		Arrays.fill(d, INF);
		d[start - 1] = 0;
		while(true){
			boolean bChange = false;
			//道を見ていく
			for(int i = 0; i < m; i++){
				int from = road[i][0];
				int to = road[i][1];
				int cost = road[i][2];
				if(d[from - 1] != INF && d[from - 1] + cost < d[to - 1]){
					d[to - 1] = d[from - 1] + cost;
					bChange = true;
				}
				
				
				from = road[i][1];
				to = road[i][0];
				cost = road[i][3];
				if(d[from - 1] != INF && d[from - 1] + cost < d[to - 1]){
					d[to - 1] = d[from - 1] + cost;
					bChange = true;
				}
			}
			//print(d);
			if(bChange == false) break;
		}
		//System.out.println(d[goal - 1]);
		sum += d[goal - 1];
		
		System.out.println(input[2] - input[3] - sum);
		
	}
	
	public static void print(int[] d){
		for(int a : d){
			System.out.print(a + " ");
		}
		System.out.println();
	}

}