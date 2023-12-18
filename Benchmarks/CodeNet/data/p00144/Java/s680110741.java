import java.util.Scanner;

public class Main {
	
	public static int[][] floyd(final int[][] adj, final int num){
		int[][] ret = new int[num][num];
		for(int i = 0; i < num; i++){
			for(int j = 0; j < num; j++){
				ret[i][j] = adj[i][j];
			}
		}
		
		for(int k = 0; k < num; k++){
			for(int i = 0; i < num; i++){
				for(int j = 0; j < num; j++){
					ret[i][j] = Math.min(ret[i][j], ret[i][k] + ret[k][j]);
				}
			}
		}
		
		return ret;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		final int roters = Integer.parseInt(sc.nextLine());
		final int[][] adj_roter = new int[roters][roters];
		
		for(int i = 0; i < roters; i++){
			for(int j = 0; j < roters; j++){
				adj_roter[i][j] = Integer.MAX_VALUE / 3;
			}
		}
		
		for(int i = 0; i < roters; i++){
			final String[] strs = sc.nextLine().split(" ");
			
			final int start = Integer.parseInt(strs[0]) - 1;
			final int count = Integer.parseInt(strs[1]);
			
			for(int j = 0; j < count; j++){
				adj_roter[start][Integer.parseInt(strs[j + 2]) - 1] = 1;
			}
		}
		
		final int[][] adj_min = floyd(adj_roter, roters);
		
		
		final int packets = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < packets; i++){
			final String[] strs = sc.nextLine().split(" ");
			final int start = Integer.parseInt(strs[0]) - 1;
			final int end = Integer.parseInt(strs[1]) - 1;
			final int lim = Integer.parseInt(strs[2]);
			
			if(adj_min[start][end] < lim){
				System.out.println(adj_min[start][end]+1);
			}else{
				System.out.println("NA");
			}
		}
		
	}
	
}