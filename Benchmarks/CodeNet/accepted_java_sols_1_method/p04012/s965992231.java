import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String keyBoard = sc.next();
		int inputSize = keyBoard.length();
		boolean beautifulFlag = true;

		List<String> wordList = new ArrayList<String>();

		for (int i = 0; i < inputSize; i++) {
			wordList.add(keyBoard.substring(i, i+1));

		}

		Collections.sort(wordList);

		for (int i = 0; i < wordList.size(); i++) {
			String word = wordList.get(0);

			int wordCount = wordList.lastIndexOf(word) + 1;

			if (wordCount % 2 != 0) {
				System.out.println("No");
				beautifulFlag = false;
				break;
			}

			for (int j = 0; j < wordCount; j++) {
				wordList.remove(0);
			}
		}

		if (beautifulFlag) {
			System.out.println("Yes");

		}

		sc.close();
	}
}
