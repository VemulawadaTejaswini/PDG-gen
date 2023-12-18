import java.util.Scanner;


public class Main {
	private	static	Scanner	stdin = null;

	static {
		stdin = new Scanner(System.in);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	nMax = stdin.nextInt();

		for (int n = 0; n < nMax; n++) {
			parseParallel();
		}
	}

	private static void parseParallel() {
		double[]	da   = { stdin.nextDouble(), stdin.nextDouble() };
		double[]	db   = { stdin.nextDouble(), stdin.nextDouble() };
		double[]	dc   = { stdin.nextDouble(), stdin.nextDouble() };
		double[]	dd   = { stdin.nextDouble(), stdin.nextDouble() };
		double[]	v1   = { db[0] - da[0], db[1] - da[1] };
		double[]	v2   = { dd[0] - dc[0], dd[1] - dc[1] };

		if (isParallel(v1, v2)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

	private static boolean isParallel(double[] v1, double[] v2) {
		div(v1);
		div(v2);
		
		return (v1[0] == v2[0]) & (v1[1] == v2[1]);
	}

	private static void div(double[] d1) {
		if (d1[0] != 0.0) {
			d1[1] /= d1[0];
			d1[0] /= d1[0];
		}
		else {
			if (d1[1] != 0.0) {
				d1[1] /= d1[1];
			}
		}
	}
}