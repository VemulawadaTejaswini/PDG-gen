import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			String T = sc.next();
			int rightPrediction = 0;
			if (S.length() == T.length()) {
				for (int i = 0; i < S.length(); i++) {
					if (S.charAt(i) == T.charAt(i)) {
						rightPrediction++;
					}
				}
			}
			System.out.println(rightPrediction);
		}
	}
}
