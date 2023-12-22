import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] lettrs = scanner.nextLine().toCharArray();
		boolean[] exits = new boolean[26];
		
		for (int i = 0; i < exits.length; i++) {
			exits[i] = false;
		}
		for (int i = 0; i< lettrs.length; i++) {
			exits[lettrs[i]-'a'] = true;
		}
		String ans = "None";
		for (int i = 0; i < exits.length; i++) {
			if (!exits[i]) {
				char c = (char)(i+'a');
				ans = String.valueOf(c);
				break;
			}
		}
		
		System.out.println(ans);
		
		
		scanner.close();

	}

}