

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		int[] ans = new int[n + 1];

		for (int i = 1; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
			ans[a[i]]++;
		}

		for (int i = 1; i < n + 1; i++) {
			System.out.println(ans[i]);
		}
	}

}
