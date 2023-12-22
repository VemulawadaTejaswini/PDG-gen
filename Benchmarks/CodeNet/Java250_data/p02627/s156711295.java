import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		char p = s.charAt(0);
		String t = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < 26; i++) {
			if (t.charAt(i) == p) {
				System.out.println('A');
			}
		}
		for (int i = 26; i < 52; i++) {
			if (t.charAt(i) == p) {
				System.out.println('a');
			}
		}
		kb.close();
	}

}
