import java.util.Scanner;

public class Main {
	private static final int origin = 100000;
	private static final double interest = 1.05;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = sc.nextInt();
		double ans = origin;

		for(int count = 0; count < num; count++) {
			ans = ans * interest / 1000;
			ans = Math.ceil(ans) * 1000;
		}

		System.out.println((int)ans);
	}

}