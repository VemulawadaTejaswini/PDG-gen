

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double  T = sc.nextInt();
		double  X = sc.nextInt();

			double ans = T / X;

			System.out.println(String.format("%.6f",ans));
	}
}