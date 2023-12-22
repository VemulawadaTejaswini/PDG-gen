import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();

		sc.close();

		int result = T.length();

		for (int i = 0; i < S.length() - T.length() + 1; i++) {
			String SS = S.substring(i, T.length() + i);
			int temp = 0;
			for (int j = 0; j < T.length(); j++) {
				if (SS.charAt(j) != T.charAt(j)) {
					temp++;
				}
			}
			if (temp < result) {
				result = temp;
			}
		}

		System.out.print(result);
	}

}
