import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder out = new StringBuilder();
		while (true) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			if (n == 0 && s == 0)
				break; 
			// ways[k][x] := (counts of ways to reach x by sum of k nums)
			int ways[][] = new int[11][101]; // sufficient
			for (int bit = 0; bit < (1 << 10); ++bit) {
				int cnt1 = 0; // counts of 1 of bit.
				int sum = 0;
				for (int j = 0; j < 10; ++j)
					if (((bit >> j) & 1) == 1) { // lowest bit of (bit >> j) is 1?
						sum += j;
						++cnt1;
					}
				ways[cnt1][sum] += 1;
			}
			out.append(ways[n][s] + "\n");
		}
		System.out.print(out);
	}
}
