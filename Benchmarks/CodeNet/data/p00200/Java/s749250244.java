import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int INF = 1000000000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			
			int[][] cost = new int[m][m];
			int[][] time = new int[m][m];
			for(int i = 0; i < m; i++){
				for(int j = 0; j < m; j++){
					cost[i][j] = INF;
					time[i][j] = INF;
				}
			}
			for(int i = 0; i < n; i++){
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				cost[a][b] = sc.nextInt();
				cost[b][a] = cost[a][b];
				time[a][b] = sc.nextInt();
				time[b][a] = time[a][b];
			}
			for(int k = 0; k < m; k++){
				for(int i = 0; i < m; i++){
					for(int j = i + 1; j < m; j++){
						cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
						cost[j][i] = cost[i][j];
						time[i][j] = Math.min(time[i][j], time[i][k] + time[k][j]);
						time[j][i] = time[i][j];
					}
				}
			}
			int k = sc.nextInt();
			for(int i = 0; i < k; i++){
				int p = sc.nextInt() - 1;
				int q = sc.nextInt() - 1;
				int r = sc.nextInt();
				if(r == 0){
					System.out.println(cost[p][q]);
				}else if(r == 1){
					System.out.println(time[p][q]);
				}
			}
		}
		
		sc.close();
	}

}