

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double v = sc.nextInt();
		double b = sc.nextInt();
		double w = sc.nextInt();
		double t = sc.nextInt();



		if(v <= w) {
			System.out.println("NO");
		}else {
			if(Math.abs(a - b) / Math.abs(v - w) <= t) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}


		sc.close();

	}

}
