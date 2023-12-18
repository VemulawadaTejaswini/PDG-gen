import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[26];
		String str = sc.nextLine();
		sc.close();
		str = str.toLowerCase();
		char a = 'a', c;
		for (int i=0; i< str.length(); i++) {
			c = str.charAt(i);
			// JRE1.7??\??? Character.isAlphabetic??則???ok
			if (Character.isLetter(c)) {
				int num = c - a;
				number[num]++;
			}
		}
		for (int i=0; i <= ('z' - 'a'); i++) {
			System.out.println(new StringBuilder().append(a++).append(" : ").append(number[i]).toString());
		}
	}
}