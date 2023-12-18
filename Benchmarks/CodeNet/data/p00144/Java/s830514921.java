import java.util.*;

public class Main{
	private static final int MAX = 1000000;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] map = new int[n+1][n+1];

		for(int i=0;i<n;i++){
			int from = sc.nextInt();
			int m = sc.nextInt();

			for(int j=0;j<m;j++){
				map[from][sc.nextInt()] = 1;
			}
		}

		floyd(map);

		int m = sc.nextInt();
		for(int i=0;i<m;i++){
			int from = sc.nextInt();
			int to = sc.nextInt();
			int rem = sc.nextInt();

			if(map[from][to] < MAX && rem >= map[from][to]+1){
				System.out.println(map[from][to]+1);
			}
			else{
				System.out.println("NA");
			}
		}
	}

	private static void floyd(int[][] map){
		int n = map.length-1;

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				map[i][j] = map[i][j] == 0 ? MAX : map[i][j];
			}
		}

		for(int k=1;k<=n;k++){
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					if(i == j) continue;
					map[i][j] = Math.min(map[i][j],map[i][k]+map[k][j]);
				}
			}
		}
	}
}