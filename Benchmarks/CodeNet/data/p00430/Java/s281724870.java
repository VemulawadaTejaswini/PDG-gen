import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] v = new int[30];

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			rec(N, 0, N);
		}
	}

	static void rec(int rest, int pos, int prev) {
		if (rest == 0) {
			for (int i = 0; i < pos; ++i) {
				System.out.print(v[i]);
				if (i != pos - 1) System.out.print(' ');
			}
			System.out.println();
			return;
		}
		for (int i = Math.min(rest, prev); i > 0; --i) {
			v[pos] = i;
			rec(rest - i, pos + 1, i);
		}
	}

}