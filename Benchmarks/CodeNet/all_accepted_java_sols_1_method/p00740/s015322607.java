import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean hasMore = true;
		do {
			int read1 = sc.nextInt();
			int read2 = sc.nextInt();
			if (read1 != 0 && read2 != 0) {
				final int n = read1, p = read2;
				int[] phas = new int[n];
				int count = p, posi = 0;
				boolean hasWinner = false;
				do {
					int player = posi;
					if (count > 0) {
						phas[posi]++;
						count--;
					} else {
						count = phas[posi];
						phas[player] = 0;
					}
					if (phas[player] == p) {
						hasWinner = true;
						System.out.println(player);
					} else {
						posi = (++posi == n) ? 0 : posi;
					}
					// System.out.println(count + ":" + Arrays.toString(phas));
				} while (!hasWinner);

			} else {
				hasMore = false;
			}
		} while (hasMore);
	}
}