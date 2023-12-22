import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		int[] d = new int[n + 1];
		d[0] = 0;
		int cnt = 1;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			d[i + 1] = d[i] + a[i];
			if (d[i + 1] <= x) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
