import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		int cnt=0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		boolean[] dp = new boolean[n];
		Arrays.fill(dp, false);

		for (int i = 0; i < a.length;i++) {
			while(!dp[i]) {
				for (int j = 0; j < i; j++) {
					if(a[i]==a[j]){
						dp[i]=true;
						dp[j]=true;
					} if (a[i]%a[j]==0) {
						dp[i]=true;
					}
				}
				break;
			}
		}
		for (int i = 0; i < dp.length; i++) {
			if(!dp[i])cnt++;
		}
		System.out.println(cnt);
	}
}