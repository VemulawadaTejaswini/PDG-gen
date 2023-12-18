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
			
			List<String> wordList = new ArrayList<String>();
			
			for(int i = 0; i < N; i++) {
				String word = in.next();
				wordList.add(word.substring(0, 1));
				wordList.add(word.substring(word.length() - 1, word.length()));
			}
			
			Collections.sort(wordList);
			
			if(check(wordList)) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}
	}
	
	boolean check(List<String> wordList) {
		
		int count = 1;
		String word1 = wordList.get(0);
		for(int i = 1; i < wordList.size(); i++) {
			String word2 = wordList.get(i);
			if(word1.equals(word2)) { 
				count++; 
			} else {
				if(count == 2 || count % 2 != 0) return false;
				word1 = word2;
				count = 1;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new Main.run();
	}
}