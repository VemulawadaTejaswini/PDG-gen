package topics08Character;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex03CountingCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alphabetSize = 'z' - 'a';
		int alphabet = 'a';
		int difference = 'A' - 'a';
		int[] count = new int[alphabetSize + 1];
		ArrayList<String> list = new ArrayList<String>();
		String x;
		String word = "";
			while (true) {
			x = sc.nextLine();
			if (x.equals("")) {
				break;
			}
			list.add(x);
		}
		for (int i = 0; i < list.size(); i++) {
			word += list.get(i);
		}
		char[] c = word.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < alphabetSize; j++) {
				if ((int) c[i] == alphabet + j || (int) c[i] == alphabet + difference + j) {
					count[j]++;
				}
			}
		}
		for (int i = 0; i <= alphabetSize; i++) {
			System.out.println((char) (alphabet + i) + " : " + count[i]);
		}
		sc.close();
	}
}
