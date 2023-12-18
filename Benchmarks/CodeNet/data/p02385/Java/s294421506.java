import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void rollN(int[] dice) {
		int oki;
		oki = dice[0];
		dice[0] = dice[1];
		dice[1] = dice[5];
		dice[5] = dice[4];
		dice[4] = oki;
	}

	public static void rollE(int[] dice) {
		int oki;
		oki = dice[0];
		dice[0] = dice[3];
		dice[3] = dice[5];
		dice[5] = dice[2];
		dice[2] = oki;
	}

	public static void turn(int[] dice) {
		int oki;
		oki = dice[1];
		dice[1] = dice[3];
		dice[3] = dice[4];
		dice[4] = dice[2];
		dice[2] = oki;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] dice1 = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
				scanner.nextInt() };
		int[] dice2 = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
				scanner.nextInt() };
		boolean flag = false;
		if (Arrays.equals(dice1, dice2)) {
			flag = true;
		} else {
			for (int i = 0; i < 4; i++) {
				rollN(dice1);
				if (Arrays.equals(dice1, dice2)) {
					flag = true;
					break;
				} else {
					for (int j = 0; j < 4; j++) {
						turn(dice1);
						if (Arrays.equals(dice1, dice2)) {
							flag = true;
							break;
						}
					}
					if (flag) {
						break;
					}
				}
				rollE(dice1);
				if (Arrays.equals(dice1, dice2)) {
					flag = true;
					break;
				} else {
					for (int j = 0; j < 4; j++) {
						turn(dice1);
						if (Arrays.equals(dice1, dice2)) {
							flag = true;
							break;
						}
					}
					if (flag) {
						break;
					}		}
			}
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
