import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static int d = 998244353;
	public static int cnt = 0;
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int d = 998244353;
		List<Integer> s = new ArrayList<Integer>();
		// dp[個数]
		int[] dp = new int[n*2];
		dp[1] = 1;
		for (int i = 0; i < k; i++) {
			sc.nextLine();
			int l = sc.nextInt();
			int r = sc.nextInt();
			for (int j = l; j <= r; j++) {
				s.add(j);
			}
		}
		Collections.sort(s);
		for (int i = 1; i <= n; i++) {
			if (dp[i] == 0) {
				continue;
			}
			for (int j = 0; j < s.size(); j++) {
				int tmp = s.get(j);
				dp[i+tmp] = (dp[i+tmp] + dp[i]) % d;
			}
		}
		System.out.println(dp[n]);
	}
}
