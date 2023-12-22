import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];

		int[] box = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = n / 2 + 1; i <= n; i++) {
			box[i] = a[i];
		}

		for (int i = n / 2; i > 0; i--) {
			int num = i;
			int count = 0;
			while (num <= n) {
				count += box[num];
				num += i;
			}
			if (count % 2 == a[i]) {
				box[i] = 0;
			} else {
				box[i] = 1;
			}
		}

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += box[i];
		}
		System.out.println(sum);

		for (int i = 1; i <= n; i++) {
			if (box[i] == 1) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
