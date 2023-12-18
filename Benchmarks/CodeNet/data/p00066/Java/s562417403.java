import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *  0066 Tic Tac Toe
 */
public class Main {

	public static void main(String[] args) throws IOException {
		List<TicTacToe> ticTacToeList = readTicTacToe();
		for (TicTacToe ticTacToe : ticTacToeList) {
			// System.out.println(ticTacToe);
			System.out.println(ticTacToe.judge());
		}
	}

	private static List<TicTacToe> readTicTacToe() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<TicTacToe> ticTacToeList = new ArrayList<>();
		String line = null;
		while((line = reader.readLine()) != null) {
			ticTacToeList.add(new TicTacToe(line));
		}
		return ticTacToeList;
	}

	// Tic Tac Toe
	private static class TicTacToe {

		// Field
		private char[][] field;

		// Constructor
		public TicTacToe(String input) {
			field = new char[3][3];
			for (int i = 0; i < field.length; i++) {
				for (int j = 0; j < field[i].length; j++) {
					field[i][j] = input.charAt(i * field[i].length + j);
				}
			}
		}

		// Judge
		private char judge() {

			// Horizontal
			for (int i = 0; i < field.length; i++) {
				if (field[i][0] != 's' && field[i][0] == field[i][1] && field[i][0] == field[i][2]) {
					return field[i][0];
				}
			}

			// Vertical
			for (int i = 0; i < field.length; i++) {
				if (field[0][i] != 's' && field[0][i] == field[1][i] && field[0][i] == field[2][i]) {
					return field[0][i];
				}
			}

			// Cross
			if (field[0][0] != 's' && field[0][0] == field[1][1] && field[0][0] == field[2][2]) {
				return field[0][0];
			}
			if (field[0][2] != 's' && field[0][2] == field[1][1] && field[0][2] == field[2][0]) {
				return field[0][2];
			}

			return 'd';
		}

		@Override
		public String toString() {
			StringBuilder buffer = new StringBuilder();
			for( int i = 0; i < field.length; i++) {
				for (int j = 0; j < field[i].length; j++) {
					buffer.append(field[i][j]);
				}
				buffer.append("\r\n");
			}
			return buffer.toString();
		}
	}
}