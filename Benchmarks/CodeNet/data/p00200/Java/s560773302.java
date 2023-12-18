

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().start();
	}
	int[][]cost;
	int[][]time;
	int m;
	void start(){
		Scanner in  = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			m = in.nextInt();
			if(n == 0)break;
			cost = new int[101][101];
			time = new int[101][101];
			for(int i = 0; i < m+1; i++){
				for(int j = 0;  j< m+1; j++){
					cost[i][j] = time[i][j] = 1 << 29;	//?????¨??§?¶?????????????????????§Integer.MAX_VALUE???????????¨??±??????
				}
			}
			for(int i = 0; i < n; i++){
				int a = in.nextInt();
				int b = in.nextInt();
				cost[a][b] = cost[b][a] = in.nextInt();
				time[a][b] = time[b][a] = in.nextInt();
			}

			warshallFloyd();

			int k = in.nextInt();
			for(int i = 0; i < k; i++){
				int start = in.nextInt();
				int end = in.nextInt();
				int r = in.nextInt();
				if(r == 0) System.out.println(cost[start][end]);
				else System.out.println(time[start][end]);
			}

		}
		in.close();
	}
	void warshallFloyd(){
		for(int k = 0; k <= m; k++){
			for(int i = 0; i <= m; i++){
				for(int j = 0; j <= m; j++){
					cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
					time[i][j] = Math.min(time[i][j], time[i][k] + time[k][j]);
				}
			}
		}
	}

}