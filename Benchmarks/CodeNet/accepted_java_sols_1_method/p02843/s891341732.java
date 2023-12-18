import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean judge = false;
		if (N >= 2100) {
			System.out.print(1);
		} else {
			for (int i = 1; i < 21; i++) {
				if (100 * i <= N && N <= 100 * i + 5 * i) {
					System.out.print(1);
					judge = true;
					break;
				}
			}
			if (!judge) {
				System.out.print(0);
			}
		}
	}
}
