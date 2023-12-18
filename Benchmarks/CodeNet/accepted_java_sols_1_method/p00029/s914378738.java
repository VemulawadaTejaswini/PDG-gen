import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		HashMap<String, Integer> hs = new HashMap<String, Integer>();

		int maxOccured = 0;
		int maxLen = 0;
		String maxOccuredWord = "";
		String maxLenWord = "";

		for (String word : line.split(" ")) {
			if (!hs.containsKey(word)) {
				hs.put(word, 1);
			} else {
				hs.put(word, hs.get(word) + 1);
			}
			// 発生回数と単語を確認して更新
			if (maxOccured < hs.get(word)) {
				maxOccured = hs.get(word);
				maxOccuredWord = word;
			}
			// 文字数と単語を確認して更新
			// 文字数確認済みの単語は確認しない
			if (hs.get(word) == 1 && maxLen < word.length()) {
				maxLen = word.length();
				maxLenWord = word;
			}
		}
		System.out.println(maxOccuredWord + " " + maxLenWord);
	}
}