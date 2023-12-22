import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = sc.next();
		StringBuilder sb = new StringBuilder();
		while (!word.equals("-")) {
			int m = sc.nextInt();
			String shuffleWord;
			sb.append(word);
			for (int i = 0; i < m; i++) {
				int h = sc.nextInt();
				shuffleWord = sb.substring(0, h);
				sb.delete(0, h);
				sb.append(shuffleWord);
			}
			System.out.println(sb.toString());
			sb.setLength(0);
			word = sc.next();
		}
	}
}
