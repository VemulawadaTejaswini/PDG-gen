import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		int S = Integer.parseInt(line);

		int a = 0;
		int b = 0;
		int c = 0;

		if (S / 3600 > 0) {
			a = S / 3600;
		}

		if (S / 60 > 0)
			b = (S - S / 3600 * 3600) / 60;

		if (S > 0) {
			c = S - a * 3600 - b * 60;
		}

		System.out.println(a + ":" + b + ":" + c);

	}

}

