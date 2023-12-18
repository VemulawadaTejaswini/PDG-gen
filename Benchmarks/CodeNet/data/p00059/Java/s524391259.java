import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			StringTokenizer st = new StringTokenizer(line);
			double[] xs = new double[4];
			double[] ys = new double[4];
			double minX, maxX, minY, maxY;

			xs[0] = Double.parseDouble(st.nextToken());// xa1
			ys[0] = Double.parseDouble(st.nextToken());// ya1
			xs[1] = Double.parseDouble(st.nextToken());// xa2
			ys[1] = Double.parseDouble(st.nextToken());// ya2
			xs[2] = Double.parseDouble(st.nextToken());// xb1
			ys[2] = Double.parseDouble(st.nextToken());// yb1
			xs[3] = Double.parseDouble(st.nextToken());// xb2
			ys[3] = Double.parseDouble(st.nextToken());// yb2

			Arrays.sort(xs);
			Arrays.sort(ys);

			minX = xs[0];
			maxX = xs[3];
			minY = ys[0];
			maxY = ys[3];

			if (Math.abs(maxX - minX) <= Math.abs(xs[0] - xs[1]
					+ Math.abs(xs[2] - xs[3]))) {
				if (Math.abs(maxY - minY) <= Math.abs(ys[0] - ys[1])
						+ Math.abs(ys[2] - ys[3])) {
					System.out.println("YES");
					continue;
				}
			}
			System.out.println("NO");

		}
	}
}