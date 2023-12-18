
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		
		int cnt = 0;
		int y = 0;
		int ans = 0;
		solve: while(true) {
			if(cnt % 2 == 0) {
				y = x - cnt/2;
			}else {
				y = x + cnt/2;
			}
			if(n == 0) {
				ans = x;
				break;
			}
			for(int i = 0; i < n; i++) {
				if(y == p[i]) {
					break;
				}else if(i == n -1) {
					ans = y;
					break solve;
				}
			}
		cnt++;
		}
		System.out.println(ans);
	}
}