import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		Main main = new Main();

		while ((line = br.readLine()) != null) {
			if (line.contains(" ")) {
				String[] sp = line.split(" ");
				double[] dp = new double[6];
				for (int i = 0; i < dp.length; i++) {
					dp[i] = Double.parseDouble(sp[i]);
				}
				Circle circle1 = main.new Circle(dp[0], dp[1], dp[2]);
				Circle circle2 = main.new Circle(dp[3], dp[4], dp[5]);
				System.out.println(circle1.getTopology(circle2));
			}
		}
	}

	public class Circle {

		public static final int TOPOLOGY_OUTER = 2;
		public static final int TOPOLOGY_INNER = -2;
		public static final int TOPOLOGY_CROSS = 1;
		public static final int TOPOLOGY_FARAWAY = 0;

		private double x;
		private double y;
		private double r;

		public Circle(double x, double y, double r) {
			this.x = x;
			this.y = y;
			this.r = r;
		}

		public double x() {
			return this.x;
		}

		public double y() {
			return this.y;
		}

		public double r() {
			return this.r;
		}

		public int getTopology(Circle other) {

			int retval = TOPOLOGY_FARAWAY;

			// 中心間の距離
			double distance;
			distance = Math.sqrt(Math.pow(x - other.x(), 2)
					+ Math.pow(y - other.y(), 2));
			// 位相
			if (distance + other.r() < r)
				return TOPOLOGY_OUTER;
			if (distance + r < other.r())
				return TOPOLOGY_INNER;
			if (distance <= r + other.r())
				return TOPOLOGY_CROSS;
			if (distance > r + other.r())
				return TOPOLOGY_FARAWAY;

			return retval;
		}
	}
}