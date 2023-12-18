import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int j = 0; j < n; j++) {
			double[] x = new double[4];
			double[] y = new double[4];
			for(int i = 0; i < 4; i++) {
				x[i] = sc.nextDouble() * 10000;
				y[i] = sc.nextDouble() * 10000;
			}
			Vec AB = new Vec(x[1] - x[0], y[1] - y[0]);
			Vec CD = new Vec(x[3] - x[2], y[3] - y[2]);
			if(AB.x * CD.y - AB.y * CD.x == 0.0) {
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
		}
		sc.close();
		System.out.print(sb.toString());
	}
	static class Vec{
		double x, y;
		Vec(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
}
