import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringTokenizer st;
		double x1, y1, x2, y2, x3, y3, xp, yp;
		double l1, l2, l3, l1p, l2p, l3p;

		while ((line = br.readLine()) != null) {
			st = new StringTokenizer(line);
			x1 = Double.parseDouble(st.nextToken());
			y1 = Double.parseDouble(st.nextToken());
			x2 = Double.parseDouble(st.nextToken());
			y2 = Double.parseDouble(st.nextToken());
			x3 = Double.parseDouble(st.nextToken());
			y3 = Double.parseDouble(st.nextToken());
			xp = Double.parseDouble(st.nextToken());
			yp = Double.parseDouble(st.nextToken());

			// 原点に移動
			x1 -= xp;
			y1 -= yp;
			x2 -= xp;
			y2 -= yp;
			x3 -= xp;
			y3 -= yp;
			xp = 0;
			yp = 0;

			if (x1 * x2 * x3 < 0 && y1 * y2 * y3 < 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}