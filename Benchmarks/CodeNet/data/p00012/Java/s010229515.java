import java.util.*;
import java.io.*;
class Main {

	public static double getArea (double x1, double y1, double x2,
			double y2, double x3, double y3) {
		return 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1));

	}

	public static boolean solve (double x1, double y1, double x2,
			double y2, double x3, double y3, double xp, double yp) {

		double area1 = getArea(x1,y1,x2,y2,x3,y3);
		double area2 = getArea(x1,y1,x2,y2,xp,yp);
		double area3 = getArea(x1,y1,x3,y3,xp,yp);
		double area4 = getArea(x3,y3,x2,y2,xp,yp);

		return Math.abs(area1 - (area2 + area3 + area4)) < 0.0001;

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String s = br.readLine();
			if (s == null) break;

			StringTokenizer st = new StringTokenizer(s, " ");

			double x1 = Double.parseDouble(st.nextToken());
			double y1 = Double.parseDouble(st.nextToken());
			double x2 = Double.parseDouble(st.nextToken());
			double y2 = Double.parseDouble(st.nextToken());
			double x3 = Double.parseDouble(st.nextToken());
			double y3 = Double.parseDouble(st.nextToken());
			double xp = Double.parseDouble(st.nextToken());
			double yp = Double.parseDouble(st.nextToken());

			System.out.println(solve(x1,y1,x2,y2,x3,y3,xp,yp) ? "YES" : "NO");

		}

	}

}