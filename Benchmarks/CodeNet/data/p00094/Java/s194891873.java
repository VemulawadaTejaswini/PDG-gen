import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(" ");

		int[] x = new int[2];

		for (int i = 0; i < 2; i++) {
			x[i] = sc.nextInt();
		}

		double ans = (double) x[0] * (double) x[1] / 3.305785;

		System.out.println(String.format("%.4f",ans));
	}

}