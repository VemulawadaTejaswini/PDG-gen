import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		
		String max = "";
		while (sc.hasNext() == true) {
			String word = sc.next();
			
			if (max.length() < word.length()) max = word;
			
			if (words.containsKey(word)) {
				words.put(word, (words.get(word) + 1));
			} else {
				words.put(word, 1);
			}
		}
		
		String maxf = "";
		for (String key : words.keySet()) {
			if (maxf.equals("") == false) {
				if (words.get(maxf) < words.get(key)) maxf = key;
			} else {
				maxf = key;
			}
		}
		System.out.println(maxf + " "  + max);
	}
}