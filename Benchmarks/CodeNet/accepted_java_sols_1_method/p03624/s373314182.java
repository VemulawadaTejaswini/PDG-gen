import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String S = reader.next();
		String str = "abcdefghijklmnopqrstuvwxyz";
		String ans = "None";
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			str = str.replace(Character.toString(ch), "");
		}
		if (str.length() > 0) {
			ans = Character.toString(str.charAt(0));
		}

		System.out.println(ans);
		reader.close();
	}


}



