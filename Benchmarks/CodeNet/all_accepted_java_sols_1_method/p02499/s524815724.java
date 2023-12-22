import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int[] charvar;
		charvar = new int[256];
		for (int i = 0; i < 256; i ++) charvar[i] = 0;
		while (sc.hasNextLine()) {
			str = sc.nextLine();
			for (int i = 0; i < str.length(); i ++) {
				char ch = Character.toLowerCase(str.charAt(i));
				charvar[ch] ++;
			}
		}
		for (int i = 'a'; i <= 'z'; i ++) {
			System.out.printf("%c : %d\n", i, charvar[i]);
		}
	}
}