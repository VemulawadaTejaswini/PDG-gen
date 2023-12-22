import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	String sentence = scan.nextLine();
	String[] words = sentence.split(" ");
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	String word;
	int maxLen = 0, mostFrequently = 0;
	Integer cnt;
	String mostFrequentlyWord = "", maxLenWord = "";
	for (int i = 0; i < words.length; i++) {
	    word = words[i];
	    cnt = map.get(word);
	    if (cnt == null) {
		map.put(word, 1);
		if (maxLen < word.length()) {
		    maxLen = word.length();
		    maxLenWord = word;
		}
	    } else {
		int num = map.put(word, cnt+1) + 1;
		if (mostFrequently < num) {
		    mostFrequently = num;
		    mostFrequentlyWord = word;
		}
	    }
	}
	System.out.println(mostFrequentlyWord + " " + maxLenWord);
    }
}