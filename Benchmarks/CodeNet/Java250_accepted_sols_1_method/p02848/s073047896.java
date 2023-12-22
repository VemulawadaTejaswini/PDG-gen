import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// N, Sの入力
		int N = sc.nextInt();
		String S = sc.next();
		
		// 結果の出力
		char[] charArray = S.toCharArray();
		for(char c : charArray) {
			char[] character;
			if (c + N > 'Z') {
				character = Character.toChars(c + N - 'Z' + 'A' - 1);
				System.out.print(character);
			}
			else {
				character = Character.toChars(c + N);
				System.out.print(character);
			}
		}
		
		sc.close();
	}
}
