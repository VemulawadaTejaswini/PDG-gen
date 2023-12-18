import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		int n1 = sc.nextInt();

		boolean flg = false;
		for (int i = 1; i <= n1; i++) {
			int nn = sc.nextInt();
			if (nn % 2 == 0) {
				if (!(nn % 3 == 0 || nn % 5 == 0)) {
					flg = true;
					break;
				}
			}
		}

		if (flg) {
			System.out.println("DENIED");
		} else {
			System.out.println("APPROVED");
		}
	}
}
