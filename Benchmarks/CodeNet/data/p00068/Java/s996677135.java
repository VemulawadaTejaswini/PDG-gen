
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static int ccw(double x1, double y1, double x2, double y2, double x3, double y3) {
		x2 -= x1;x3 -= x1;y2 -= y1;y3 -= y1;
		double c = x2 * y3 - x3 * y2;
		if (c > 0)return +1;
		if (c < 0)return -1;
		if (x2 * x3 + y2 * y3 < 0)return +2;
		if (x3 * x3 + y3 * y3 - x2 * x2 - y2 * y2 > 0)return -2;
		return 0;
	}
	public static double[][] convexHull(double[][] ps) {
		int n = ps.length, k = 0;
		Arrays.sort(ps, new Comparator<double[]>() {
			public int compare(double[] a, double[] b) {
				double x = a[0] - b[0];
				double y = a[1] - b[1];
				if (x != 0)return x > 0 ? 1 : -1;
				if (y != 0)return y > 0 ? 1 : -1;
				return 0;
			}
		});
		double[][] ch = new double[2*n][];
		for (int i = 0; i < n; ch[k++] = ps[i++])
			while (k >= 2 && ccw(ch[k - 2][0], ch[k - 2][1], ch[k - 1][0], ch[k - 1][1], ps[i][0], ps[i][1]) <= 0)
				--k;
		for (int i = n - 2, t = k + 1; i >= 0; ch[k++] = ps[i--])
			while (k >= t && ccw(ch[k - 2][0], ch[k - 2][1], ch[k - 1][0], ch[k - 1][1], ps[i][0], ps[i][1]) <= 0)
				--k;
		return Arrays.copyOf(ch, k - 1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useDelimiter("[^0-9\\-\\.]+");
		while(true){
			int n = Integer.parseInt(sc.next());
			if(n==0)break;
			double[][] ps = new double[n][2];
			for(int i = 0;i<n;i++){
				ps[i][0] = Double.parseDouble(sc.next());
				ps[i][1] = Double.parseDouble(sc.next());
			}
			double[][] ch = convexHull(ps);
			System.out.println(n-ch.length);
		}
	}
}