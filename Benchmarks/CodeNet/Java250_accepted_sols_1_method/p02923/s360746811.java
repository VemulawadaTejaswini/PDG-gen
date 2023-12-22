import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int n = sc.nextInt();
		int h[] = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		int cnt = 0; 
		for(int i = 1; i < n; i++) {
			if (h[i] <= h[i - 1]) {
				cnt++;
				ans = Math.max(ans, cnt);
			}
			else {
				cnt = 0;
			}
		}
		
		System.out.print(ans);
	}
}