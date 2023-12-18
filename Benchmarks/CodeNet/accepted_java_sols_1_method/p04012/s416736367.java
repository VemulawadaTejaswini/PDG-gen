import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		boolean judge = true;

		char[] inputChar = input.toCharArray();
		Integer[] alphabet = new Integer[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = 0;
		}
		for (int i = 0; i < inputChar.length; i++) {
			alphabet[(int) inputChar[i] - 97] += 1;
		}
		for (int i : alphabet) {
			if (i % 2 == 1) {
				judge = false;
			}
		}
		if (judge) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
}
