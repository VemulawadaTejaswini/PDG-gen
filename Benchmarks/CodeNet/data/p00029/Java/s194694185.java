import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	if (!sc.hasNext()) {
	    System.exit(0);
	}
	String[] words = sc.nextLine().split(" ");

	int often = 0;
	Map<String, Integer> wordMap = new HashMap<>();

	for (String word : words) {
	    cycleList(wordMap, word);
	}
	outOftenWord(wordMap);
	System.out.print(" ");
	outMaxLengthWord(wordMap);

    }

    private static void cycleList(Map<String, Integer> map, String word) {
	boolean isThere = false;
	for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
	    if (entrySet.getKey().equals(word)) {
		map.put(word, entrySet.getValue() + 1);
		isThere = true;
	    }
	}

	if (!isThere) {
	    map.put(word, 1);
	}
    }

    private static void outMaxLengthWord(Map<String, Integer> map) {
	String maxWord = "";
	for (String word : map.keySet()) {
	    if (word.length() > maxWord.length()) {
		maxWord = word;
	    }
	}

	System.out.print(maxWord);
    }

    private static void outOftenWord(Map<String, Integer> map) {
	String oftenWord = "";
	int count = 0;

	for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
	    if (entrySet.getValue() > count) {
		count = entrySet.getValue();
		oftenWord = entrySet.getKey();
	    }
	}

	System.out.print(oftenWord);
    }
}