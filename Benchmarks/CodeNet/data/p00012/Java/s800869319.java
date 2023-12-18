import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		double x1, y1, x2, y2, x3, y3, xp, yp;
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

			// 点Pを原点に移動
			x1 -= xp;
			x2 -= xp;
			x3 -= xp;
			y1 -= yp;
			y2 -= yp;
			y3 -= yp;
			xp = yp = 0;

			// ベクトルの内積
			if (x1 * x2 + y1 * y2 > 0 && x1 * x3 + y1 * y3 > 0
					&& x2 * x3 + y2 * y3 > 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}