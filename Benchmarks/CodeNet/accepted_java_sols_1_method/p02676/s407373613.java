import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int K = scn.nextInt();
			String S = scn.next();

			if(S.length() <= K) {
				System.out.println(S);
			} else {
				System.out.println(S.substring(0, K) + "...");
			}

		}
	}
}