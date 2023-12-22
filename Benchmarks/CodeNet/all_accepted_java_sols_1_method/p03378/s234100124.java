import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[m];
		int cnt = 0;
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			if (a[i] < x) {
				cnt++;
			}
		}

		System.out.println((cnt < a.length - cnt) ? cnt : a.length - cnt);

	}
}
