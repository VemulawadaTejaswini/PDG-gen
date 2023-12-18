import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static boolean EQ(double x, double y) {
		return Math.abs(x - y) < 1.0e-9;
	}
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			double[] xs = new double[n], ys = new double[n];
			for(int i = 0; i < n; i++) {
				xs[i] = sc.nextInt();
				ys[i] = sc.nextInt();
			}
			if(n % 2 == 0) {
				int c = n/2;
				double x0 = (xs[0] + xs[c])/2;
				double y0 = (ys[0] + ys[c])/2;
				for(int i = 1; i < c; i++) {
					double x = (xs[i] + xs[c+i])/2;
					double y = (ys[i] + ys[c+i])/2;
					if(!EQ(x0, x) || !EQ(y0 , y)) {
						System.out.println("NA");
						return;
					}
				}
				System.out.printf("%.6f %.6f", x0, y0);
			}
			else {
				System.out.println("NA");
			}
		}
	}
}

