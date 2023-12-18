import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			
			if(n == 0 && m == 0) {
				break;
			}
		
		int[][] cost = new int[m+1][m+1];
		int[][] time = new int[m+1][m+1];
		
		for(int i = 0; i < m+1; i++) {
			for(int j = 0; j < m+1; j++) {
				cost[i][j] = 1000000000;
				time[i][j] = 1000000000;
				if(i == j) {
					cost[i][j] = 0;
					time[i][j] = 0;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int costA = stdIn.nextInt();
			int timeA = stdIn.nextInt();
			
			cost[a][b] = costA;
			cost[b][a] = costA;
			
			time[a][b] = timeA;
			time[b][a] = timeA;
		}
		
		for(int i = 0; i < m+1; i++) {
			for(int j = 0; j < m+1; j++) {
				for(int k = 0; k < m+1; k++) {
					int tmp1 = cost[i][j];
					int tmp2 = cost[j][k];
					int tmp3 = cost[j][i];
					int tmp4 = cost[k][j];
					
					if(cost[i][k] > tmp1 + tmp2) {
						cost[i][k] = tmp1+tmp2;
					}
					if(cost[k][i] > tmp3 + tmp4) {
						cost[k][i] = tmp3+tmp4;
					}
					
					tmp1 = time[i][j];
					tmp2 = time[j][k];
					tmp3 = time[j][i];
					tmp4 = time[k][j];
					
					if(time[i][k] > tmp1 + tmp2) {
						time[i][k] = tmp1+tmp2;
					}
					if(time[k][i] > tmp3+ tmp4) {
						time[k][i] = tmp3 + tmp4;
					}
				}
			}
		}
		
		int k = stdIn.nextInt();
		
		for(int i = 0; i < k; i++) {
			int p = stdIn.nextInt();
			int q = stdIn.nextInt();
			int r = stdIn.nextInt();
			
			if(r == 0) {
				System.out.println(cost[p][q]);
			}
			else {
				System.out.println(time[p][q]);
			}
			
		}
		
		}
		
	}
}