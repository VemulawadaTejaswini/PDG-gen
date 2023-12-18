import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		long ans = x;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			ans += d / a;
			if(d % a >= 1) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}