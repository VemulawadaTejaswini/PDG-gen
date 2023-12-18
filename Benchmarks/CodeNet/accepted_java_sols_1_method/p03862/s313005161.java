import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		long[] candy = new long[100000];
		for(int i = 0; i < n; i++) {
			candy[i] = sc.nextLong();
		}
		long ans = 0L;
		for(int i = 1; i < n; i++) {
			if(candy[i-1]+candy[i] > x) {
				ans += candy[i-1]+candy[i] - x;
				if(candy[i-1]+candy[i] - x > candy[i]) {
					candy[i] = 0;
				} else {
					candy[i] = x - candy[i-1];
				}
			}
		}
		System.out.println(ans);
	}
}