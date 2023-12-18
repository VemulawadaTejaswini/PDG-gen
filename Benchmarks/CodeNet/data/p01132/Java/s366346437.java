import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		boolean first = true;
		while (true) {
			int N = nextInt();
			if (N == 0) {
				break;
			}
			if (first) {
				first = false;
			} else {
				System.out.print("\n");
			}

			int[] coins = new int[4];
			int allCoins = 0;
			for (int i = 0; i < coins.length; i++) {
				coins[i] = nextInt();
				allCoins += coins[i];
			}

			int[] answer = new int[4];
			int min = Integer.MAX_VALUE;
			for (int i0 = 0; i0 <= coins[0]; i0++) {
				for (int i1 = 0; i1 <= coins[1]; i1++) {
					for (int i2 = 0; i2 <= coins[2]; i2++) {
						for (int i3 = 0; i3 <= coins[3]; i3++) {
							int change = i0 * 10 + i1 * 50 + i2 * 100 + i3
									* 500;
							if (change - N >= 0) {
								int rest = allCoins - i0 - i1 - i2 - i3;
								change -= N;
								int change500 = change / 500;
								change -= change500 * 500;
								rest += change500;
								int change100 = change / 100;
								change -= change100 * 100;
								rest += change100;
								int change50 = change / 50;
								change -= change50 * 50;
								rest += change50;
								int change10 = change / 10;
								rest += change10;
								if (rest < min) {
									min = rest;
									answer[0] = i0;
									answer[1] = i1;
									answer[2] = i2;
									answer[3] = i3;
								}
							}
						}
					}
				}
			}

			if (answer[0] > 0) {
				System.out.println("10 " + answer[0]);
			}
			if (answer[1] > 0) {
				System.out.println("50 " + answer[1]);
			}
			if (answer[2] > 0) {
				System.out.println("100 " + answer[2]);
			}
			if (answer[3] > 0) {
				System.out.println("500 " + answer[3]);
			}
		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}