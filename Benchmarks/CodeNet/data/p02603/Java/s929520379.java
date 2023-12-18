import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int nowPrice = 1000;
		int nowStock = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		boolean sell = false;
		for (int i = 0; i < n - 1; i++) {
			if (sell) {
				nowPrice += nowStock * a[i];
				nowStock = 0;
			}

			if (a[i] < a[i + 1]) {
				nowStock += nowPrice / a[i];
				nowPrice -= nowStock * a[i];
				sell = true;
				continue;
			}
			sell = false;
		}

		if (sell) {
			nowPrice += nowStock * a[n - 1];
		}

		System.out.println(nowPrice);

		sc.close();
	}

}
