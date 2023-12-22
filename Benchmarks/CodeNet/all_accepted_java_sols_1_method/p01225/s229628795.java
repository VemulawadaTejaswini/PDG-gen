import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] deck = new int[9];
		for (int i = 0; i < t; i++) {
			int isOK = 1;
			for (int j = 0; j < 9; j++) {
				deck[j] = in.nextInt();
			}
			int colorSum = 0;
			for (int j = 0; j < 9; j++) {
				String color = in.next();
				deck[j] += ("R".equals(color)) ? 0x100
						: ("G".equals(color)) ? 0x10000 : 0x1000000;
				colorSum += deck[j];
			}
			colorSum /= 0x100;
			int xFF = 0xFF;
			for (int j = 0; j < 3; j++) {
				if ((colorSum & xFF) % 3 != 0) {
					isOK = 0;
					break;
				}
				xFF <<= 8;
			}
			if (isOK == 1) {
				Arrays.sort(deck);
				int j = 0;
				while (j < 9) {
					if (deck[j] + 2 < deck[j + 2]) {
						isOK = 0;
						break;
					}
					if ((deck[j] == deck[j + 1] && deck[j + 1] == deck[j + 2])
							|| (deck[j] + 1 == deck[j + 1] && deck[j] + 2 == deck[j + 2])) {
						j += 3;
					} else if (j <= 3 && deck[j] + 1 == deck[j + 2]
							&& deck[j] + 2 == deck[j + 4]
							&& deck[j + 1] + 1 == deck[j + 3]
							&& deck[j + 1] + 2 == deck[j + 5]) {
						j += 6;
					} else {
						isOK = 0;
						break;
					}
				}
			}
			System.out.println(isOK);
		}
	}
}