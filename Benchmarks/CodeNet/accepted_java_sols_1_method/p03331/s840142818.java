import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 10000;
		for(int i = 1; i < n; i++) {
			int a = i, sumA = 0, b = n - i, sumB = 0;
			while(a > 0) {
				sumA += a % 10;
				a /= 10;
			}
			while(b > 0) {
				sumB += b % 10;
				b /= 10;
			}
			ans = Math.min(ans, sumA + sumB);
		}
		System.out.println(ans);
	}
}