package aoj0033;

import java.util.Scanner;

public class Main {
	void run() {
		// ??\???
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] ans = new int[n];
		int[] arr = new int[10];
		for( int i = 0; i < n; i++ ) {
			// ??±
			int box1 = 0, box2 = 0;
			for( int j = 0; j < 10; j++ ) {
				arr[j] = scan.nextInt();
				if( j == 0 ) box1 = arr[0];
			}
			// ??????
			for( int j = 1; j < 10; j++ ) {
				if( arr[j] > box1 ) box1 = arr[j];
				else if( arr[j] > box2 ) box2= arr[j];
				else {
					ans[i] = -1;
					break;
				}
				if( j == 9 ) ans[i] = 1;
			}
		}
		for( int i = 0; i < n; i++ ) {
			if( ans[i] == 1 ) System.out.println("YES");
			else System.out.println("NO");
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}