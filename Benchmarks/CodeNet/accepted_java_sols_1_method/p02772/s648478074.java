import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean rejectFlg = true;

		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();

			if (num % 2 == 1) {
				continue;
			}else {
				if (num % 3 == 0 || num % 5 == 0) {
					continue;
				}else {
					rejectFlg = false;
					break;
				}
			}
		}

		if (rejectFlg) {
			System.out.println("APPROVED");
		} else {
			System.out.println("DENIED");
		}
	}
}