import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * 0066 Tic Tac Toe
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
		while ((line = reader.readLine()) != null) {
			ticTacToeList.add(new TicTacToe(line));
		}
		return ticTacToeList;
	}

	// Tic Tac Toe
	private static class TicTacToe {

		// Win pattern
		private static final List<Pattern> WIN_PATTERN = Arrays.asList(Pattern.compile(".*1.*4.*7.*"),
				Pattern.compile(".*2.*5.*8.*"), Pattern.compile(".*3.*6.*9.*"), Pattern.compile(".*1.*2.*3.*"),
				Pattern.compile(".*4.*5.*6.*"), Pattern.compile(".*7.*8.*9.*"), Pattern.compile(".*1.*5.*9.*"),
				Pattern.compile(".*3.*5.*7.*"));

		// position
		private Map<Character, String> positionMap = new HashMap<>();

		// Constructor
		public TicTacToe(String input) {
			// Init map
			positionMap.put('o',  "");
			positionMap.put('x',  "");

			// Set positions
			for (int i = 0; i < input.length(); i++) {
				char name = input.charAt(i);
				if (name == 'o' || name == 'x') {
					positionMap.put(name, positionMap.get(name) + (i + 1));
				}
			}

		}

		// Judge
		private char judge() {
			// If position matches win pattern, the player win
			for (Character key : positionMap.keySet()) {
				for (Pattern p : WIN_PATTERN) {
					if (p.matcher(positionMap.get(key)).matches()) {
						return key;
					}
				}
			}
			// If none win, this game is draw
			return 'd';
		}

		@Override
		public String toString() {
			final StringBuilder result = new StringBuilder();
			positionMap.forEach((k, v) -> result.append(k + ":" + v + ", "));
			return result.toString();
		}
	}
}