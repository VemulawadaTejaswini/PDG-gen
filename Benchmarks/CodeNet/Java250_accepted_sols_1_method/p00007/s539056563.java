import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n = sc.nextInt();
		double gp = 100000.0;

		for (int i = 0; i < (int) n; i++) {
			gp += gp * 0.05;
			gp = (Math.ceil(gp / 1000)) * 1000;
		}


		System.out.println((int) gp);

	}

}