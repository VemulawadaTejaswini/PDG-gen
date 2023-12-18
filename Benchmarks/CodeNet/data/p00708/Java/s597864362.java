import java.io.*;
import java.util.*;

public class Main {

	int INF = 1 << 24;

	public class Point3D{
		double x,y,z;
		public Point3D(double x, double y, double z) {
			this.x = x;this.y = y;this.z = z;
		}

		private double distance(Point3D p) {
			double x = this.x - p.x;
			double y = this.y - p.y;
			double z = this.z - p.z;
			double dissq = x * x + y*y + z*z;
			return Math.sqrt(dissq);
		}
	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			double [] rlist = new double[n];
			Point3D [] plist = new Point3D[n];
			for(int i = 0; i < n; i++){
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				double z = sc.nextDouble();
				rlist[i] = sc.nextDouble();
				plist[i] = new Point3D(x,y,z);
			}

			double [][] pass = new double[n][n];
			for(int i = 0; i < n; i++){
				for(int j = i + 1; j < n; j++){
					double distance = plist[i].distance(plist[j]);
					double rDistance = rlist[i] + rlist[j];
					double value = Math.max(0.0, distance - rDistance);
					pass[i][j] = value;
					pass[j][i] = value;
				}
			}

			double res = mst(pass);
			System.out.printf("%.3f\n",res);
		}
	}

	private double mst(double[][] pass) {
		int n = pass.length;
		double [] mincost = new double[n];
		boolean [] isused = new boolean[n];
		Arrays.fill(mincost, INF);

		mincost[0] = 0.0;
		double res = 0.0;
		while(true){
			int v = -1;
			for(int i = 0; i < n; i++){
				if(! isused[i] &&( v == -1 || mincost[i] < mincost[v])){
					v = i;
				}
			}
			if(v == -1) break;
			isused[v] = true;
			res += mincost[v];
			for(int i = 0; i < n; i++){
				mincost[i] = Math.min(mincost[i], pass[v][i]);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}