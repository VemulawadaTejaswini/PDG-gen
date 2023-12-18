import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] w = new int[n];
		int[] e = new int[n];
		if(s.charAt(0) == 'W') {
			w[0] = 1;
		} else {
			e[0] = 1;
		}
		for(int i = 1; i < n; i++) {
			if(s.charAt(i) == 'W') {
				w[i] = w[i - 1] + 1;
				e[i] = e[i - 1];
			} else {
				w[i] = w[i - 1];
				e[i] = e[i - 1] + 1;
			}
		}
		int ans = e[n - 1] - e[0];
		for(int i = 1; i < n; i++) {
			ans = Math.min(ans, w[i - 1] + e[n - 1] - e[i]);
		}
		ans = Math.min(ans, w[n - 2]);
		System.out.println(ans);
	}
}