import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, k;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();

		int[] a = new int[n];

		int number, index;
		for (int i = 0; i < k; i++) {
			number = sc.nextInt();
			for (int j = 0; j < number; j++) {
				index = sc.nextInt();
				a[index - 1]++;
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				count++;
			}
		}

		sc.close();
		System.out.println(count);
		return;
	}

}
