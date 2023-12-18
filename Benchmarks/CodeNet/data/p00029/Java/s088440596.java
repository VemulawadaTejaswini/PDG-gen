import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		Map<String, Integer> map = new TreeMap<String, Integer>();
		try {
			sc = new Scanner(System.in);
			String[] sentence = sc.nextLine().split(" ");

			int maxFrequency = 0;
			int maxLength = 0;
			String maxFrequencyWord = "";
			String maxLengthWord = "";
			for (String s : sentence) {
				map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
				if (maxFrequency < map.get(s)) {
					maxFrequency = map.get(s);
					maxFrequencyWord = s;
				}
				if (maxLength < s.length()) {
					maxLengthWord = s;
				}
			}

			System.out.println(maxFrequencyWord + " " + maxLengthWord);

		} finally {
			sc.close();
		}
	}
}