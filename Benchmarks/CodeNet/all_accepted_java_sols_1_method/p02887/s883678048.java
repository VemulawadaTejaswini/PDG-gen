import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		String now = S.substring(0, 1);
		int ans = 1;
		for(int i = 1; i < N; i++) {
			if(!now.equals(S.substring(i, i + 1))) {
				ans++;
			}
			now = S.substring(i, i + 1);
		}
		System.out.println(ans);
	}
}
