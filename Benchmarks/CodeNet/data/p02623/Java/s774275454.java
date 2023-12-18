import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n+1];
		a[0] = 0;
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextLong()+a[i-1];
		}
		long[] b = new long[m+1];
		b[0] = 0;
		for(int i = 1; i <= m; i++) {
			b[i] = sc.nextLong()+b[i-1];
		}
		int j = m;
		int max = 0;
		for(int i = 0; i <= n; i++) {
			if(a[i] > k) {
				break;
			}
			while(j >= 0 && k-a[i] < b[j]) {
			j--;
			}
			max = Math.max(i+j, max);
		}
		System.out.println(max);
	}
}
