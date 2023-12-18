import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int L = sc.nextInt();
			int[] pos = new int[N];
			int[] dir = new int[N];
			boolean[] exit = new boolean[N];
			for (int i = 0; i < N; ++i) {
				dir[i] = sc.next().charAt(0) == 'R' ? 1 : -1;
				pos[i] = sc.nextInt() * 2;
			}
			int c = 0;
			int exitL = -1;
			int exitR = -1;
			int time = 0;
			for (; c < N; ++time) {
				exitL = -1;
				exitR = -1;
				for (int j = 0; j < N; ++j) {
					if (exit[j]) continue;
					pos[j] += dir[j];
					if (pos[j] == 0) {
						exitL = j;
						++c;
					}
					if (pos[j] == L * 2) {
						exitR = j;
						++c;
					}
				}
				for (int j = 0; j < N; ++j) {
					if (!exit[j] && pos[j] % 2 == 0) {
						for (int k = 0; k < j; ++k) {
							if (pos[k] == pos[j]) {
								dir[k] *= -1;
								dir[j] *= -1;
							}
						}
					}
				}
			}
			System.out.println(time / 2 + " " + ((exitL != -1 ? exitL : exitR) + 1));
		}
	}
}