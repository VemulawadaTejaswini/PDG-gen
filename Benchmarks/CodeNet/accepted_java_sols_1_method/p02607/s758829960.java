import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if ((i + 1) % 2 == 1 && a[i] % 2 == 1) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}