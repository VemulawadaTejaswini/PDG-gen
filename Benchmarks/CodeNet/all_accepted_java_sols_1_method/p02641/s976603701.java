import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		HashSet<Integer> p = new HashSet<Integer>();
		for (int i = 0; i < n; ++i) {
			p.add(sc.nextInt());
		}

		int minAbs = 200;
		int ans = 0;
		for (int possible = 0; possible <= 101; ++possible) {
			if (p.contains(possible)) {
				continue;
			}

			int abs = Math.abs(possible - x);
			if (abs < minAbs) {
				minAbs = abs;
				ans = possible;
			}
		}

		System.out.println(ans);
	}
}
