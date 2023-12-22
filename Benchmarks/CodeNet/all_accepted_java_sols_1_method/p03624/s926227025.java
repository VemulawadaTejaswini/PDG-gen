import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] input = sc.next().toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < alphabet.length; i++) {
			map.put(alphabet[i], 0);
		}
		for (char i : input) {
			int value = map.get(i);
			map.put(i, ++value);
		}
		for (int i = 0; i < alphabet.length; i++) {
			if (map.get(alphabet[i]) == 0) {
				System.out.println(alphabet[i]);
				return;
			}
		}
		System.out.println("None");
	}
}
