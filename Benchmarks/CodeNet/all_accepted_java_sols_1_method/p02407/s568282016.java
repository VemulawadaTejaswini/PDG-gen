import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int a[] = new int [n];
		for (int i = 0; i < n; i++ ) {
			a[i] = scanner.nextInt();
		}
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(a[i]);
			if (i == 0) {
				break;
			}
			System.out.print(" ");
		}
		System.out.println();
	}
}

