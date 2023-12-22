import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int[][] x = new int[n][d];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < d; j++) {
				x[i][j] = scan.nextInt();
			}
		}
		int out = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				double distance = 0;
				for(int k = 0; k < d; k++) {
					distance += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
				}
				distance = Math.sqrt(distance);
				if(distance % 1 == 0) out++;
			}
		}
		System.out.println(out);
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
