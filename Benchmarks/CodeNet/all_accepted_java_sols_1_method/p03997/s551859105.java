import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		Integer a = scan.nextInt();
		Integer b = scan.nextInt();
		Integer h = scan.nextInt();

		int total = 0;

		if ((h & 1) == 0) {
			if (a >= 1 && b >= 1 && h >= 1 && a <= 100 && b <= 100 && h <= 100) {
				total = (a + b) * h / 2;
			}
			if (total > 0) {
				System.out.println(total);
			}
		} else {
			System.err.println("");
		}
	}

}