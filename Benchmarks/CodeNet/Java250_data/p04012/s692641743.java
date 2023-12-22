import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] letters = scanner.next().toCharArray();
		int[] exits = new int[26];
		Arrays.fill(exits, 0);
		
		for (int i = 0; i < letters.length; i++) {
			char c = letters[i];
			exits[c-'a']++;
		}
		String ans = "Yes";
		for (int i = 0; i < exits.length; i++) {
			if (exits[i]%2 != 0) {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
		
		scanner.close();
	}
}
