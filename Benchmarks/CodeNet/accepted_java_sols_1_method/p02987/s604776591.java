import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char c;
		boolean isEven = true;

		LinkedHashMap<Character,Integer> countWord = new LinkedHashMap<Character,Integer>();

		for(int i = 0;i < word.length();i++) {
			c = word.charAt(i);
			if(countWord.containsKey(c)) {
				countWord.put(c, countWord.get(c)+1);
			} else {
				countWord.put(c,1);
			}
		}

		for(int num : countWord.values()){
			if(num!=2) {
				isEven = false;
			}
		}

		if(isEven) {
			System.out.println("Yes");
		} else {

			System.out.println("No");
		}
	}
}