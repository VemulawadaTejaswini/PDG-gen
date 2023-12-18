import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] w = new int[n];
		int p = 0;

		for (int i = 0; i < n; i++) {
			w[i] = scan.nextInt();
			p += w[i];
		}

		while (true) {
			p--;
			int wIndex = 0;
			for (int i = 0; i < k; i++) {
				int sum = 0;
				int j;
				for (j = wIndex; j < n; j++) {
					if (sum + w[j] > p) {
						break;
					}
					sum += w[j];
				}
				wIndex = j;
			}
			
			if (wIndex < n) {
				break;
			}
		}

		System.out.println(p + 1);

		scan.close();
	}
}