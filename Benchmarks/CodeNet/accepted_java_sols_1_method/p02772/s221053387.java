
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		boolean ans = true;
		int n = sc.nextInt();
		int []a = new int [n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				if (a[i] % 3 == 0 || a[i] % 5 == 0) {

				} else {
					ans = false;
					break;
				}
			}
		}

		if (ans) {
			System.out.println("APPROVED");
		} else {
			System.out.println("DENIED");
		}

	}

}
