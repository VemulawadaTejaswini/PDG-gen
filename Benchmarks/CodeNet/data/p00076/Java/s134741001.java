import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		double[] x = new double[1001];
		double[] y = new double[1001];
		double l = Math.sqrt(2);
		double ang = Math.PI / 4;
		x[0] = 0;
		for(int i = 1; i <= 1000; i++) {
			x[i] = l * Math.cos(ang);
			y[i] = l * Math.sin(ang);
			double a = l;
			double b = Math.sqrt(a * a + 1);
			double th = Math.acos((a * a + b * b - 1) / (2 * a * b));
			ang += th;
			l = b;
		}
//		for(int i = 0; i < 5; i++) {
//			System.out.printf("%f %f\n", x[i], y[i]);
//		}
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n == -1) break;
			System.out.println(x[n - 1]);
			System.out.println(y[n - 1]);
		}
		sc.close();
	}
}
