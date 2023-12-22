//package abc124.B;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] h = new int[n];
		for (int i = 0; i < n; i++) h[i] = sc.nextInt();
		
		int ans = 0, max = 0;
		
		for (int i = 0; i < n; i++) {
			if (h[i] >= max) ans++;
			max = Math.max(max, h[i]);
		}
		
		System.out.println(ans);
		
	}

}
