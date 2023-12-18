import java.io.IOException;
import java.util.Scanner;

/**
 */
class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		while(in.hasNext()) {
			double v = in.nextDouble();

			int ans = getMinimumFloor(v);
			System.out.println(ans);
		}
	}

	public static int getMinimumFloor(double v) {
		// v = 9.8t
		// y = 4.9*t^2

		// N???????????? 5*N-5

		double t = v / 9.8;
		double y = 4.9*t*t;

		return (int)Math.floor( (y+5.0) / 5.0 + 1.0);
	}
}