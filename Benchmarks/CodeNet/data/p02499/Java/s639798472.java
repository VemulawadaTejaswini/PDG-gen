import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int[] counts = new int['z' - 'a' + 1];
		int c;
		while ((c = System.in.read()) != -1) {
			if ('A' <= c && c <= 'Z') {
				c -= ('A' - 'a');
			}
			if ('a' <= c && c <= 'z') {
				counts[c - 'a']++;
			}
		}
		for (int i = 0; i < counts.length; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append((char) ('a' + i)).append(" : ").append(counts[i]);
			System.out.println(sb.toString());
		}
	}
}