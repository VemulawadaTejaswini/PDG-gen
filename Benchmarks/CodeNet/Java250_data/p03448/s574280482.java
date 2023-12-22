import java.util.Scanner;

public class Main {

	final static int A500 = 500;
	final static int B100 = 100;
	final static int C50 = 50;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		int x = Integer.parseInt(sc.nextLine());

		int count = 0;

		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				for (int k = 0; k <= c; k++) {
					if (x == A500 * i + B100 * j + C50 * k) {
						count++;
					}
				}
			}

		}

		System.out.println(count);

	}

}