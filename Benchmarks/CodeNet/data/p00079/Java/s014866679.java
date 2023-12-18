import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		double x1, y1, s = 0;
		ArrayList<Double> xs, ys;
		xs = new ArrayList<Double>();
		ys = new ArrayList<Double>();

		while ((line = br.readLine()) != null) {
			double x = Double.parseDouble(line.substring(0, line.indexOf(',')));
			double y = Double
					.parseDouble(line.substring(line.indexOf(',') + 1));
			xs.add(Double.valueOf(x));
			ys.add(Double.valueOf(y));
		}

		// 原点に移動
		x1 = xs.get(0);
		y1 = ys.get(0);
		for (int i = 0; i < xs.size(); i++) {
			xs.set(i, xs.get(i) - x1);
			ys.set(i, ys.get(i) - y1);
		}
		// 面積計算
		for (int i = 1; i < xs.size() - 1; i++) {
			s += area(xs.get(i), ys.get(i), xs.get(i + 1), ys.get(i + 1));
		}
		System.out.println(s);
	}

	static double area(double... ds) {
		double x1, y1, x2, y2, l1, l2, l3, z;
		x1 = ds[0];
		y1 = ds[1];
		x2 = ds[2];
		y2 = ds[3];
		l1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		l2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
		l3 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		z = (l1 + l2 + l3) / 2;
		return Math.sqrt(z * (z - l1) * (z - l2) * (z - l3));
	}
}