import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		long[] a_sum = new long[n+1];
		long[] b_sum = new long[m+1];
		a_sum[0] = a[0];
		b_sum[0] = b[0];
		for(int i = 1; i < n+1; i++) {
			a[i-1] = sc.nextInt();
			a_sum[i] = a[i-1] + a_sum[i-1];
		}
		for(int i = 1; i < m+1; i++) {
			b[i-1] = sc.nextInt();
			b_sum[i] = b[i-1] + b_sum[i-1];
			//System.out.println(b_sum[i]);
		}
		
		int j = m;
		int ans = 0;
		for(int i = 0; i < n+1 ; i++) {
			if(a_sum[i] > k) {
				break;
			}
			while(b_sum[j] > k - a_sum[i]) {
				j--;
			}
			//System.out.println(i +" "+j);
			ans = Math.max(ans, i+j);
		}
		System.out.println(ans);
	}
}