import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	void run() {

		Scanner in = new Scanner(System.in);

		while(true) {

			int N = Integer.parseInt(in.next());
			
			if (N == 0) break;
			
			List<String> wordList1 = new ArrayList<String>();
			List<String> wordList2 = new ArrayList<String>();
			
			for(int i = 0; i < N; i++) {
				String word = in.next();
				wordList1.add(word.substring(0, 1));
				if (word.length() == 1) {
					wordList2.add(word.substring(0, 1));
				} else {
					wordList2.add(word.substring(word.length() - 1, word.length()));
				}
			}
			
			Collections.sort(wordList1);
			Collections.sort(wordList2);
			
			boolean res = check(wordList1, wordList2);
			System.out.println(res ? "OK" : "NG");
		}
	}
	
	boolean check(List<String> wordList1, List<String> wordList2) {

		for(int i = 0; i < wordList1.size(); i++) {
			String word1 = wordList1.get(i);
			String word2 = wordList2.get(i);
			if(!word1.equals(word2)) { 
				return false; 
			} 
		}
		return true;
	}

	public static void main(String[] args) {
		new Main().run();
	}

}