

import java.util.Scanner;

public class Main {

	//n = 5
	//1 2 3 4 5 6
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int x = scanner.nextInt();
		int[] a = new int[m + 1];
		
		for (int i = 1; i <= m; i++) {
			a[i] = scanner.nextInt();
		}
		
		int ans1 = 0;
		
		for (int i = x; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (i == a[j]) {
					ans1 += 1;
				}
			}
			
		}
		
		int ans2 = 0;
		for (int i = x; i >=  0; i--) {
			for (int j = 1; j <= m; j++) {
				if (i == a[j]) {
					ans2 += 1;
				}
			}
		}
		
		int ans3 = Math.min(ans1, ans2);
		System.out.println(ans3);
		scanner.close();

	}

}
