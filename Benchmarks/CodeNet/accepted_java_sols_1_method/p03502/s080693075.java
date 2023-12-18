import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		int num1 = N / 100000000;
		int num2 = N % 100000000 / 10000000;
		int num3 = N % 10000000 / 1000000;
		int num4 = N % 1000000 / 100000;
		int num5 = N % 100000 / 10000;
		int num6 = N % 10000 / 1000;
		int num7 = N % 1000 / 100;
		int num8 = N % 100 / 10;
		int num9 = N % 10;

		int fx = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9;

		if (N % fx == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
