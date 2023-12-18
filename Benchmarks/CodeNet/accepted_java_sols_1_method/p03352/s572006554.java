
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int m = (int) Math.sqrt(n);
		int ans = 1;
		int max = 0;
		for (int i = 2; i <= m; i++) {
			for (int j = 2;; j++) {
				if (Math.pow(i, j) > n) break;
					max = (int) Math.pow(i, j);
			}
			ans = Math.max(ans, max);
		}
		
		System.out.println(ans);
	}
}