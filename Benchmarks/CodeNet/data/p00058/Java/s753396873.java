import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while( sc.hasNext()) {
			judge_Orthogonal();
		}

	}

	private static void judge_Orthogonal() {
		double[] p = new double[8];

		for (int i = 0; i < 8; i++) {
			p[i] = sc.nextDouble();
		}

		double x_1 = p[2] - p [0];
		double x_2 = p[6] - p [4];

		double y_1 = p[3] - p [1];
		double y_2 = p[7] - p [5];

		if (x_1 * x_2 + y_1 * y_2 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
