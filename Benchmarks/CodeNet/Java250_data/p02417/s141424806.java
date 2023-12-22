import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] answer = new int[26];
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			String S = scanner.nextLine();
			S = S.toLowerCase();
			for(int i=0;i<S.length();i++) {
				if ('a'<=S.charAt(i)&&S.charAt(i)<='z') {
					answer[S.charAt(i)-'a']++;
				}
			}
			if (S.equals("")) {
				break;
			}
		}
		scanner.close();
		for(int i=0;i<26;i++) {
			System.out.println((char)(i+'a') + " : " + answer[i]);
		}
	}
}
