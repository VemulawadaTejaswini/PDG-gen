import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}

		int q = sc.nextInt();
		int count = 0;

		for (int i = 0; i < q; i++) {
			int t = sc.nextInt();
			for (int j = 0; j < n; j++) {
				if (s[j] == t) {
					count++;
					break;
				}
			}
		}

		System.out.println(count);

		sc.close();
	}
}