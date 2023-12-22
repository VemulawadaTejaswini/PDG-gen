import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int cnt[] = new int[n];
		long ans = 0;
		for(int i = 0; i < n; i++) {
			cnt[i] = sc.nextInt();
		}
		for(int i = 1; i < cnt.length; i++) {
			ans += Math.min(cnt[i] - cnt[i-1], t);
		}
		ans += t;
		System.out.println(ans);
		sc.close();
	}
}
