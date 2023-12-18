import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] S = in.next().toCharArray();
		StringBuilder sb = new StringBuilder();
		sb.append(S[0]);
		for (int i = 1; i < S.length; i++) {
			if (S[i] != sb.charAt(sb.length() - 1)) {
				sb.append(S[i]);
			}
		}
		System.out.println(sb.length() - 1);
		in.close();
	}
}