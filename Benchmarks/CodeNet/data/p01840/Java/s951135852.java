import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int T = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			int k = 0;
			int ans = 0;
			int t = 0;
			for(int i=0;i<n;i++) {
				if(i==0) {
					ans = a[i]-m;
					t = a[i]+m;
					continue;
				}
				if(a[i]-a[i-1] <= 2*m) {
					t = a[i]+m;
					continue;
				}
				else {
					ans += a[i]-m-t;
					t = a[i]+m;
				}
				if(i==n-1) {
					ans += T-t;
				}
			}
			System.out.println(ans);
		}
	}
}
