import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		List<String> wordList = new ArrayList<>();
		int count =0;
		while(sc.hasNextLine()) {
			if (count >= num) {
				break;
			}
			wordList.add(sc.nextLine());
			count++;
		}
		sc.close();
		
		Set<String> usedWordSet = new HashSet<>();
		Character beforeLastWord = null;
		for (String word : wordList) {
			if (usedWordSet.contains(word)) {
				System.out.println("No");
				return;
			}
			usedWordSet.add(word);
			
			if (beforeLastWord == null) {
				beforeLastWord = Character.valueOf(word.charAt(word.length()-1));
				continue;
			}
			Character firstWord = Character.valueOf(word.charAt(0));
			if (!beforeLastWord.equals(firstWord)) {
				System.out.println("No");
				return;
			}
			beforeLastWord = Character.valueOf(word.charAt(word.length()-1));
		}
		System.out.println("Yes");
	}
}