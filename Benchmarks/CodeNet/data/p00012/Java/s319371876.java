import java.util.Scanner;


public class Main {

	public static double calcTheta(double x1, double y1, double x2, double y2) {
		return Math.acos((x1*x2+y1*y2)/(Math.sqrt(x1*x1+y1*y1)*Math.sqrt(x2*x2+y2*y2)));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double a = sc.nextDouble(),
					b = sc.nextDouble(),
					c = sc.nextDouble(),
					d = sc.nextDouble(),
					e = sc.nextDouble(),
					f = sc.nextDouble(),
					g = sc.nextDouble(),
					h = sc.nextDouble();

			// (xp, yp)を原点へ平行移動
			double x1 = a-g, y1 = b-h,
					x2 = c-g, y2 = d-h,
					x3 = e-g, y3 = f-h;

			// ベクトルのなす角を求める
			double t1 = calcTheta(x1, y1, x2, y2),
					t2 = calcTheta(x2, y2, x3, y3),
					t3 = calcTheta(x3, y3, x1, y1);

			System.out.println(t1+" "+t2+" "+t3);

			if ((t1+t2+t3+0.001) > 2*Math.PI) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}
}