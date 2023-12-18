import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Problem B: Monster Factory
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("-")) {

			LinkedList<Character> rightword = new LinkedList<Character>();
			LinkedList<Character> downword = new LinkedList<Character>();
			Character center;
			ArrayList<Character> right = new ArrayList<Character>();
			LinkedList<Character> down = new LinkedList<Character>();

			//
			for (char c : line.toCharArray()) {
				downword.add(c);
			}
			for (char c : br.readLine().toCharArray()) {
				rightword.add(c);
			}
			for (char c : br.readLine().toCharArray()) {
				down.add(c);
			}
			//
			center = rightword.removeFirst();
			while (center != null) {
				if (!down.isEmpty()) {
					if (down.peekFirst().equals(center)) {
						down.removeFirst();
						if (!downword.isEmpty())
							center = downword.removeFirst();
						else
							center = null;
					} else {
						right.add(center);
						if (!rightword.isEmpty())
							center = rightword.removeFirst();
						else
							center = null;
					}
				} else {
					right.add(center);
					if (!rightword.isEmpty())
						center = rightword.removeFirst();
					else
						center = null;
				}
			}
			StringBuilder sb = new StringBuilder();
			for (char c : right) {
				sb.append(c);
			}
			System.out.println(sb.toString());
		}
	}
}