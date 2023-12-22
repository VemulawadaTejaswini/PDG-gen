import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] h = new int[n];

		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		int count = 0;

		loop: for (int i = 0; i < n; i++) {
			for (int j = i ; j >= 0; j--) {
				if (h[i] < h[j]) {
					continue loop;
				}
			}
			count++;
		}

		System.out.println(count);
		sc.close();
	}
}