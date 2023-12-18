import java.util.Scanner;

public class Debt_hell {

	public static void main(String[] args) {

		double debt = 100000;
		double interest = 1.05;
		double roundUp = 1000;

		Scanner input = new Scanner(System.in);
		int inputNo = input.nextInt();

		for (int i = 1; i <= inputNo; i++) {
			debt = Math.ceil((debt * interest) / roundUp) * roundUp;
		}

		System.out.println(String.format("%.0f", debt));
		input.close();
	}
}