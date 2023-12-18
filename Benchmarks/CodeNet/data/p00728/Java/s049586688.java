import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] tensuu = new int[n];
			for (int i = 0; i < n; i++) {
				tensuu[i] = sc.nextInt();
			}

			int max = tensuu[0];
			int min = tensuu[0];
			int sum = 0;

			for (int j = 1; j < tensuu.length; j++) {
				if (max < tensuu[j]) {
					max = tensuu[j];
				}
				if (min > tensuu[j]) {
					min = tensuu[j];
				}
			}

			for (int t = 0; t < tensuu.length; t++) {
				sum += tensuu[t];
			}

			int ave = (sum - (max + min)) / (tensuu.length - 2);
			System.out.println(ave);
		}
	}

}