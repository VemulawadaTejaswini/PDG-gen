
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Alphabet = "abcdefghijklmnopqrstuvwxyz";
//		System.out.println(a.charAt(index));
		String ans = "";
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		for (int i = 0; i < s.length(); i++) {
			if (Alphabet.contains(String.valueOf(s.charAt(i)))) {
				ans += 'x';
			}
		}
		System.out.println(ans);
		kb.close();
	}

}
