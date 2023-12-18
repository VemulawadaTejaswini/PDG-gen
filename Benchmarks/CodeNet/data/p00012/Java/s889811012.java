import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		String str;
		while ((str = sc.nextLine()) != null) {
			String[] ps = str.split(" ");
			
			double[] points = new double[8];
			for (int i = 0; i < points.length; i++) {
				points[i] = Double.parseDouble(ps[i]);
			}
			
			double a, b, c, d, e, f;
			a = points[3] - points[1];
			b = points[2] - points[0];
			c = points[5] - points[3];
			d = points[4] - points[2];
			e = points[1] - points[5];
			f = points[0] - points[4];
			
			double g, h, i;
			g = -(a * points[0]) + b * points[1];
			h = -(c * points[2]) + d * points[3];
			i = -(e * points[4]) + f * points[5];
			
			double j, k, l, m, n, o;
			j = -(a * points[4]) + b * points[5];
			k = -(c * points[0]) + d * points[1];
			l = -(e * points[2]) + f * points[3];
			m = -(a * points[6]) + b * points[7];
			n = -(c * points[6]) + d * points[7];
			o = -(e * points[6]) + f * points[7];
			
			if ((((j > g) && (m > g)) || ((j < g) && (m < g)))
					&& (((k > h) && (n > h)) || ((k < h) && (n < h)))
					&& (((l > i) && (o > i)) || ((l < i) && (o < i)))) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}