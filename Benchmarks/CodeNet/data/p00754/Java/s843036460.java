import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
	
	public static boolean solve(String line) {
		Stack<Character> parens = new Stack<Character>();
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			switch (c) {
			case '(':
			case '[':
				parens.push(c);
				break;
			case ')':
			case ']':
				if (parens.isEmpty()) {
					return false;
				} else {
					switch (parens.pop()) {
					case '(':
						if (c != ')') {
							return false;
						}
						break;
					case '[':
						if (c != ']') {
							return false;
						}
						break;
					}
				}
				break;
			}
		}
		return parens.isEmpty();
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
		String output = "";
		String line;
		while ((line = r.readLine()) != null) {
			if (line.equals(".")) {
				break;
			} else {
				if (!output.equals("")) {
					output += "\n";
				}
				output += solve(line) ? "yes" : "no";
			}
		}
		System.out.println(output);
	}

}