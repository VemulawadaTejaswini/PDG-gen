import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		int set[] = new int[n];

		int wa = 0;
		int ac = 0;

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			int p = Integer.parseInt(str[0]) - 1;
			String s = str[1];

			if (s.equals("WA") && set[p] != -1) {
				set[p]++;
			} else if (set[p] != -1) {
				wa += set[p];
				ac++;
				set[p] = -1;
			}
		}
		System.out.println(ac + " " + wa);
	}
}