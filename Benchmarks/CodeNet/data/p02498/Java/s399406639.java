
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	private static class List extends LinkedList<long[]> {
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if ('A' <= c && c <= 'Z') {
				System.out.print((char) (c - 'A' + 'a'));
			} else if ('a' <= c && c <= 'z') {
				System.out.print((char) (c - 'a' + 'A'));
			} else {
				System.out.print(c);
			}
		}
		System.out.println();
	}
}