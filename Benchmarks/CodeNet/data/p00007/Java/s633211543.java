import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int inputNum = in.nextInt();
		System.out.println(getNowShakkin(inputNum));
	}

	public static int getNowShakkin(int weekInterval) {
		double result = 100;

		for (int i = 0; i < weekInterval; i++) {
			result = result*1.05;
			result = (Math.ceil((double) result));
		}

		return (int)result * 1000;
	}
}