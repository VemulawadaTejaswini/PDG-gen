import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		double n = scane.nextDouble();

		double[] nums = new double[1000];

		double totala = 0;

		double average = 0;

		double bunsan = 0;

		StringBuilder builder = new StringBuilder();

		while (n != 0) {

			for (int i = 0; i < n; i++) {
				nums[i] = scane.nextDouble();
				totala += nums[i];
			}

			average = totala / n;
			for (int i = 0; i < n; i++) {

				bunsan += Math.pow((nums[i] - average), 2);
			}

			builder.append(Math.sqrt(bunsan / n) + "\n");

			n = scane.nextDouble();

			totala = 0;
			bunsan = 0;

		}

		System.out.print(builder.toString());

	}

}