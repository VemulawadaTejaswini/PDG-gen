import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		int[] t = new int[n];
		for(int i = 0 ; i < n ; i++) {
			s[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}
		long a = 1, b = 1;
		for(int i = 0 ; i < n ; i++) {
			long x = Math.max(a / s[i], b / t[i]);
			for(long j = x ;; j++) {
				if(a <= s[i] * j && b <= t[i] * j) {
					a = s[i] * j;
					b = t[i] * j;
					break;
				}
			}
		}
		System.out.println(a + b);
	}
}
