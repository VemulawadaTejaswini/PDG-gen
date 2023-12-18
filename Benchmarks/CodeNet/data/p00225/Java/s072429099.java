import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	void run() {
		
		Scanner in = new Scanner(System.in);
		
		HashMap<String, List<String>> word_map = new HashMap<String, List<String>>();
		
		while(true) {
			
			int N = Integer.parseInt(in.next());

			if (N == 0) break;

			String first_word = in.next();

			for(int i = 0; i < N - 1; i++) {
				
				String word = in.next();
				String st = word.substring(0, 1);
				setWordMap(word_map, st, word);
				
			}
			
			int first_wordLength = first_word.length();
			String first_st = first_word.substring(0, 1);
			String first_en = first_word.substring(first_wordLength - 1, first_wordLength);
			String getWord = getWordMap(word_map, first_en, first_word);
			String getWord_en = getWord.substring(getWord.length() - 1, getWord.length());
			
			if(first_st == getWord_en) {
				System.out.println("OK");
			} else {
				System.out.println("NO");
			}
		}
	}
	
	String getWordMap(HashMap<String, List<String>> word_map, String en, String word) {
		
		String getWord = "";

		List<String> mapList = new ArrayList<String>();
		if(!word_map.containsKey(en)) {
			return word;
		}
		mapList = word_map.get(en);

		if(mapList.isEmpty()) {
			word_map.remove(en);
		} else {
			getWord = mapList.get(0);
			mapList.remove(0);
			if(mapList.isEmpty()) {
				word_map.remove(en);
			} else {
				word_map.put(en, mapList);
			}
		}

		String en_getWord = getWord.substring(getWord.length() - 1, getWord.length());
		return getWordMap(word_map, en_getWord, getWord);
	}
	
	void setWordMap(HashMap<String, List<String>> word_map, String st, String word) {
		List<String> wordList;
		if(word_map.containsKey(st)) {
			wordList = word_map.get(st);
			wordList.add(word);
			word_map.put(st, wordList);
		} else {
			wordList = new ArrayList<String>();
			wordList.add(word);
		}
		word_map.put(st, wordList);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}