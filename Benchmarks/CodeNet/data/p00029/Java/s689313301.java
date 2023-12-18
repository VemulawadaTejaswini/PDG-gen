import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		Map<String, Integer> map = new HashMap<String, Integer>();
		try {
			sc = new Scanner(System.in);
			String maxFrequencyWord = null;
			String maxLengthWord = null;

			while (sc.hasNextLine()) {
				String[] sentence = sc.nextLine().split(" ");
				for (String s : sentence) {
					map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
				}

				int maxFrequency = Collections.max(map.values());
				int maxLength = 0;

				for (Map.Entry<String, Integer> entry : map.entrySet()) {
					if (maxFrequency == entry.getValue()) {
						maxFrequencyWord = entry.getKey();
					}
					if (maxLength < entry.getKey().length()) {
						maxLength = entry.getKey().length();
						maxLengthWord = entry.getKey();
					}
				}
				System.out.println(maxFrequencyWord + " " + maxLengthWord);
				map.clear();
			}

		} finally {
			sc.close();
		}
	}
}