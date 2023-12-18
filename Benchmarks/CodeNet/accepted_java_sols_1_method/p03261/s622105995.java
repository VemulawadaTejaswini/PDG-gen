import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		String word = null;
		String prevWord = null;
		Set<String> wordSet = new HashSet<>();
		boolean failed = false;
		while (sc.hasNextLine()) {
			word = sc.nextLine();
			if (!wordSet.add(word)) {
				failed = true;
				break;
			}
			if (prevWord != null) {
				boolean chained = (prevWord.charAt(prevWord.length() - 1) == word.charAt(0));
				if (!chained) {
					failed = true;
					break;
				}
			}
			prevWord = word;
		}
		System.out.println(failed ? "No" : "Yes");
	}
}