import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static class Word implements Comparable<Word>{
		int id;
		String word;
		ArrayList<Integer> page = new ArrayList<Integer>();
		
		Word (int id, String word, int page) {
			this.id = id;
			this.word = word;
			this.page.add(page);
		}

		public int compareTo(Word x) {
			return this.word.compareTo(x.word);
		}
	}
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Word> dict = new ArrayList<Word>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int id;
		
		id = 0;
		while (sc.hasNext()) {
			String word = sc.next();
			int page = sc.nextInt();
			if (map.get(word) == null) {
				map.put(word, id++);
				dict.add(new Word(id, word, page));
			} else {
				Word w = dict.get(map.get(word));
				w.page.add(page);
			}
		}
		Collections.sort(dict);
		for (Word w: dict) {
			Collections.sort(w.page);
			System.out.println(w.word);
			String s = "";
			for (Integer i: w.page) {
				System.out.print(s + i);
				s = " ";
			}
			System.out.println();
		}
	}
}