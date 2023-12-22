import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void solve(int n, int x) {
		int ans = 0;
		for(int i=1;i<=n-2;i++) {
			for(int j=i+1;j<=n-1;j++) {
				for(int k=j+1;k<=n;k++) {
					if(i+j+k==x) ans++;
				}
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int n, x;
			n = in.nextInt();
			x = in.nextInt();
			if(n == 0) break;

			solve(n, x);
		}
	}
}