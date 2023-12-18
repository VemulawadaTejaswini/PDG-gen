import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int INF = 1000000000;
	static final int T_MAX = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[][] dist = new int[T_MAX][T_MAX];
		
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			for(int i = 0; i < T_MAX; i++){
				Arrays.fill(dist[i], INF);
				dist[i][i] = 0;
			}
			int max = 0;
			for(int i = 0; i < n; i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				max = Math.max(max, Math.max(a, b));
				dist[a][b] = sc.nextInt();
				dist[b][a] = dist[a][b]; 
			}
			for(int k = 0; k <= max; k++){
				for(int i = 0; i <= max; i++){
					for(int j = 0; j <= max; j++){
						dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
					}
				}
			}
			int idx = 1;
			int min = INF;
			for(int i = 0; i <= max; i++){
				int sum = 0;
				for(int j = 0; j <= max; j++){
					sum += dist[i][j];
				}
				if(min > sum){
					min = sum;
					idx = i;
				}
			}
			System.out.println(idx + " " + min);
		}
		
		sc.close();
	}

}