import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double x[] = new double[4];
		double y[] = new double[4];
		double d1,d2;

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < 4; i++) {
				x[i] = scan.nextDouble();
				y[i] = scan.nextDouble();
			}
			if ((x[1] - x[0]) != 0) {
				 d1 = (y[1] - y[0]) / (x[1] - x[0]);
			}else{
				 d1 = 0;
			}
			if ((x[3] - x[2]) != 0) {
				 d2 = (y[3] - y[2]) / (x[3] - x[2]);
			}else{
				 d2 = 0;
			}
			System.out.println(d1 == d2 ? "YES" : "NO");

		}
	}
}