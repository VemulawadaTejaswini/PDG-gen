import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			final int n = in.nextInt(), s = in.nextInt();
			int count = count(n, s, new boolean[10], 0);
			System.out.println(count);
		}
	}

	static int count(int n, int s, boolean[] unUse,
	        int count) {
		if (s < 0 || n < 1) {
			return count;
		} else if (n == 1) {
			if (s < 10 && !unUse[s]) {
				return count + 1;
			}
			else return count;
		}
		for (int i = 0; i < unUse.length; i++) {
			int s2 = s - i * n;
			if (!unUse[i] && s2 > 0) {
				unUse[i] = true;
				count = count(n - 1, s2, unUse, count);
				unUse[i] = false;

			}
		}
		return count;
	}
}