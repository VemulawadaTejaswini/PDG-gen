import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main{

	static class Circle {
		double r;
		double x;
		double y;

		public Circle(double r, double x, double y) {
			this.r = r;
			this.x = x;
			this.y = y;
		}

		public double getR() {
			return this.r;
		}

		public void set(double r) {
			this.r = r;
		}

		public double getX() {
			return this.x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return this.y;
		}

		public void setY(double y) {
			this.y = y;
		}

		@Override
		public String toString() {
			return this.x + ", " + this.y;
		}
	}

	static Circle[] circles = null;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			int N = s.nextInt();
			if(N == 0)
				break;
			circles = new Circle[N];
			for(int i=0 ; i<N ; i++) {
				//String[] tmp = s.nextLine().split(" ");
				circles[i] = new Circle(s.nextDouble(), s.nextDouble(), s.nextDouble());
			}

			Arrays.sort(circles, Comparator.comparing(Circle::getX));
			double res1 = solve(circles, 0, N-1);
			Arrays.sort(circles, Comparator.comparing(Circle::getY));
			double res2 = solve(circles, 0, N-1);
			System.out.println(Math.min(res1, res2));
		}
	}

	static double solve(Circle[] c, int start, int end) {

		if(start == end)
			return Integer.MAX_VALUE;
		if(start == (end-1))
			return Math.sqrt((c[start].x - c[end].x)*(c[start].x - c[end].x) + (c[start].y - c[end].y)*(c[start].y - c[end].y)) - c[start].r - c[end].r;
		int middle = (start + end) / 2;

		double result = Math.sqrt((c[middle].x - c[middle+1].x)*(c[middle].x - c[middle+1].x) + (c[middle].y - c[middle+1].y)*(c[middle].y - c[middle+1].y)) - c[middle].r - c[middle+1].r;
		double result1 = solve(c, start, middle);
		double result2 = solve(c, middle+1, end);

		return Math.min(Math.min(result, result1), result2);
	}

}