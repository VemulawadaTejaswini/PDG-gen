

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String w = sc.next();
		String last = w.substring(w.length() - 1, w.length());
		HashMap<String, String> wordList = new HashMap<String, String>();
		String ans = "Yes";
		wordList.put(w, w);

		for (int i = 1; i < n; i++) {
			w = sc.next();
			if (!last.equals(w.substring(0, 1)))
				ans = "No";
			if (wordList.containsKey(w))
				ans = "No";
			else
				wordList.put(w, w);
			last = w.substring(w.length() - 1, w.length());
		}
		System.out.println(ans);

	}

}
