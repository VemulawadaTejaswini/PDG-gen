import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 0 ; i < N ; i++) {
			double x1 = sc.nextDouble(),
					y1 = sc.nextDouble(),
					x2 = sc.nextDouble(),
					y2 = sc.nextDouble(),
					x3 = sc.nextDouble(),
					y3 = sc.nextDouble();

			double a1 = 2*(x2-x1), b1 = 2*(y2-y1),
					c1 = x1*x1-x2*x2+y1*y1-y2*y2,
					a2 = 2*(x3-x1), b2 = 2*(y3-y1),
					c2 = x1*x1-x3*x3+y1*y1-y3*y3;

			double px = (b1*c2-b2*c1)/(a1*b2-a2*b1),
					py = (c1*a2-c2*a1)/(a1*b2-a2*b1),
					r = Math.sqrt((px-x1)*(px-x1)+(py-y1)*(py-y1));

			System.out.println(String.format("%.3f %.3f %.3f", px, py, r));
		}

	}
}