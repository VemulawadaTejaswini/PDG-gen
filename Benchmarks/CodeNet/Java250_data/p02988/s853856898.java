import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++)
			p[i] = sc.nextInt();
		int ans = 0;
		for (int i = 1; i < n - 1; i++) {
			int cnt = 0;
			if ( Math.max(p[i], p[i - 1]) == p[i])
				cnt++;
			if ( Math.max(p[i], p[i + 1]) == p[i])
				cnt++;
			if (cnt == 1)
				ans++;
		}
		out.println(ans);
		
	}
}