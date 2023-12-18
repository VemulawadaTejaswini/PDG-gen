import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int inputNum = in.nextDouble();

		System.out.println(getNowShakkin(inputNum));
	}

	public static int getKiriage1000(double shakkin) {
		double result = shakkin;

		result = (int) (Math.ceil((double) result / 1000) * 1000);
		return result;
	}

	public static double getNowShakkin(int weekInterval) {
		double result = 100000;
		double rishi = 0.05;

		for (int i = 0; i < weekInterval; i++) {
			result = result + (result * rishi);
		}

		result = getKiriage1000(result);

		return result;
	}
}