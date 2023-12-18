import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int ans = 0;
		outer:
		while (true) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 1) {
					break outer;
				}
				a[i] /= 2;
			}
			ans++;
		}
		System.out.println(ans);

		sc.close();
	}
}
