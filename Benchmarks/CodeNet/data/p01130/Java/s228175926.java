
import java.util.*;

public class Main{
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int g1 = sc.nextInt();
			int g2 = sc.nextInt();
			if((n|m|s|g1|g2) == 0) break;
			s--;g1--;g2--;
			int [][]pass = new int[n][n];
			int INF = 1 << 24;
			for(int i = 0; i < n; i++){
				Arrays.fill(pass[i], INF);
				pass[i][i] = 0;
			}
			for(int i = 0; i < m; i++){
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int cost = sc.nextInt();
				pass[a][b] = cost;
			}
			for(int j = 0; j < n; j++){
				for(int i = 0; i < n; i++){
					for(int k = 0; k < n; k++){
						pass[i][k] = Math.min(pass[i][k], pass[i][j] + pass[j][k]);
					}
				}
			}
			int min = INF;
			for(int i = 0; i < n;i++){
				int value = pass[s][i] + pass[i][g1] + pass[i][g2];
				min = Math.min(min, value);
			}
			System.out.println(min);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}