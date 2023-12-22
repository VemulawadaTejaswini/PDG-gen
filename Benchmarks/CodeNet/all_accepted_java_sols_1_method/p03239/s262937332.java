
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());
		int ans = 1001;
		for (int i = 0; i < N; i++) {
			int c = Integer.parseInt(sc.next());
			int t = Integer.parseInt(sc.next());
			if (t <= T) {
				ans = Math.min(ans, c);
			}
		}
		System.out.println(ans == 1001 ? "TLE" : ans);
		sc.close();

	}
}
