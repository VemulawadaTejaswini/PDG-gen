import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			char[][] board = new char[3][];

			// read
			for (int i = 0; i < 3; ++i) {
				board[i] = line.substring(i * 3, i * 3 + 3).toCharArray();
			}

			// judge
			char winner = 'd';

			for (int i = 0; i < 3; i++) {
				if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
					winner = board[i][1];
				}
			}

			for (int i = 0; i < 3; i++) {
				if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
					winner = board[1][i];
				}
			}

			if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
				winner = board[1][1];
			}

			if (board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
				winner = board[1][1];
			}

			System.out.println(winner);

		}
	}
}