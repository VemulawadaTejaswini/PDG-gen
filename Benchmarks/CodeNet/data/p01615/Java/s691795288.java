import java.util.*;
import java.awt.geom.*;

public class Main{
	double EPS = 1.0e-08;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int [][] pass = new int[n][n];
			int INF = 1 << 24;
			for(int i = 0; i < n; i++){
				Arrays.fill(pass[i], INF);
			}
			for(int i = 0; i < m; i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				int cost = sc.nextInt();
				pass[a][b] = -cost;
			}
			for(int j = 0; j < n; j++){
				for(int i = 0; i < n; i++){
					for(int k = 0; k < n; k++){
						pass[i][k] = Math.min(pass[i][k], pass[i][j] + pass[j][k]);
					}
				}
			}
			System.out.println(pass[0][n-1] * -1);
		}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}