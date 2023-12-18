
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < h.length; i++) {
			h[i] = sc.nextInt();
		}
		
		int ans = 0;
		int cnt = 0;
		for (int i = 0; i < h.length; i++) {
			if (i + 1 == n) {
				ans = Math.max(ans, cnt);
				break;
			}
			if (h[i] >= h[i + 1]) {
				cnt++;
				continue;
			}
			
			ans = Math.max(ans, cnt);
			cnt = 0;
		}
		
		System.out.println(ans);
		
	}
}