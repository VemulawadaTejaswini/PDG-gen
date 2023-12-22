import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	int toReach(int cur, int target) {
		int ans = 0;
		while(cur < target) {
			cur <<= 1;
			++ans;
		}
		return ans;
	}
	void solve(Scanner in, PrintWriter out) {
		int n = in.nextInt(), k = in.nextInt();
		double ans = 0;
		for(int i = 1; i <= n; ++i) {
			int times = toReach(i, k);
			double div = 1;
			for(int j = 0; j < times; ++j) div *= 1 / 2.0;
			ans += (1 / (double)n) * div;
		}
		out.printf("%.10f\n", ans);
	}

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			new Main().solve(in, out);
		}
	}
}
