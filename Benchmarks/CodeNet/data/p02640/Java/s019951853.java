import java.util.*;
public class Main {
	static void solve() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0;
		sc.close();
		if(x==1) {
			if(y==2||y==4) {
				ans++;
			}
		}else {
			for(int i = 0;i<x+1;i++) {
				if(y==2*i+4*i||y==2*i||y==4*i) {
					ans++;
				}
			}
		}
		if(ans>=1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static void main(String args[]) {
		solve();
	}
}
