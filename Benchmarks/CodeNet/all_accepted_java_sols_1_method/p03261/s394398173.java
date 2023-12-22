import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		List<String> words = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			words.add(in.nextLine());
		}
		boolean valid = true;
		Set<String> saidWords = new HashSet<>();
		saidWords.add(words.get(0));
		for (int i = 1; i < N; ++i) {
			String prevWord = words.get(i - 1);
			String currentWord = words.get(i);
			if (saidWords.contains(currentWord)) {
				valid = false;
				break;
			}
			if (prevWord.charAt(prevWord.length() - 1) != currentWord.charAt(0)) {
				valid = false;
				break;
			}
			saidWords.add(currentWord);
		}
		if (valid) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		in.close();
	}

}