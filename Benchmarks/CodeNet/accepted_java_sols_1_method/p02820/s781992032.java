import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final int N = scn.nextInt();
			final int K = scn.nextInt();
			final int R = scn.nextInt();
			final int S = scn.nextInt();
			final int P = scn.nextInt();
			final char[] T = scn.next().toCharArray();

			int ret = 0;
			for (int i = 0; i < N; i++) {
				int next = i + K;
				if (next < N && T[i] == T[next]) {
					T[next] = ' ';
				}

				switch (T[i]) {
				case 'r':
					ret += P;
					break;
				case 's':
					ret += R;
					break;
				case 'p':
					ret += S;
					break;
				default:
					break;
				}
			}
			System.out.println(ret);
		}
	}
}
