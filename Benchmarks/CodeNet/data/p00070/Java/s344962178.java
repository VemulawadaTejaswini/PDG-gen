import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = bin.readLine()) != null) {
			String[] strs = str.split(" ");
			final int n = Integer.parseInt(strs[0]);
			final int s = Integer.parseInt(strs[1]);
			int count = 0;
			count = count(n, s, new boolean[10], 0);
			System.out.println(count);
		}
	}

	static int count(int n, int s, boolean[] cantUse, int count) {
		if (n == 1) {
			if (s < 10 && !cantUse[s]) {
				return count + 1;
			} else return count;
		}
		for (int i = cantUse.length - 1; i >= 0; i--) {
			int s2 = s - i * n;
			if (!cantUse[i] && s2 >= 0) {
				cantUse[i] = true;
				count = count(n - 1, s2, cantUse, count);
				cantUse[i] = false;
			}
		}
		return count;
	}
}