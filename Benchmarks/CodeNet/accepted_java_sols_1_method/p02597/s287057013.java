import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int ans = 0;
		int w = 0;
		int r = 0;
		char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (c[i] == 'W')
				w++;
			else 
				r++;

		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < r; i++) {
			sb.append("R");
		}
		for (int i = 0; i < w; i++) {
			sb.append("W");
		}
		String ss = sb.toString();
		for (int i = 0; i < N; i++) {
			if (ss.charAt(i) != s.charAt(i))
				ans++;
		}
		if (ans % 2 != 0)
			ans++;
		System.out.print(ans/2);
	} 
}