import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		int[][] board = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		if (check(board)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

	private boolean check(int[][] board) {
		if (board.length != 3 || board[0].length != 3) {
			throw new IllegalArgumentException();
		}
		boolean check = false;
		for (int i = 0; i < 100; i++) {
			int a1 = i;

			int b1 = board[0][0] - a1;
			int b2 = board[0][1] - a1;
			int b3 = board[0][2] - a1;
			if (withoutRange(b1) || withoutRange(b2) || withoutRange(b3)) {
				continue;
			}
			int a2 = board[1][0] - b1;
			if (withoutRange(a2) || (board[1][1] - b2) != a2 || (board[1][2] - b3) != a2) {
				continue;
			}
			int a3 = board[2][0] - b1;
			if (withoutRange(a3) || (board[2][1] -b2) != a3 || (board[2][2] - b3) != a3) {
				continue;
			}
			
			check = true;
			break;
		}
		return check;
	}

	private boolean withoutRange(int x) {
		return (x < 0 && x > 100);
	}
}