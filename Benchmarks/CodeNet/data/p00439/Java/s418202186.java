import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if(n==0) {
				break;
			}
			int[] sum = new int[n+1];
			for(int i=1;i<=n;i++) {
				sum[i] = sum[i-1] + sc.nextInt();
			}
			int ans = 0;
			for(int i=1;i<=n-k+1;i++) {
				ans = max(ans,sum[i+k-1]-sum[i-1]);
			}
			System.out.println(ans);
		}
		sc.close();
	}
	static private int max(int a, int b) {
		return a > b ? a : b;
	}
}