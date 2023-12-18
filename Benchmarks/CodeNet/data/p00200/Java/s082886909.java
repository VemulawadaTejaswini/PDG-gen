import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int INF = 1000000000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] cost = new int[100][100];
		int[][] time = new int[100][100];
		
		while(true){
			int n = Integer.parseInt(sc.next());
			int m = Integer.parseInt(sc.next());
			if(n == 0 && m == 0){
				break;
			}
			
			for(int i = 0; i < m; i++){
				for(int j = 0; j < m; j++){
					cost[i][j] = INF;
					time[i][j] = INF;
				}
			}
			for(int i = 0; i < n; i++){
				int a = Integer.parseInt(sc.next()) - 1;
				int b = Integer.parseInt(sc.next()) - 1;
				cost[a][b] = Integer.parseInt(sc.next());
				cost[b][a] = cost[a][b];
				time[a][b] = Integer.parseInt(sc.next());
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
			PrintWriter out = new PrintWriter(System.out);
			for(int i = 0; i < k; i++){
				int p = Integer.parseInt(sc.next()) - 1;
				int q = Integer.parseInt(sc.next()) - 1;
				int r = Integer.parseInt(sc.next());
				if(r == 0){
					out.println(cost[p][q]);
				}else if(r == 1){
					out.println(time[p][q]);
				}
				out.flush();
			}
		}
		
		sc.close();
	}

}