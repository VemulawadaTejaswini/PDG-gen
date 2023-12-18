import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] xy = new double[2][2];
		for (int i = 0; i < xy.length; i++) {
			for (int j = 0; j < xy[0].length; j++) {
				xy[i][j] = sc.nextDouble();
			}
		}
		double[] z = {Math.abs(xy[1][0] - xy[0][0]), Math.abs(xy[0][1] - xy[1][1])};
		double result = Math.sqrt(Math.pow(z[0], 2) + Math.pow(z[1], 2));
		System.out.printf("%.16f", result);
	}
}

