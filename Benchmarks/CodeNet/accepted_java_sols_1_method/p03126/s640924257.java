//package abc118_B;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] cnt = new int[m];
		
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int a = sc.nextInt();
				cnt[a - 1]++;
			}
		}
		
		int ans = 0;
		
		for (int i = 0; i < m; i++) {
			if (cnt[i] == n) ans++;
		}
		
		System.out.println(ans);
	}

}