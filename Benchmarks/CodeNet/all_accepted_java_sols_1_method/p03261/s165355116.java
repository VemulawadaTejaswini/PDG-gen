import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] main) {
		Scanner sc = new Scanner(System.in);
		int numOfWord = Integer.parseInt(sc.nextLine());
		
		Set<String> wordSet = new HashSet<>();
		boolean followTheRules = true;
		String prevEndChar = null;
		for (int i= 0; i < numOfWord; i++) {
			String word = sc.nextLine();
			
			if (wordSet.contains(word)) {
				followTheRules = false;
				break;
			}
			if (prevEndChar != null && !prevEndChar.equals(String.valueOf(word.charAt(0)))) {
				followTheRules = false;
				break;
			}
			prevEndChar = String.valueOf(word.charAt(word.length() -1));
			wordSet.add(word);
		}
		
		String result = followTheRules ? "Yes" : "No";
		System.out.println(result);
	}
}