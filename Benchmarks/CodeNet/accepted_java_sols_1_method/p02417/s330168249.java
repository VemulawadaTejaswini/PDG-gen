import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = null;
		int count[] = new int[26];

		while (sc.hasNext()) {
			str = sc.nextLine();
			str = str.toLowerCase();
			char ch[] = str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (Character.isAlphabetic(ch[i])) {
					int x = ch[i] - 'a';
					count[x]++;
				}
			}
		}

		for (int i = 0; i < count.length; i++) {
			char x = (char) ('a' + i);
			System.out.print(x + " : ");
			System.out.println(count[i]);
		}

	}

}