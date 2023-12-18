import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	int n;
	double[] x, y, z, r;
	double[][] dist;
	double ans;
	boolean[][] visited;
	
	final double INF = 10000;
	
	public void run() {
		while (true) {
			n = in.nextInt();
			if (n == 0) break;
			dist = new double[n][n];
			x = new double[n];
			y = new double[n];
			z = new double[n];
			r = new double[n];
			visited = new boolean[n][n];
			
			for (int i = 0; i < visited.length; i++) {
				Arrays.fill(visited[i], false);				
			}
			
			for (int i = 0; i < x.length; i++) {
				x[i] = in.nextDouble();
				y[i] = in.nextDouble();
				z[i] = in.nextDouble();
				r[i] = in.nextDouble();
			}
			
			for (int i = 0; i < dist.length; i++) {
				for (int j = 0; j < dist[i].length; j++) {
					dist[i][j] = getDistance(i, j);
				}
			}
			
			int cnt = 0;
			ans = 0;
			for (int i = 0; i < n * n; i++) {
				double min = INF;
				int x = 0, y = 0;
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < n; k++) {
						if (visited[j][k]) continue;
						if (min > dist[j][k]) {
							y = j; x = k;
							min = dist[j][k];
						}
					}
				}

				visited[x][y] = true; visited[y][x] = true;
				if (isCircuit(x, y, x)) {
					visited[x][y] = false; visited[y][x] = false;
					dist[y][x] = INF;
					continue;
				} else {
					ans += min; cnt++;
					if (cnt == n - 1) break;
				}
			}
			
			System.out.printf("%.3f\n", ans);
		}
	}
	
	boolean isCircuit(int x, int last, int start) {
		if (last == start) return true;
		
		if (visited[last][x]) {
			for (int i = 0; i < visited[last].length; i++) {
				if (visited[last][i] && i != x && isCircuit(last, i, start)) return true;
			}
		}
		
		return false;
	}
	
	double getDistance(int i, int j) {
		if (i == j) return INF;
		
		double x2 = (x[i] - x[j]) * (x[i] - x[j]);
		double y2 = (y[i] - y[j]) * (y[i] - y[j]);
		double z2 = (z[i] - z[j]) * (z[i] - z[j]);
		
		double distance = Math.sqrt(x2 + y2 + z2) - r[i] - r[j];
		
		return (distance > 0) ? distance : 0;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}