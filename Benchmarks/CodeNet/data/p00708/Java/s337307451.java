import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	double[] x = new double[100];
	double[] y = new double[100];
	double[] z = new double[100];
	double[] r = new double[100];
	double EPS = 1e-9;
	
	
	double dis(int i, int j) {
		return sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j])+(z[i]-z[j])*(z[i]-z[j]));
	}
	
	boolean connected(int i, int j) {
		return dis(i, j)-r[i]-r[j] < EPS;
	}
	
	void run() {
		double[][] cost = new double[100][100];
		double INF = Double.MAX_VALUE/2;
		double[] mincost = new double[100];
		boolean[] used = new boolean[100];
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			for (int i = 0; i < n; i++) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
				z[i] = sc.nextDouble();
				r[i] = sc.nextDouble();
				Arrays.fill(cost[i], INF);
				mincost[i] = INF;
				used[i] = false;
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = i+1; j < n; j++) {
					if (connected(i, j)) {
						cost[i][j] = cost[j][i] = 0.0;
					} else {
						cost[i][j] = cost[j][i] = dis(i, j) - r[i] - r[j];
					}
				}
			}
			
			mincost[0] = 0.0;
			double res = 0.0;
			while (true) {
				int v = -1;
				for (int u = 0; u < n; u++) {
					if (!used[u] && (v == -1 ||mincost[u] < mincost[v]))
						v = u;
				}
				
				if (v == -1) break;
				used[v] = true;
				res += mincost[v];
				
				for (int u = 0; u < n; u++) {
					mincost[u] = min(mincost[u], cost[v][u]);
				}
			}
			
			out.printf("%.3f\n", res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}