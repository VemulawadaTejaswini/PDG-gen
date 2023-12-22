import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[][] a = new long[n][n];
		boolean[][] disable = new boolean[n][n];
		long ans = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = in.nextLong();
				ans += a[i][j];
			}
		}
		ans /= 2;
		boolean fake = false;
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(i==k || j==k) continue;
					if(a[i][j]==a[i][k]+a[k][j]&&!disable[i][j]) {
						ans -= a[i][j];
						disable[i][j] = true;
					}
					if(a[i][j]>a[i][k]+a[k][j]) fake = true;
				}
			}
		}
		System.out.println(fake?-1:ans);
		in.close();
	}

}
