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
		if(n>1 && a[0]==1 && a[1]!=1){
			System.out.println(1);
			return;
		}

		if(n>1 && a[0]==1 && a[1]==1){
			System.out.println(0);
			return;
		}

		if(a[0]==a[1]) dp[0]=true;

		for (int i = 0; i < a.length; i++) {
			while(!dp[i]) {
				for (int j = i+1; j < a.length; j++) {
					if (a[j]%a[i]==0) {
						dp[j]=true;
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