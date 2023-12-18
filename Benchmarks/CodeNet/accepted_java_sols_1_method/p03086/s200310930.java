import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int answer = 0;
		int maxAnswer = 0;

		S = S.replace('A', '@');
		S = S.replace('C', '@');
		S = S.replace('G', '@');
		S = S.replace('T', '@');

		for (int i = 0; i < S.length(); i ++) {
			String target = String.valueOf(S.toCharArray()[i]);
			if (target.equals("@")) {
				answer++;
			} else {
				maxAnswer = Math.max(maxAnswer, answer);
				answer = 0;
			}
		}
		maxAnswer = Math.max(maxAnswer, answer);
		System.out.println(maxAnswer);
	}
}
