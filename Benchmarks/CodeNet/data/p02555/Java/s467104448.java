import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int s = in.nextInt();
		long ans = doCal(s);
		System.out.println(ans);
	}

	static long[] stCal = new long[2001];

	private static long doCal(int s) {
		if (s < 3)
			return 0;
		if (s < 6)
			return 1;
		if (stCal[s] > 0)
			return stCal[s];
		long ans = 1;
		for (int i = 3; i < s; i++) {
			ans += doCal(s - i);
			ans %= 1000000007;
			// System.out.println(s-i+" "+ans);
		}
		// System.out.println(ans);
		stCal[s] = ans;
		return ans;
	}

}
