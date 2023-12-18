import java.util.Scanner;

class ABC {
	public static boolean upper(char ch) {
		return 'A' <= ch && ch <= 'Z';
	}
	public static boolean lower(char ch) {
		return 'a' <= ch && ch <= 'z';
	}
	public static boolean alphabet(char ch) {
		return ABC.upper(ch) || ABC.lower(ch);
	}
	public static char toLower(char upper) {
		return (char)(upper - ('A' - 'a'));
	}
	public static int getIndex(char lower) {
		return lower - 'a';
	}
	public static char getAlpha(int index) {
		return (char)((int)'a' + index);
	}
}

public class Main {
	public static void main(String[] args) {
		int alsize = 26;
		int count[] = new int[alsize];
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String token = (String)sc.next();
			for (int i = 0; i < token.length(); ++i) {
				char ch = token.charAt(i);
				if (!(ABC.alphabet(ch)))
					continue;
				if (ABC.upper(ch))
					ch = ABC.toLower(ch);
				count[ABC.getIndex(ch)] += 1;
			}
		}
		for (int i = 0; i < alsize; ++i)
			System.out.println(ABC.getAlpha(i) + " : " + count[i]);
	}
}
