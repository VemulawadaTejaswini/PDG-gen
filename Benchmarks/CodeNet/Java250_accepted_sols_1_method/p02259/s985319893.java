import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		boolean flag = true;
		int cnt = 0;
		while (flag) {
			flag = false;
			for (int j = n - 1; j >= 1; j--) {
				if (a[j] < a[j - 1]) {
					int tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
					cnt++;
					flag = true;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i : a) {
			sb.append(i);
			sb.append(" ");
		}

		System.out.println(sb.toString().trim());
		System.out.println(cnt);
	}
}