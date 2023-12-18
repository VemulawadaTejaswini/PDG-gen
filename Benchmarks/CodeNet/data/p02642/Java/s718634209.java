import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		boolean[] dp = new boolean[n];
		Arrays.fill(dp, false);

		for (int i = 0; i < a.length;i++) {
			while(!dp[i]) {
				for (int j = i + 1; j < a.length; j++) {
					if(a[i]==a[j]) {
						dp[i]=true;
						dp[j]=true;
					} else if(a[j]%a[i]==0) {
						dp[j]=true;
					}
				}
				break;
			}
		}
		int cnt=0;
		for (int j = 0; j < dp.length; j++) {
			if(dp[j] == false) cnt++;
		}
		System.out.println(cnt);
	}
}