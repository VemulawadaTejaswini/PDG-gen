import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 1, 1, 0, 0, -1, -1, -1 };
	static int[] DC = { -1, 0, 1, -1, 1, -1, 0, 1 };

	public static void main(String[] args) throws Exception {
		char[][] b = new char[8][8];
		for (int i = 0; i < 8; ++i) {
			b[i] = sc.next().toCharArray();
		}
		char[] hand = { 'o', 'x' };
		for (int t = 0; t < 64; ++t) {
			int pr = -1;
			int pc = -1;
			int best = -1;
			for (int i = 0; i < 8; ++i) {
				for (int j = 0; j < 8; ++j) {
					int c = count(b, i, j, hand[t % 2]);
					if (c > 0 && (c > best || (t % 2 != 0 && c == best))) {
						best = c;
						pr = i;
						pc = j;
					}
				}
			}
			//			System.out.println(pr + " " + pc + " " + best);
			if (best != -1) put(b, pr, pc, hand[t % 2]);
		}
		for (int i = 0; i < 8; ++i) {
			System.out.println(String.valueOf(b[i]));
		}
	}

	static int count(char[][] board, int r, int c, char hand) {
		if (board[r][c] != '.') return 0;
		int count = 0;
		for (int i = 0; i < 8; ++i) {
			int pr = r + DR[i];
			int pc = c + DC[i];
			int revert = 0;
			while (0 <= pr && pr < 8 && 0 <= pc && pc < 8) {
				if (board[pr][pc] == hand) {
					count += revert;
					break;
				}
				if (board[pr][pc] == '.') {
					break;
				}
				pr += DR[i];
				pc += DC[i];
				++revert;
			}
		}
		return count;
	}

	static void put(char[][] board, int r, int c, char hand) {
		board[r][c] = hand;
		for (int i = 0; i < 8; ++i) {
			int pr = r + DR[i];
			int pc = c + DC[i];
			while (0 <= pr && pr < 8 && 0 <= pc && pc < 8) {
				if (board[pr][pc] == hand) {
					pr -= DR[i];
					pc -= DC[i];
					while (pr != r || pc != c) {
						board[pr][pc] = hand;
						pr -= DR[i];
						pc -= DC[i];
					}
					break;
				}
				if (board[pr][pc] == '.') {
					break;
				}
				pr += DR[i];
				pc += DC[i];
			}
		}
	}
}