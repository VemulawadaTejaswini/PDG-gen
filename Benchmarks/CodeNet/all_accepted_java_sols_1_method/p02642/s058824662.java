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

		int[] dp = new int[a[n-1]+1];

		for (int i = 0; i < a.length; i++) {
			for (int j = a[i]; j < dp.length; j+=a[i]) {
				if(dp[a[i]]>1){
				 	dp[a[i]]++;
				 	break;
				}
				dp[j]++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(dp[a[i]]==1) cnt++;
		}
		System.out.println(cnt);
	}
}