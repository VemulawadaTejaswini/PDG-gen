import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		double x1, y1, x2, y2, x3, y3, xp, yp, xg, yg;
		StringTokenizer st;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			st = new StringTokenizer(line);
			x1 = Double.parseDouble(st.nextToken());
			y1 = Double.parseDouble(st.nextToken());
			x2 = Double.parseDouble(st.nextToken());
			y2 = Double.parseDouble(st.nextToken());
			x3 = Double.parseDouble(st.nextToken());
			y3 = Double.parseDouble(st.nextToken());
			xp = Double.parseDouble(st.nextToken());
			yp = Double.parseDouble(st.nextToken());
			xg = (x1 + x2 + x3) / 3;
			yg = (y1 + y2 + y3) / 3;
			boolean b = true;
			b &= (linear(x1, y1, x2, y2, xp, yp)
					* linear(x1, y1, x2, y2, xg, yg) > 0);
			b &= (linear(x2, y2, x3, y3, xp, yp)
					* linear(x2, y2, x3, y3, xg, yg) > 0);
			b &= (linear(x3, y3, x2, y1, xp, yp)
					* linear(x3, y3, x1, y1, xg, yg) > 0);
			if (b)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	static double linear(double x1, double y1, double x2, double y2, double xp,
			double yp) {
		return (y2 - y1) * xp - (x2 - x1) + yp + y2 * (x2 - x1) - y1
				* (y2 - y1);
	}
}