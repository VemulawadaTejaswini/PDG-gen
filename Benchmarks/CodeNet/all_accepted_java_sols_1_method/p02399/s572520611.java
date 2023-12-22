import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] data = input.split(" ");
		int a = Integer.parseInt(data[0]);
		int b = Integer.parseInt(data[1]);

		if (a >= 1 && b <= 1 * Math.pow(10, 9)) {
			int d = (a / b);
			int r = a % b;
			double f = (float) r;
			double decimal = ((double) a / (double) b);

			System.out.printf("%d %d %.5f", d, r, decimal);
		}

	}
}

