import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		String words[] = new String[n];
		for(int i= 0; i < n; i++) {
			String word = scan.next();
			if(Arrays.asList(words).contains(word)) {
				System.out.println("No");
				return;
			}
			words[i] = word;
		}
		scan.close();


		/*
		Map<String, Boolean> wordCounter= new HashMap<String, Boolean>();

		for(int i =0; i < n; i++) {
			if(wordCounter.containsKey(words[i])){
				System.out.println("No");
				return;
			}else {
				wordCounter.put(words[i], true);
			}
		}
		*/

		String endWord = words[0].substring(words[0].length()-1, words[0].length());
		for(int i = 1; i< n;i++) {
			String startWord = words[i].substring(0, 1);
			if(endWord.equals(startWord)) {
				endWord =  words[i].substring(words[i].length()-1, words[i].length());
			}else {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
		return;
	}
}
