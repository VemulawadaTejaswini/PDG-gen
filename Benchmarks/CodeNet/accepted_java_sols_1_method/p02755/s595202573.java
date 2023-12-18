import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		for (int p = 1; p <= 1000; ++p) {
			int tax8 = p * 8 / 100;
			if (tax8 != a) {
				continue;
			}

			int tax10 = p * 10 / 100;
			if (tax10 != b) {
				continue;
			}

			System.out.println(p);
			return;
		}

		System.out.println(-1);
	}

}
