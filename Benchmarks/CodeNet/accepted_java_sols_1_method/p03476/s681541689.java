import java.util.*;

public class Main {
	private static final int MAX = 100000;

	public static void main(String[] args) {
		boolean[] notPrime = new boolean[MAX + 1];
		int[] like = new int[MAX + 1];

		notPrime[0] = true;
		notPrime[1] = true;
		for (int num = 2; num <= MAX; num++) {
			if (notPrime[num]) {
				like[num] = like[num - 1];
			}
			else {
				for (int i = (num * 2); i <= MAX; i += num) {
					notPrime[i] = true;
				}

				if (notPrime[(num + 1) / 2]) {
					like[num] = like[num - 1];
				}
				else {
					like[num] = like[num - 1] + 1;
				}
			}
		}

		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inQ = stdin.nextInt();

		for (int i = 0; i < inQ; i++) {
			int inL = stdin.nextInt();
			int inR = stdin.nextInt();

			System.out.println(like[inR] - like[inL - 1]);
		}
	}
}
