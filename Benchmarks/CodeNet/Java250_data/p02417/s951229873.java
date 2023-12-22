import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		// map????????????
		Map<Character, Integer> answer = new HashMap<Character, Integer>();
		char[] keyList = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for (char key : keyList) {
			answer.put(key, 0);
		}
		String input;
		while ((input = br.readLine()) != null) {
			char[] list = input.toLowerCase().toCharArray();

			for(char character : list) {
				if (answer.containsKey(character)) {
					answer.put(character, answer.get(character) + 1);
				}
			}
		}

		for (char character : keyList) {
			System.out.println(character + " : " + answer.get(character));
		}
	}
}