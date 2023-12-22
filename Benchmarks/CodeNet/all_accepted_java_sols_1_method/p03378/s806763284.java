import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[m];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > x) {
				break;
			}
			cnt++;
		}
		System.out.println(Math.min(cnt, m - cnt));
	}
}
