import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] p = new int[n];
		int[] sei = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
			sei[i] = p[i];
		}

		Arrays.sort(sei);

		for (int i = 0; i < n; i++) {
			if (p[i] != sei[i]) {
				count++;
			}
		}

		if (count <= 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();

	}
}