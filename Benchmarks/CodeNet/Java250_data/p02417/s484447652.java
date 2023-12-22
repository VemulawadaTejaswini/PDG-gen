import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] count = new int[26];

		while(sc.hasNext()) {
			String input = sc.nextLine();
			String tmp = input.toLowerCase().replace(" ", "");

			for(char c : tmp.toCharArray()) {
				if('a' <= c && c <= 'z') {
					count[(int)c - (int)'a']++;
				}
			}
		}
		sc.close();

		for (int i = 0; i < 26; i++) {
			char now = (char)( (int)'a' + i );

			System.out.println(now + " : " + count[i]);
		}
	}
}