import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {a[i] = sc.nextInt();}
		boolean res = false;

		int ansCount = n-k;
		long ans[] = new long[ansCount+1];

		//1つ目を計算
		ans[0] = a[0];
		for(int i=1; i<k; i++) {
			ans[0] *= a[i];
		}
		for(int i=1; i<=n-k; i++) {
			ans[i] = ans[i-1] / a[i-1] * a[i-1+k];
		}


/*
		for(int i=0; i<n; i++) {
			if(i<=n-k) {
				ans[i] = a[i];
			}
			for(int back = 1; back < k; back++) {
				if((0 <= i-back) && (i-back <= n-k)) {
					ans[i-back] *= a[i];			}
				}
		}
*/
		//n-k>=1
		for(int i=1; i<ansCount+1; i++) {
			if(ans[i] > ans[i-1]) {
				System.out.printf("Yes\n");
			} else {
				System.out.printf("No\n");
			}
		}
	}
}
