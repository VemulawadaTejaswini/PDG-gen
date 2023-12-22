

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int k = scanner.nextInt();
		int ans = 0;
		int max = 0;
		
		ans = cal(a, b, c, k);
		System.out.println(ans);
		
		
		scanner.close();

	}
	
	public static int cal(int a, int b, int c, int n) {
		int max = 0;
		if (n == 0) {
			return a + b + c;
		}
		max = Math.max(max, cal(a*2, b, c, n-1));
		max = Math.max(max, cal(a, b*2, c, n - 1));
		max = Math.max(max, cal(a, b, c*2, n - 1));
		return max;
	}

}
