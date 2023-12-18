import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int a[];

		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}
			a = new int[5];
			a[0] = n + m;
			for (int i = 1; i < 5; i++) {
				n = sc.nextInt();
				m = sc.nextInt();
				a[i] = n + m;
			}
			int maxIndex = 0;
			for (int i = 0; i < 5; i++) {
				if (a[maxIndex] < a[i]) {
					maxIndex = i;
				}
			}
			System.out.println((char)('A' + maxIndex) + " " + a[maxIndex]);
		}
	}
}