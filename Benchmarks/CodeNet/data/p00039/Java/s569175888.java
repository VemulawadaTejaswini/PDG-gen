import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	static Map<Character, Integer> ROMAN_NUMERALS = new HashMap<Character, Integer>();;

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);

			if (ROMAN_NUMERALS.isEmpty()) {
				createRomanNumerals(ROMAN_NUMERALS);
			}

			while (sc.hasNextLine()) {
				char[] roman = sc.nextLine().toCharArray();
				int[] arabia = new int[roman.length];
				for (int i = 0; i < roman.length; i++) {
					arabia[i] = ROMAN_NUMERALS.get(roman[i]);
				}

				int sum = 0;
				for (int i = 1; i < arabia.length; i++) {
					if (arabia[i] > arabia[i - 1]) {
						sum -= arabia[i - 1];
					} else {
						sum += arabia[i - 1];
					}
				}
				sum += arabia[arabia.length - 1];
				System.out.println(sum);
			}

		} finally {
			sc.close();
		}
	}

	public static void createRomanNumerals(Map<Character, Integer> map) {
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}
}